# SpringBootApplicationStartUpSamples

------------------------------------------
Sometimes we just need to run a snippet of code on application startup. Spring Boot offers at least 5 different ways of executing code on startup.

-----------------------------------------------
CommandLineRunner is a simple interface we can implement to execute some code after the Spring application has successfully started up.We’ll want to use CommandLineRunner if we need to access command-line arguments.

We can use an ApplicationRunner instead if we want the command-line arguments parsed. We’ll want to use an ApplicationRunner if we need to create some global startup logic with access to complex command-line arguments.

If we don’t need access to command-line parameters, we can tie our startup logic to Spring’s ApplicationReadyEvent.

Another simple solution to create startup logic is by providing an initializing method that is called by Spring during bean creation. All we have to do is to add the @PostConstruct annotation to a method.

Very similar in effect to the @PostConstruct solution, we can implement the InitializingBean interface and let Spring call a certain initializing method.

-------------------------------------------------------
Conclusion

There are many ways of executing code during the startup of a Spring Boot application. Although they look similar, each one behaves slightly different or provides different features so they all have a right to exist.

We can influence the sequence of different startup beans with the @Order annotation but should only use this as a last resort, because it introduces a difficult-to-grasp logical dependency between those beans.

https://reflectoring.io/spring-boot-execute-on-startup/

