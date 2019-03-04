# UIFramework
UI Test Automation Framework is created using Selenium Webdriver, Java, TestNG, Maven, POM

To run a specific Test case, 
1. In testng.xml, change the class name value to that of Test class
eg. if you want to generate results for "TC2_FillContactFormTest" test case, put
class name="com.Tests.TC2_FillContactFormTest"
2. then, in command line, execute
mvn test
