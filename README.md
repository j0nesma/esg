# esg

Test for esg

## Getting Started

**Prerequisites**

```bash
Java 17
Maven 3.8.1
```

1. Build the project this will also run the tests
    ```base
    ./mvnw clean install
    ```
1. Run the application
    ```base
    ./mvnw spring-boot:run
    ```
    1. At start up the code will populate the database with the CSV provided this happens in esgApplicationTests and uses the customer populator

This application will pick up the "test-data.csv" file from the /src directory to change this. go to /resources/application.properties

Test should hightlight the working areas of the code.
I have tested with, SpringBootTest, MockMvc and Junit

I have tried to build this in a way that it is scaleable and able to developed on over time.

Things to add over time:
- Validation to the Customer model with business defined cases I would use [This](https://www.baeldung.com/spring-boot-bean-validation)
- Custom Error Handling for failure cases
- SwaggerDoc


----

For the coding kata the code is contained in /kata/StringCalculator.java and tested in /kata/StringCalculatorTest.java

I attempted and achieved this result in 30 mins.

Kata Instructions
```
This kata is designed to help you learn test-first coding and refactoring. To that end, try not to read ahead or guess what the next requirements might be. Work incrementally, and complete as many steps as you can in a 30 minute period. Continue trying the kata from scratch, until you can complete it entirely within 30 minutes.

Steps

1. Create a StringCalculator with a method Add(string numbers) that returns an integer.

i. Start with the simplest test case of an empty string, then 1 number, then 2.

ii. Solve things as simply as possible!

iii. An empty string should return a sum of 0.

iv. numbers can include 0, 1, or 2 integers (e.g. "", "1", "1,2").

v. Add returns the sum of the integers provided in the string numbers.

vi. Remember to refactor after each test.

2. Allow the Add method to handle an unknown number of numbers (in the string).

3. Allow the Add method to handle new lines between numbers (as well as commas):

i. Example: "1\n2,3" returns 6.

ii. Example: "1,\n" is invalid, but no need to test for it. For this kata we are only concerned with testing correct inputs.

4. Allow the Add method to handle a different delimiter:

i. To change the delimiter, the beginning of the string should be a separate line formatted like this: "//[delimiter]\n[numbers]"

ii. Example: "//;\n1;2" returns 3 (the delimiter is ";").

iii. This first line is optional; all existing scenarios (using "," or "\n") should work as before.

5. Calling Add with a negative number will throw an exception "Negatives not allowed: " and then listing all negative numbers that were in the list of numbers.

i. Example: "-1,2" throws "Negatives not allowed: -1".

ii. Example: "2,-4,3,-5" throws "Negatives not allowed: -4,-5".

6. Numbers greater than 1000 should be ignored.

i. Example: "1001,2" returns 2.

7. Delimiters can be any length, using this syntax: "//[|||]\n1|||2|||3" returns 6.

8. Allow multiple delimiters, using this syntax: "//[|][%]\n1|2%3" returns 6.

9. Handle multiple delimiters of any length.
```