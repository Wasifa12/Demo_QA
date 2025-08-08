# Java, Cucumber Selenium Login Automation
This project automates login functionality using:
•	**Java**
•	**Selenium WebDriver**
•	**Cucumber BDD**
•	**Maven**
•	**JUnit/TestNG**

## 📂 Project Structure
src/main/java
 pages
•	BasePage.java  # common selenium methods
•	LoginPage.java # locators and actions to automate the web application
Utils 
•	Driver Factory #browser initialization
src/test/resources 
•	Features
         #   login.feature (Feature File)
•	Runner class
        #testRunner    Start of the program
•	Stepdefinitions
         LoginSteps    Stepdefinition classes
              
pom.xml # Maven dependencies
target # Compiled code and test reports


## ⚙️ Setup Instructions
1. Clone this repository 
   git clone https://github.com/Wasifa12/Demo_LarkLabs.git
2. Import into Eclipse as a Maven Project. Then,
3. Right-click the Runner class → Run As → JUnit Test
   
📊 Reports
After execution, find reports in:
•	target/cucumber-html-report/index.html (HTML)
