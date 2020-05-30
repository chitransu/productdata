By Default Spring-data-jpa is using Hibernate as default JPA implementor . We are free to use another implementor
as per the requirement .

steps to create spring jpa project :
1- add jpa and mysql connector jar 
2- create database i.e. mydb and table i.e. product
3- create Entity class and annotate it with the appropriate annotations . like Product.java
4- create repository interface which will implement CrudRepository interface.
5- provide database configuration in application.property file with dataSource url , database username and 
    database password
6- Now are application is ready to test , choose the test class from the springboot project , write and  execute the test.  


Application Flow :

As we have provided datasource url , database username and password in the property file . Created 
Entity class and Repository interface , SpringBoot starter Data JPA project
by using springboot auto configuration feature  will create EntityManagerFactory which knows how to connect to the database
, will create EntityManager and when we perform any operations like productRepository.save,findById etc . spring interns
create a proxy implementation of the ProductRepository interface which invokes the methods present into EntityManager.
And EntityManager performs the appropriate operations on the database .

So by using spring data we simply remove all the Boilerplate code and configuration .
