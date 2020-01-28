# Test Case Specification For Team 3

January 14, 2020



Prepared by:

David Brazzarola





## Revision History

| Version | Date | Name | Description |
| --- | --- | --- | --- |
| 1 | 18/10/2019 | Group 3 | Initial Document |
| 2 | 19/11/2019  | Group 3 | Updated GUI for a better navigation; added server test |



## Introduction

This document provides the test cases to be carried out for the Potato Chat Application.  Each item to be tested is represented by an individual test case.  Each case details the input and expected outputs.

## Test Cases: Local Server

| Test ID | 2.1 |
| --- | --- |
| Title | Correct Login |
| Feature | Login to the Potato Chat |
| Objective | Confirm that the login interface works correctly |
| Setup | The developer can make the test on his own machine |
| Test Data | Login informationAlias = test2\_1Topic = #automatically set on &quot;general&quot; |
| Test Actions | 1. Start Potato Chat application2. Compile the login window3. Enter login information |
| Expected Results | System displays a new window with the interface that allows the user to chat |



| Test ID | 2.2 |
| --- | --- |
| Title | Testing server response |
| Feature | Try to send and receive messages and analyze that |
| Objective | Confirm that the packages are correctly built and exchanged |
| Setup | The developer can simulate both the entities on his own machine |
| Test Data | Send button functionalityMessage = Test message |
| Test Actions | 1. Start Potato Chat application2. Exchange messages with the server |
| Expected Results | Everything works correctly |





## Test Cases: Remote Application

| Test ID | 3.1 |
| --- | --- |
| Title | Correct Login |
| Feature | Login to the Potato Chat |
| Objective | Confirm that the user id is assigned by the server so he can use the application |
| Setup | The developer can make the test on his own machine |
| Test Data | Login informationAlias = test2\_1Topic = #automatically set on &quot;general&quot; |
| Test Actions | 1. Start Potato Chat application2. Compile the login window3. Enter login information |
| Expected Results | System displays a new window with the interface that allows the user to chat |