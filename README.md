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

This is the landing page for our website.    
It provides the option to sign up for a new account or 
login into an existing account using email and password credentials or Google based 
authentication.  
All these details are maintained in the database at regular intervals.  
a) Admin User can sign in through his credentials - email and password:  
b) A new customer can register himself by providing his details - first name, last name, 
unique email address and password (or) he can sign in through his google account.  
Registering with a new account with the details mentioned below.  
### Module 2 – Creating Dashboard
For this module, there is a facility of role-based authentication for roles of user and admin.  
Admin has the power to add, remove, view, update the information about workers, parking 
spaces, and parking locations.   
The user can view the available parking spaces for a particular location based on time slot, date, 
and vehicle type.  
a) Admin Dashboard  
Managing Workers: Admin can add or remove workers.  
• Adding a worker named T1:  
At serial number 8, the new worker T1 is added.  
• Removing/updating a worker:  
The worker previously at serial number 7 has been removed as shown above.  
b) User Dashboard  
i) User can select car parking space and parking slots according to their preferred location  
ii) User can view the details of their chosen parking spaces and parking slots  
### Module 3 - Managing Parking Spaces  
The powers of the admin to modify the parking spaces, locations and slots are shown below.  
1) Admin can edit/view/list all the parking spaces:  
i) Adding L&T_P01 Parking space  
ii) Removing Parking space ID: GKV_P05  
iii) Updating L&T_P01’s vehicle type to “MEDIUM”  
2) Managing Locations:  
i) Adding a location named “5-Star Mall”  
ii) Deleting a location named “Alcazar Mall”  
### Module 5- Bill Payment 
After confirming for a parking space and slot, the customer can pay through the wallet or they can make a payment through Paypal. Also, customers can remove a
selected parking space if required.  
Cart and final confirmation page are shown below:  
### Payment page:
Advanced Feature  
Integration with real world payment gateways/wallet with Pay-Pal, which allows 
users to make payments using their Pay-Pal accounts.  
Logging in with test Pay-Pal ID and password:  
Final payment confirmation page:  
Successful payment confirmation  
