# OO Analysis

The construction process of the domain model is based on the client specifications, especially the nouns (for _concepts_) and verbs (for _relations_) used. 

## Rationale to identify domain conceptual classes
To identify domain conceptual classes, start by making a list of candidate conceptual classes inspired by the list of categories suggested in the book "Applying UML and Patterns: An Introduction to Object-Oriented Analysis and Design and Iterative Development". 


### _Conceptual Class Category List_

**Business Transactions**

* Recruitment Process

---

**Transaction Line Itemss**

* Phases of the Recruitment Process (Application, Screening, Interviews, Analysis, Result)

---

**Product/Service related to a Transaction or Transaction Line Item**

* Job Opening Services

---

**Transaction Records**

* Applications Submission Records
* Interview Records
* Requirements Verification Records

---  

**Roles of People or Organizations**

* System Administrator (Admin)
* Customer Manager
* Operator
* Language Engineer
* Candidates
* Clients (Companies requiring recruitment services)

---

**Places**

* Job Locations

---

**Noteworthy Events**

* Interviews
* Requirements Verification

---

**Physical Objects**

* Application Files (Emails, Attachments, OCR Processed Texts)

---

**Descriptions of Things**

* Job Opening Details (Job Reference, Title, Contract Type, etc.)
* Candidate Profiles

---

**Catalogs**

* Job Requirements Specifications
* Interview Models

---

**Containers**

* Files Repository for Application Data

---

**Elements of Containers**

* Text Files with Application Data
* Text Files with Interview Data
* Plugin Modules for Requirements Specification and Interview Models

---

**Organizations**

* Jobs4U Company

---

**Other External/Collaborating Systems**

* Applications Email Bot (Out of Scope)
* Applications File Bot

---

**Records of finance, work, contracts, legal matters**

* Client Contracts for Recruitment Services

---

**Financial Instruments**

* Not explicitly mentioned but could be implied in contracts and service transactions.

---

**Documents mentioned/used to perform some work**

* Templates for Requirements and Interviews
* Reports from Bots and Plugins

---


## Rationale to identify associations between conceptual classes

* Job Opening is offered by Client
* Application is submitted to Job Opening
* Candidate submits Application
* Requirement Specifications evaluate Candidate Application
* Interview Model assesses Candidate
* Application contains Application Files
* Customer Manager manages Job Opening
* Operator monitors Application Processing
* Language Engineer creates Plugins (Requirement Specifications and Interview Models)
* System Administrator manages User Roles


## Domain Model

Conceptual Classes and Their Attributes:

* **Job Opening**: Job Reference, Title, Contract Type, Mode, Address, Company, Number of Vacancies, Description, Requirements
**Client**: Customer Code, Name, Address
**Candidate**: Email, Name, Phone Number, Application ID, Application Data
**Application**: Application ID, Candidate Data (Email, Name, Phone Number), Job Reference, Application Files
**Recruitment Process**: Phases (Application, Screening, Interviews, Analysis, Result), Dates
**User**: Roles (Admin, Customer Manager, Operator), Authentication Data
**Requirement Specification Plugin**: Specifications, Evaluation Criteria
**Interview Model Plugin**: Questions, Evaluation Rules


**Associations**:

* Job Opening is related to Client
* Application is associated with Job Opening and Candidate
* Candidate has Applications
* Recruitment Process includes Job Opening
* User performs roles in System (Admin, Customer Manager, Operator)
* Plugins (Requirement Specifications and Interview Models) are used by Job Openings for Evaluation

**Insert the Domain Model diagram in SVG format below.**

![Domain Model](domain-model.svg)