The technology stack you have at your disposal consists of the following components:
● Java 21 LTS
● Spring Boot's latest production release
● Maven
● H2 database server


The development IDE of our choice is IntelliJ IDEA. Nevertheless, if you consider the use of another IDE will help,
you are free to use that IDE.
To call your endpoints, you may utilize one of the following tools:
● Postman Application
● IntelliJ HTTP Client
● Curl command-line tool
You are free to use any library as long as it is declared as a dependency via Maven.

Product Perspective
Delivery Service, a web application that allows individuals to order online food, coffee, beverages,
etc. The user must register using a unique phone and email address to use the application.
Based on the fact that we are only covering the API services of the web application, every feature will be
considered complete upon the successful return of a valid JSON response.
In the following section, we will describe all required functionality.


Functionality
Domain Model
Our system consists of several entities with the most basic being the account, store, store category, product,
product category, and of course orders. You are free to create whatever domain class you think is appropriate
and include whatever attributes per domain class.
Remember that you should base the creation of your database schema on the entity classes that will be based
on the domain classes.


Generate Sample Data
Once you have concluded the domain model, you should generate some corresponding sample data to feed
the services under development.


Business Requirements
The web application's user, after initial registration, should be able to
● Search for the desired store, either by name or by category.
● Add one or more items from the store's menu to the order.
● Create an order containing items only from the same store.
● In case we change to another store and add one of its items, the order should be cleared before
adding the new item(s).
● Retrieve all placed orders.
● List of the most famous stores in general and per category.



Non-functional Requirements

Software Design
All functionality should be implemented by following the practices covered during the sessions. Make use
of interfaces and abstract classes wherever it seems appropriate and use proper Java packaging
nomenclature.


Performance
When it comes to performance, all calls should have a maximum response time of 200 milliseconds.


Logging
There should be a well-defined logging policy maintaining all information considered mandatory to trace
user activity and debug erroneous calls. By logging policy, we are referring to the definition of the logging
level per specific functionality, potentially more than one log file along with a clear rotation policy.



Software Quality
When it comes to the quality of the implementing product, we need to make sure every call should
always return a valid JSON document including the cases where something went wrong, due to either a
development bug or system reasons. The end-user should not see default error pages.
Depending on the type of the call (CRUD actions), the proper HTTP code should be always returned:
● 200 OK
● 201 Created
● 202 Accepted
● 204 No Content
● 400 Bad Request
● 401 Unauthorized
● 403 Forbidden
● 404 Not Found
● 500 Internal Server Error
As far as the quality of the source code is concerned, you should utilize any type of formatting rules you
consider appropriate and indicative of your coding style.


Coded security password package named it "Password Handler".
