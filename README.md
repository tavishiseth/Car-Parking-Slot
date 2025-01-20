# Car Parking Slot Application

## Prerequisites

Before you begin, ensure you have the following installed:

1. **Java 8**  
   You can download and install Java 8 from the [official Oracle website](https://www.oracle.com/java/technologies/javase/javase-jdk8-downloads.html).

2. **Maven**  
   Download and install Maven from the [official Maven website](https://maven.apache.org/download.cgi).

## Running the Application

Follow these steps to run the application:

### 1. Set up and Start the PayPal App

1. Open **PowerShell** and navigate to the `PayPalApp` directory:

   ```bash
   cd Car-Parking-Slot-main\Car-Parking-Slot-main\PayPalApp
   ```

2. Clean and install the project using Maven:

   ```bash
   mvn clean install
   ```
3. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run -e
   ```
### 2. Set up and Start the Car Parking Solution App

1. Open a second PowerShell window and navigate to the `CarParkingSolutionApp` directory:

   ```bash
   cd Car-Parking-Slot-main\Car-Parking-Slot-main\CarParkingSolutionApp
   ```

2. Clean and install the project using Maven:

   ```bash
   mvn clean install
   ```
3. Run the Spring Boot application:

   ```bash
   mvn spring-boot:run -e
   ```

### 3. Access the Application

   Once both applications are running, open your web browser and go to:

   ```bash
   http://localhost:8080
   ```
   

## Technologies Used
1. Back End: 
Java framework used - Spring Boot  
• Spring Boot provides Java developers with a platform to get started with an auto 
configurable production-grade Spring application.  
• It focuses on providing flexibility through its dependency injection feature.  
2. Front End:  
User interface developed using - HTML, CSS, JS  
• HTML provides the basic structure of sites, which is enhanced and modified by other 
technologies like CSS and JavaScript.  
• CSS is used to control presentation, formatting, and layout.  
• JavaScript is used to control the behavior of different elements.  
3. Database used:  
Data connectivity implementation - H2 Console, the Java SQL database (JDBC API)  
• H2 is an embedded, open-source, and in-memory database.  
• It is a relational database management system written in Java.  
• It is a client/server application.  
4. Web application hosted locally on - Apache Tomcat Server (http://localhost:8080/)  

## Project Overview:
Nowadays while traveling to a new place or traveling for shopping or traveling to crowded laces the main problem people face is where to park their four-wheeler safely.  
So, assume there is a company Car Parking Solutions which came up with an idea to solve this problem by booking the parking slots beforehand while traveling to the concerned place.  
They also have workers who provide additional benefits to users who park their four-wheelers in their parking slots by dry cleaning, car-washing and also do check for any repairs in the concerned parking time.  
They need you to create a beautiful online car parking slot booking web application.  
This application should enable the users to book the parking slot beforehand while traveling to any shopping malls, tourist spots, markets, pilgrim centers especially crowded places.  
The following functionalities should be supported by the application.  

## Website Walkthrough  
### Module 1 - Login and Signup  
![image](https://github.com/user-attachments/assets/d6bb06ed-6867-4263-81cc-9d82ff0ba736)
![image](https://github.com/user-attachments/assets/f0e15555-aca1-4941-bc45-7a70340db299)


This is the landing page for our website.    
It provides the option to sign up for a new account or 
login into an existing account using email and password credentials or Google based 
authentication.  
All these details are maintained in the database at regular intervals.  
a) Admin User can sign in through his credentials - email "admin@gmail.com" and password "123456":  
![image](https://github.com/user-attachments/assets/c9025695-7ada-419b-ad52-6790883922d9)


b) A new customer can register himself by providing his details - first name, last name, 
unique email address and password (or) he can sign in through his google account.  
Registering with a new account with the details mentioned below.  
![image](https://github.com/user-attachments/assets/5cc6eac5-d7e8-474b-bfe7-19e93752d78f)

### Module 2 – Creating Dashboard  
For this module, there is a facility of role-based authentication for roles of user and admin.  
Admin has the power to add, remove, view, update the information about workers, parking 
spaces, and parking locations.   
The user can view the available parking spaces for a particular location based on time slot, date, 
and vehicle type.  


a) Admin Dashboard (can be accessed by clicking on top left icon)  
![image](https://github.com/user-attachments/assets/be5df77a-f9cf-473c-834b-dd095ed9f3a4)


Managing Workers: Admin can add or remove workers.  
![image](https://github.com/user-attachments/assets/ecaf0986-e0de-4943-b81b-47a4cbf3220d)


Adding a worker named T1:  
![image](https://github.com/user-attachments/assets/210d451b-9b41-4242-804d-ba6b17926a28)


At serial number 7, the new worker T1 is added.  
![image](https://github.com/user-attachments/assets/ab19e808-3431-4ef1-9991-1fffb9e4d2bf)


Removing/updating a worker:  
![image](https://user-images.githubusercontent.com/75008683/146672857-bd4fe7cf-388e-4197-8a71-448785c0bcfd.png)


The worker previously at serial number 6 has been removed as shown below.  
![image](https://github.com/user-attachments/assets/93bfaa25-ea49-4830-ad57-5d96c62eab68)

b) User Dashboard  


User can select car parking space and parking slots according to their preferred location.  
![image](https://github.com/user-attachments/assets/90cdbd33-c880-4cca-9349-7b47e4ab29e8)


User can view the details of their chosen parking spaces and parking slots.  
![image](https://github.com/user-attachments/assets/1715ee90-3592-4dc9-8227-bbe4fddaf3a2)


### Module 3 - Managing Parking Spaces  
The powers of the admin to modify the parking spaces, locations and slots are shown below.  

1) Admin can edit/view/list all the parking spaces:


![image](https://github.com/user-attachments/assets/44defbca-5254-487b-9ffa-60a81bedd7a6)


Adding L&T_P02 Parking space.  
![image](https://github.com/user-attachments/assets/c9582846-552e-41c5-9d97-78131acbd0b6)


Removing Parking space ID: Sujana_P04.  
![image](https://github.com/user-attachments/assets/86d2eee3-fa4a-44ad-a07e-0fe92bbd728d)
![image](https://github.com/user-attachments/assets/ad5db27c-b0aa-4ab3-b7f2-76a7e9be7f27)


Updating L&T_P01’s vehicle type to “LARGE”.  
![image](https://github.com/user-attachments/assets/de883be1-af04-48f3-acde-a7ac38ef5944)


2) Managing Locations:


![image](https://github.com/user-attachments/assets/2c45e425-ec8e-49c7-9cad-aa9f83f169e6)


Adding a location named “5-Star Mall”.  
![image](https://github.com/user-attachments/assets/ba6eaf49-b5d1-4aab-af01-c55cc046c839)


Deleting a location named “Bits Goa”.  
![image](https://github.com/user-attachments/assets/5c4ffa34-b3f7-4e87-a0ad-6d3583c10a49)
![image](https://github.com/user-attachments/assets/d0df1a1a-c973-464d-96d4-56f514570332)


### Module 4- Bill Payment  
After confirming for a parking space and slot, the customer can pay through the wallet or they can make a payment through Paypal. Also, customers can remove a
selected parking space if required.  


Cart and final confirmation page are shown below:  
![image](https://github.com/user-attachments/assets/470ee0f0-df17-4228-ba39-93d145ce77f2)
![image](https://github.com/user-attachments/assets/5c62062c-e9d5-4798-8118-fe0399b981a3)

Payment page:  
![image](https://github.com/user-attachments/assets/ee282afc-0b94-4413-8a64-00583c791c76)


Advanced Feature  
Integration with real world payment gateways/wallet with Pay-Pal, which allows 
users to make payments using their Pay-Pal accounts.  
Logging in with test Pay-Pal ID and password:  
![image](https://github.com/user-attachments/assets/ee9dc022-f18e-4631-a49e-2a3be28a6199)


Final payment confirmation page:  
![image](https://github.com/user-attachments/assets/7f18ff8d-c03a-4443-a1b9-7aa154746bb2)



Successful payment confirmation:  
![image](https://github.com/user-attachments/assets/5821caae-b423-4ce2-bbc0-d40946585476)
