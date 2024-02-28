# BDD Framework with Java, TestNG, Maven, and Cucumber

This framework provides a structured approach to implement Behavior-Driven Development (BDD) tests using Java, TestNG, Maven, and Cucumber. It enables writing test scenarios in a human-readable format and executing them with TestNG, while leveraging Maven for dependency management and build automation.

## Features

- **Behavior-Driven Development (BDD):** Write test scenarios in plain text using Gherkin syntax.
- **TestNG Integration:** Execute tests using the TestNG testing framework for parallel execution and reporting capabilities.
- **Maven:** Simplify dependency management and build lifecycle with Maven.
- **Cucumber:** Utilize Cucumber for expressing scenarios and feature files in a human-readable format.

## Setup

1. **Prerequisites:**
   - Java Development Kit (JDK) installed (version 17)
   - Apache Maven installed (version 3.0 or higher)
   - TestNG plugin installed in your IDE (if using an IDE)
   - if using IDE , Intellij IDE

2. **Clone the Repository:**
   ```bash
   git clone https://github.com/MHDRADI1993/assessment-test.git

## build the project 
  cd {path of the BDD framework} after clone
  mvn clean install 

## Usage 
1. Writing Tests:
   - Write feature files in the src\test\java\ui directory using Gherkin syntax.
   - Implement step definitions in Java under \src\test\java\steps
  
2. Running Tests:
   - Execute tests using Maven: mvn test
   - Execute the TestNG.xml file directly, so will trigger the test runners classes

## Structure

├── Report/

├── src/

│   ├── main

│   │   ├── java/   #(source files)

│   │   └── resources/  #(resource files)

│   └── test/

│       ├── java/

│       │   └── steps packages/

│       │       └── steps definition classes  #(features steps classes and the hooks class that contain the tags needed like @before or @after ,.... for each test cases execution)

|       |    └── bases classes/

│       │       └── basses classes definition  #(define the business classes , the common classes that interact with the web elements)

|       |    └── bases setup package/

│       │       └── setup.java    #(initialize the framework and the web driver for multiple browsers)

|       |       └── utils.java   #(support class contain helper functions definition)

|       |    └── config package/

│       │       └── config_file.properties  #(define the url for the web application with the report path)

|       |    └── runners package/

│       │       └── runners file definition   #(define which feature file to be executed and the tag name with the steps defenition path)

|       |    └── ui features/

│       │       └── features files  #(contain the scenario declaration using gherkins )

│       └── resources/

│               
├── pom.xml         #(define the maven dependencies)

└── Main TC.xlxs    #(contain the main test cases for automation)

└── Test Data.xlxs   #(contain test data for the test cases if needed )

└── TestNg.xml     #(TestNG configuration file to run using testng and define which testrunner class to be executed )



## Notes 
1. for Read excel data , you can find the function for get the excel data in Utils class with all the calls needed in the setup class for that data-driven testing.
2. for each browser web driver , there is test runner targeting the tag defined in the feature file , so we need to un-comment the call for the test runner in tetng.xml file ,  before run the framework if we need to run on multiple browser
3. after the execution is completed , you can find the results in the Report/ with screen shoots attached to each test case 
  

