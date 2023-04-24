## Bank Statement Analyzer
Developing this software was to learn about the foundation and advanced techniques on good software developments. Explored why several approaches poses several challenges in terms of coping for changing  requirement and maintenance of the project.

## Takeaways

 - God Classes and code duplication lead to code that is hard to reason about and maintain.
 - The Single Responsibility Principle helps you write code that is easier to manage and maintain.
 - Cohesion is concerned with how how strongly related the responsibilities of a class or method are.
 - Coupling is concerned with how dependent a class is on other parts of your code.
 - High cohesion and low coupling are characteristics of maintainable code.
 - A suite of automated tests increases confidence that your software is correct, makes it more robust for changes, and helps program comprehension.
 - JUnit is a Java testing framework that lets you specify unit tests that verify the behavior of your methods and classes.
 - Given-When-Then is a pattern for setting up a test into three parts to help understand the tests you implement.
 - The Open/Closed Principle promotes the idea of being able to change the behavior of a method or class without having to modify the code.
 - The Open/Closed Principle reduces fragility of code by not changing existing code, promotes reusability of existing code, and promotes decoupling, which leads to better code maintenance.
 - God interfaces with many specific methods introduce complexity and coupling.
 - An interface that is too granular with single methods can introduce the opposite of cohesion.
 - You should not be worried about adding descriptive method names to help readability and comprehension of your API .
 - Returning void as a result of an operation makes it difficult to test its behavior.
 - Exceptions in Java contribute to documentation, type safety, and separation of concerns.
 - Use checked exceptions sparingly rather than the default as they can cause significant clutter.
 - Overly specific exceptions can make software development unproductive.
 - The Notification Pattern introduces a domain class to collect errors.
 - Do not ignore an exception or catch the generic Exception as you will lose the benefits of diagnosing the root of the problem.
 - A build tool automates the repetitive tasks in the software development life cycle including building, testing, and deploying your application.
 - Maven and Gradle are two popular build tools used in the Java community.
