package com.github.j0nesma.esg;

import java.nio.file.Path;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.io.FileSystemResource;

import com.github.j0nesma.esg.utils.CSVReader;
import com.github.j0nesma.esg.utils.CustomerPopulator;

@SpringBootApplication
public class EsgApplication implements CommandLineRunner {

    Logger logger = LoggerFactory.getLogger(CSVReader.class);

	@Autowired
	private CustomerPopulator customerPopulator;

    @Value("${csvfile}")
    private String csvFilePath;

    public static void main(String[] args) {
        SpringApplication.run(EsgApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		String absolutePath = new FileSystemResource("").getFile().getAbsolutePath();
		logger.debug("csvFile = " + csvFilePath);
		Path path = Path.of(absolutePath + "/" + csvFilePath);
		customerPopulator.populate(path);
    }

}
