# Example project - Northwind.

#### Introduction:
This project is based on Northwind sample database available in MSSQL. 
One man put an effort into recreating it in MySQL (kudos!). It is available [here](https://github.com/dalers/mywind).

#### Goal:
The goal is to create a web application using Spring Framework. 
Because I do it on my own and do not have any schedule I will apply some of technologies:
  - Back-end:
      - MySQL
      - H2 in-memory db for testing
      - Hibernate
      - Spring MVC
      - Spring RESTful service
      - Spring Data JPA
      
  - Front-end:
      - HTML with Thymeleaf
      - Angular or AngularJS
      - jsp

I have not decided yet which technologies I will use, so the above list may change.

#### Notes:
Remember to create schema in MySQL *northwind-example*.

#### Done:
- [x] Hibernate added
- [x] simple code added to check if connection to db works
- [x] finished @OneToMany and @ManyToOne mappings

#### TODO:

- [ ] add repository layer with Spring Data JPA
- [ ] redo mappings to EmployeePrivileges, it should have two FKs. 
