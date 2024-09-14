# Company Social Media Checker

## Overview

Company Social Media Checker is a Spring Boot application designed to identify and check the activity status of social media pages associated with a given company. The application supports platforms such as Facebook, Twitter, LinkedIn, Instagram, and YouTube. It uses RESTful APIs for querying social media data.

## Features

Identify social media pages for a given company.
Check if the pages have posted within the last six months.
RESTful API endpoints for querying social media page information.

## Prerequisites

Before running the application, ensure you have the following installed:

- Java 17 or higher
- Maven 3.6 or higher
- Postman (Optional for manual API testing)


## Running the Application

### Clone the Repository

```bash
git clone https://github.com/Rohit9050/company-social-media-checker.git
cd  company-social-media-checker
```

### Build the Project
Use Maven to build the project and install dependencies:

```bash
mvn clean install
```
### Run the Application
After the build is complete, run the application:

```bash
mvn spring-boot:run
```
The application will start and run on http://localhost:8081 by default.


## Sample CURL Commands
Here are a few sample CURL commands for testing the API:

### Find Social Media Pages for a Company
```bash
curl -X 'GET' \
 'http://localhost:8080/findSocialMediaPages?companyName=Microsoft' \
 -H 'accept: */*'
```

## Technologies Used
Spring Boot for building the application
Maven for dependency management
Jsoup for web scraping and analyzing social media pages


## Jsoup Dependency
Ensure that the pom.xml file contains the Jsoup dependency:
	
  	<dependency>
			<groupId>org.jsoup</groupId>
			<artifactId>jsoup</artifactId>
			<version>1.17.2</version>
		</dependency>

## Contact Information
For any questions or support, feel free to reach out via rohitthakran2525@gmail.com.
