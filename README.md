# BeginnerJavaConsoleApplications
This repository showcases small Java console applications for beginners

## Context
This repository contains various small Java console applications designed for beginners to practice and learn fundamental programming concepts. Each project includes an overview, a brief description of its functionality, and sample outputs to demonstrate how the applications work.


## Table of Contents
- [Beginner Java Console Applications](#beginnerjavaconsoleapplications)
- [Context](#context)
- [Table of Contents](#table-of-contents)
- [Palindrome Checker](#palindrome-checker)
- [Lottery Game](#lottery-game)
- [Exam Enterence Calculator](#exam-enterence-calculator)
- [Marks Application](#marks-application)
- [Banking App](#jd521fa1-banking-app)



## Palindrome Checker
### Overview
A palindrome is a word, phrase, number, or other sequences of characters that reads the same forward and backward. This application checks if a number provided by the user is a palindrome. <br>
#### See sample output:
<img src="assets/images/Palindrome1.png" alt="Palindrome image 1">

### Demonstrating functionality:
<img src="assets/images/Palindrome2.png" alt="Palindrome image 2">



## Lottery Game
### Overview
This application simulates a lottery game. It generates three random numbers between 0 and 9, and the user guesses three numbers. The application compares the user's guesses with the generated numbers and calculates the winnings.<br>
<img src="assets/images/Lottery1.png" alt="">


### Demonstrating functionality:
<img src="assets/images/Lottery2.png" alt="">



## Exam Enterence Calculator
### Overview
This application calculates a student's eligibility to sit for an exam based on their formative assessment marks. The pass mark to qualify for the exam is 30%.

#### Calculation Example:
- **FA1**: 65%
- **FA2**: 34%
- **FA3**: 25%

Using the formula: `(FA1 + FA2 + FA3) * 16.66 / 100`, the final mark determines if the student qualifies.

### Demonstrating functionality:
<img src="assets/images/ExamEnterenceCalculator1.png" alt="">



## Marks Application
### Overview
Developed for CTU Training Solutions, this application manages student marks during exams. It includes functionalities like displaying student reports per module, calculating averages, finding the highest and lowest marks, and presenting a mark distribution chart.

### Demonstrating functionality:
<img src="assets/images/Marks1.png" alt="">



## JD521FA1 (Banking App)
### Overview
This application, developed for CTU Training Solutions' new online bank, facilitates basic banking transactions such as deposits, withdrawals, and savings. It also calculates interest based on savings amount and duration.

#### Interest Rate Table:
| Savings Amount Range | Savings Duration | Interest Rate |
|----------------------|------------------|---------------|
| R100 to R500         | 1 month          | 0.5%          |
| R600 to R1000        | 1 month          | 2%            |
| Over R1000           | 1 month          | 5%            |


### Demonstrating functionality
#### First run of the application - Menu with all required options:
<img src="assets/images/Bank1.png" alt="">

#### Program correctly performs deposits:
<img src="assets/images/Bank2.png" alt="">

#### Program correctly performs savings:
a. <br> <img src="assets/images/Bank3_1.png" alt=""> <br>
b. <br> <img src="assets/images/Bank3_2.png" alt="">

#### Program correctly performs withdrawals:
<img src="assets/images/Bank4.png" alt="">

#### Program correctly exits when selected:
<img src="assets/images/Bank5.png" alt="">


### Demonstrating input validation
#### Program properly validates input for deposit amounts
If the user inputs a negative number or text, an error message will be displayed: <br>
<img src="assets/images/Bank6.png" alt="">

#### Program properly validates input for savings amounts
a. For the savings amount, if the user inputs a negative number, an error message will be displayed: <br>
<img src="assets/images/Bank7_1.png" alt="">

b. For the savings amount, if the user inputs some text, an error message will be displayed: <br>
<img src="assets/images/Bank7_2.png" alt="">

c. For the number of months, if the user inputs a negative number or some text, an error message will be displayed: <br>
<img src="assets/images/Bank7_3.png" alt="">

#### Program properly validates input for withdrawal amounts
a. If the user wants to withdraw an amount that is greater than their account balance, an error message will be displayed: <br>
<img src="assets/images/Bank8_1.png" alt="">

b. If the user inputs a negative number or some text, an error message will be displayed: <br>
<img src="assets/images/Bank8_2.png" alt="">


### Demonstrating output clarity
#### Program provides clear instructions for user input:
<img src="assets/images/Bank9.png" alt="">

#### Program outputs clear messages for successful deposits:
<img src="assets/images/Bank10.png" alt="">

#### Program outputs clear messages for successful savings:
<img src="assets/images/Bank11.png" alt="">

#### Program outputs clear messages for successful withdrawals:
<img src="assets/images/Bank12.png" alt="">


### Demonstrating creativity
#### Program includes additional features beyond the basic requirements
a. With option ‘A’, the user can Check their account balance: <br>
<img src="assets/images/Bank13_1.png" alt="">

b. With option ‘E’, the use can check their Previous transaction: <br>
<img src="assets/images/Bank13_2.png" alt="">

c. Balance starts at R0 (no money in the account): <br>
<img src="assets/images/Bank13_3.png" alt="">

d. The users Previous transaction is null if no transactions have taken place: <br>
<img src="assets/images/Bank13_4.png" alt="">
