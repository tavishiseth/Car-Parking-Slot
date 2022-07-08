# Car-Parking-Slot

Technologies Used
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
![a](https://user-images.githubusercontent.com/75008683/146672733-8e17cd8f-d398-4ea9-8d86-9d20488ef9a8.png)

This is the landing page for our website.    
It provides the option to sign up for a new account or 
login into an existing account using email and password credentials or Google based 
authentication.  
All these details are maintained in the database at regular intervals.  
a) Admin User can sign in through his credentials - email and password:  
![b](https://user-images.githubusercontent.com/75008683/146672744-470a1cc1-a0d6-4aa6-b651-6678e3b451c6.png)

b) A new customer can register himself by providing his details - first name, last name, 
unique email address and password (or) he can sign in through his google account.  
Registering with a new account with the details mentioned below.  
![c](https://user-images.githubusercontent.com/75008683/146672755-f5e8f396-a735-4227-8953-9d87fc536ec1.png)

### Module 2 – Creating Dashboard
For this module, there is a facility of role-based authentication for roles of user and admin.  
Admin has the power to add, remove, view, update the information about workers, parking 
spaces, and parking locations.   
The user can view the available parking spaces for a particular location based on time slot, date, 
and vehicle type.  
a) Admin Dashboard  
![image](https://user-images.githubusercontent.com/75008683/146672795-9fcf11cc-64a0-4805-9bdd-4dca9fddba00.png)

Managing Workers: Admin can add or remove workers.  
![image](https://user-images.githubusercontent.com/75008683/146672820-69e0aa0e-9ab9-4ea6-b7a4-329d8f62bfd1.png)

• Adding a worker named T1:  
![image](https://user-images.githubusercontent.com/75008683/146672828-6f0c097b-d6ad-41e2-8e24-bc98eabb3b3e.png)

At serial number 8, the new worker T1 is added.  
• Removing/updating a worker:  
![image](https://user-images.githubusercontent.com/75008683/146672857-bd4fe7cf-388e-4197-8a71-448785c0bcfd.png)

The worker previously at serial number 7 has been removed as shown above.  
b) User Dashboard  
![image](https://user-images.githubusercontent.com/75008683/146672871-07e5ff18-ddb5-4c07-8ed2-0ca957287272.png)

i) User can select car parking space and parking slots according to their preferred location  
![image](https://user-images.githubusercontent.com/75008683/146672895-325880c2-b968-41c0-adef-fb0bb16514e7.png)

ii) User can view the details of their chosen parking spaces and parking slots  
![image](https://user-images.githubusercontent.com/75008683/146672913-5352232e-75da-418b-b1ea-c12a843c735c.png)

### Module 3 - Managing Parking Spaces  
The powers of the admin to modify the parking spaces, locations and slots are shown below.  
1) Admin can edit/view/list all the parking spaces:  
![image](https://user-images.githubusercontent.com/75008683/146672925-c3afd38c-0bb4-4401-a2b5-fe82f51d3af0.png)

i) Adding L&T_P01 Parking space  
![image](https://user-images.githubusercontent.com/75008683/146672941-286cf334-6f62-4991-bec0-dc1d373d6233.png)

ii) Removing Parking space ID: GKV_P05  
![image](https://user-images.githubusercontent.com/75008683/146672961-d208392d-6412-49c2-aca3-c6cede9931d0.png)

iii) Updating L&T_P01’s vehicle type to “MEDIUM”  
![image](https://user-images.githubusercontent.com/75008683/146672971-b3aa8f9c-6f6a-473f-bfea-5fe01e1844fc.png)

2) Managing Locations:  
![image](https://user-images.githubusercontent.com/75008683/146672988-428327e5-0f8a-4fbd-b0a1-d5af51aed3f3.png)

i) Adding a location named “5-Star Mall”
![image](https://user-images.githubusercontent.com/75008683/146673002-7e4d4064-a224-4c75-9b67-1b2936587f2e.png)

ii) Deleting a location named “Alcazar Mall”  
![image](https://user-images.githubusercontent.com/75008683/146673019-e60de392-33d9-4142-91a4-c531428cea5f.png)

### Module 4- Bill Payment 
After confirming for a parking space and slot, the customer can pay through the wallet or they can make a payment through Paypal. Also, customers can remove a
selected parking space if required.  
Cart and final confirmation page are shown below:  
![image](https://user-images.githubusercontent.com/75008683/146673052-edcede54-e637-4fbf-92df-326e0fa5de90.png)
![image](https://user-images.githubusercontent.com/75008683/146673065-fe61a4a3-5199-4d40-a752-653ddecbed10.png)

### Payment page:
![image](https://user-images.githubusercontent.com/75008683/146673088-1dd2db72-e633-4126-8880-5e8296b35d03.png)

Advanced Feature  
Integration with real world payment gateways/wallet with Pay-Pal, which allows 
users to make payments using their Pay-Pal accounts.  
Logging in with test Pay-Pal ID and password:  
![image](https://user-images.githubusercontent.com/75008683/146673114-f59333a8-2de7-4b1f-80cd-4ead83a3cac9.png)

Final payment confirmation page: 
![image](https://user-images.githubusercontent.com/75008683/146673139-82ad4485-4798-47cc-b3db-5f949cf2c626.png)

Successful payment confirmation: 
![image](https://user-images.githubusercontent.com/75008683/146673159-17ce1700-670c-424b-993a-2538665c8d34.png)

