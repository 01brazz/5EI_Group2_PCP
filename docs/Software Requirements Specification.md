#  Software Requirements Specification



**Team 2**

December 16, 2019

Version 1

















Prepared by:

David Brazzarola



**Revision History**

| Version | Date | Name | Description |
| --- | --- | --- | --- |
| 1 | 12/16/19 | David Brazzarola | Initial Document |
|   |   |   |   |



# Introduction

### Overview

The Potato Chat application will be desktop app available to computers connected in a LAN. The application will make users log in through a dedicated interface. The app will allow Potato Chat users to exchange messages on the local network through another interface.

This document provides information on the requirements for the Potato Chat software application. Project goals, scope and definitions are given in the introduction. Design constraints and application environment are described in the following section.  Non-functional requirements are outlined for later verification. Functional requirements are given to show the system features and expected user interaction.

Project constraints will be included in separate documentation. The Software Project Management Plan will give specifics on project budget and schedule. A separate Test Plan document will address test specifications and procedures.

### Goals and Objectives

The main objective of this project is to allow students a way to communicate on a chat from their computers. The Potato Chat application is expected to:

1. Provide a desktop interface with a login section to access enter in a chat.
2. Function in a simple and intuitive manner.
3. Provide students with locations to exchange massages.

### Scope

The Potato Chat application will provide users with the ability to exchange messages from their computers. Users will be able to check their Potato Chat account statements in the dedicated section.

### Definitions

**Potato Chat Application** – the product that is being described here; the software system specified in this document.

**Project** – activities that will lead to the production of the Potato Chat application.

**Client** – the person or organization for which this Potato Chat application is being built.

**User** – the person or persons who will actually interact with the Potato Chat application.

**Use case** – describes a goal-oriented interaction between the system and an actor. A use case may define several variants called scenarios that result in different paths through the use case and usually different outcomes.

**Scenario** – one path through a user case

**Actor** – user or other software system that receives value from a user case.

**Developer** – the person or organization developing the system, also sometimes called the supplier.

**Stakeholder** – anyone with an interest in the project and its outcomes. This includes clients, customers, users, developers, testers, managers and executives.

# General Design Constraints

### Potato Chat Application Environment

The Potato Chat product will include a desktop app designed to work on a Windows platform.  This application will interface with the local server. This server will interface with every user.

//schema   user\&lt;-\&gt;server\&lt;-\&gt;user

### User Characteristics

**Potato Chat Users** : students, faculty or staff who own a computer. Everyone is likely proficient with this intuitive and simple application.

### Mandated Constraints

The application will run on a desktop platform. This platform was chosen based on experience with Java and team consensus.

# Nonfunctional Requirements

### Operational Requirements

Usability: 95% of users will not need to read the user manual to be able to use the application.

### Performance Requirements

Maintainability: Changes made to the server can be adopted only altering the desktop application too.

### Security Requirements

The Potato Chat app has two features. For the first feature, Use Case 1, Potato Chat account security is provided by secure login and id management made by the server.  Login information input via the Potato Chat app will not be stored.  For the second feature, Use Case 2, no security is required and access to Potato Chat interface is available to all logged users.

### Documentation and Training

The Potato Chat application will be delivered to users as a download without documentation or training.  A user guide and system documentation will be provided to project stakeholders.

### External Interface

**User Interface**

The user interface will be eye-catching and visually appealing. When users access their Potato Chat accounts, the interface will provide a smooth transition with the chatting interface which has a straightforward, understated look and feel.

The interface will be intuitive. As a desktop app it will be simple to use. No training will be provided and it is expected that 95% of users will be able to use the app without any training.

**Software Interface**

The Potato Chat server will serve as an interface between the users. It will enable interaction between the user and another use connected in the same LAN.

# Functional Requirements

### Required Features

**Use Case: 1**

Description: User Login / Check Roo Bucks Balance

Actors: student or any Potato Chat user

Value = high

Cost = medium

Basic Path

1. User clicks icon Potato Chat application.
2. System prompts user to log in the application.
3. User puts the parameters and click login.
4. System sends a registration request to the server.
5. The server responds with a confirmation packet and associate the user to an id.
6. System displays the chatting interface with options to send and receive messages.
7. User clicks Logout.
8. System exits.

**Use Case: 2**

Description: User chatting experience

Actors: student or any Potato Chat user

Value = high

Cost = high

Basic Path

1. Following Login [Use Case 1 Step 6]: System displays a section with options to chat.
2. System prompts user to select the receiver.
3. User selects the receiver and digit the text in the text box, then clicks send.
4. System sends the message and is ready to send or receive other messages.
5. User clicks exit.
6. System exits.

### Optional Features

**Use Case: 3**

Description: Change user&#39;s alias

Actors: student or any Potato Chat user

Value = medium

Cost = medium

Basic Path

1. Following Login [Use Case 1 Step 6]: System displays a section with options to logoff or change alias.
2. User clicks Change Alias.
3. System displays an interface to change the alias.
4. User confirms.
5. System updates the parameter.