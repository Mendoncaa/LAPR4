# Supplementary Specification (FURPS+)

## Functionality

* The system should allow administrators to manage users, assigning specific roles and permissions.
* Customer Managers should be able to register clients and manage their accounts within the system.
* The system should enable the management of job openings, including their creation, editing, and listing by Customer Managers.
* Operators should be able to register candidates, manage their information, and list all candidates for review.
* The system must automatically process candidate applications received via email, organizing and preparing them for review.
* The system should support automated evaluation of candidates based on job requirements and interview performance.
* Customer Managers should be able to configure job requirement specifications and interview models for each opening.
* The system should facilitate ranking candidates and notifying them and clients about recruitment outcomes.
* It should offer data visualization and reporting tools for analyzing information on candidates, applications, and job openings.
* Real-time notifications should be sent to candidates and clients regarding the status of applications and job openings.

## Usability

The system should have a user-friendly interface for all actors.
The system should provide clear and concise instructions for all actions.
The system should be easily accessible from any device with an internet connection.
The system should have consistent design and layout across all apps.



## Reliability

_Refers to the integrity, compliance and interoperability of the software. The requirements to be considered are: 
frequency and severity of failure, possibility of recovery, possibility of prediction, accuracy, average time between failures.

- ### Frequency and Severity of Failure
    - The system should be available 24/7, with minimal downtime for maintenance
- ### Possibility of Recovery
    - The system should have backups in case of data loss or system failure.
- ### Possibility of Prediction
    - The system should be able to handle multiple users accessing the same course or shared board without data loss or corruption.
- ### Accuracy
    - The system should be able to handle a large number of users and data without crashes or data loss.
- ### Average Time Between Failures
     The system should have backups in case of data loss or system failure.


## Performance

Evaluates the performance requirements of the software, namely: response time, start-up time, recovery time, memory consumption, CPU usage, load capacity and application availability.

The system should load pages and perform actions quickly.
The system should be able to handle concurrent user requests without slowdowns.
The system should have reasonable response times for data queries and updates

## Supportability

_The supportability requirements gathers several characteristics, such as:
testability, adaptability, maintainability, compatibility, configurability, installability, scalability and more.

- ### Testability
    - The development team must implement unit tests for all methods, except for methods that implement Input/Output operations. The unit tests should be implemented using the JUnit 5 framework. 
- ### Adaptability
    - 
- ### Maintainability
    - The system should have documentation and support resources available to all actors.
- ### Compatibility
    - The system must be compatible with different devices.
- ### Configurability
    - ""
- ### Installability
    - The system should be easy to install and maintain.
- ### Scalability
    - The system should be modular and allow for easy upgrades and additions.


### Design Constraints

_Specifies or constraints the system design process. Examples may include: programming languages, software process, mandatory standards/patterns, use of development tools, class library, etc._

- #### Class Libraries:
  - JPA
  - Eclipse Link
- #### Mandatory standards/patterns: 
  - GRASP
  - SOLID
  - GoF
  - Modularity
  - Tell, Don't Ask (Principle)
  - Test-Driven Design (TDD)
  - OO software analysis and design practices
  - Domain Driven Design
- #### Development tools: 
  - PlantUML 
  - Markdown
  - IntelliJ IDE or Visual Studio Code
  - JUnit Framework
  - GitHub

### Implementation Constraints

_Specifies or constraints the code or construction of a system such
such as: mandatory standards/patterns, implementation languages,
database integrity, resource limits, operating system._

- #### Mandatory standards/patterns:
  - JavaDoc
- #### Implementation languages:
  - Java
- #### Java Plugins:
  - JUnit Framework

### Interface Constraints

_Specifies or constraints the features inherent to the interaction of the
system being developed with other external systems._



### Physical Constraints

_Specifies a limitation or physical requirement regarding the hardware used to house the system, as for example: material, shape, size or weight._
