/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.BanooAboobaker.JD521FA1;

/**
 *
 * @author Aboobaker
 */

import java.util.Scanner; // import Scanner Object
import java.text.DecimalFormat; // import decimal format

// Main Method
public class JD521FA1 {

    public static void main(String[] args) {
        
        // Initialize the Bank Account Method in Main Method
        BankAccount application = new BankAccount(
                "Aboobaker Banoo",
                "**********085",
                "CTU Banking Solutions",
                "Savings",
                "10 ** *** *** 2"
                );  
        
        application.showMenu(); // Call the Method
    }
}

// bankAccount class 
class BankAccount {
    
    // initialize variables
    int balance, previousTransaction, amount, saving;
    String customerName, customerID, bankType, accountType, accountNum;
    
    // bankAcount class constructor
    BankAccount(String custName, String custID, String bank, String accType, 
            String accNum) {
        
        // Set the value of the variables
        customerName = custName;
        customerID = custID;
        bankType = bank;
        accountType = accType;
        accountNum = accNum;
    }
    
    // deposit method
    void deposit(int amount){
        if (amount != 0) {
            balance = balance + amount; // add to account balance
            System.out.println("\n=============================================");
            System.out.print("You have successfully deposited: R" + amount);
            System.out.println("\n=============================================");
            
            previousTransaction = amount; // Set the previous transaction equal to the amount
        }
    }
    
    // withdraw method
    void withdraw(int amount) {
        if (amount != 0) {
            
            // Validation to check if the withdraw amount is not greater than the account balance 
            if (balance < amount) {
                System.out.print("""
                                 
                                 You cannot withdraw an amount greater than 
                                 your account balance. Select option 'A' to 
                                 Check your Balance.
                                 """);
            } 
            else {
                balance = balance - amount; // Subtract from the account balance
                System.out.println("\n=============================================");
                System.out.print("You have successfully withdrawn: R" + amount);
                System.out.println("\n=============================================");
                previousTransaction = -amount; // Set the previous transaction equal to the amount
            }
        }
    }
    
    // savings method
    void savings(int saving) {
        
        Scanner scanner = new Scanner(System.in); // Create the Scanner Object
        
        DecimalFormat decfor = new DecimalFormat("0.00"); // Decimal format 
        
        // initialize variables
        double amount1, amount2, amount3, rate1, rate2, rate3;
        int time = 0; // initialize user input
        
        rate1 = 0.005; // 0.005% interest rate
        rate2 = 0.02;  // 0.02% interest rate
        rate3 = 0.05;  // 0.05% interest rate
        
        // loop to validate if user input is an integer
        do {
            System.out.println("\n=============================================");
            System.out.print("Enter the time in months: ");
            System.out.println("\n=============================================");

            if (scanner.hasNextInt()) {
                time = scanner.nextInt();

                if (time > 0) {
                    continue;
                } 
                else if (time < 0) {
                    System.out.print("\nPlease enter a positive value.\n");
                } 
                else {
                    System.out.print("\nInput is not an integer.");
                }

                } 
            else {
                System.out.print("\nPlease restart the process and be sure to");
                System.out.print("\nenter a valid integer.");
                scanner.next();
                System.out.println();
                break;
            }
        } 
        while (time < 0);
        
        if (time > 0) {
            // check for correct interest rate
            if (saving >= 100 && saving <= 500) {
                amount1 = (saving * rate1) * (time); // interest formula
                System.out.println("\n=============================================");
                System.out.print("The return on investment of R" + saving + " for " 
                        + time + "\nmonths = R" + decfor.format(amount1));

                balance = (int) (balance + amount1); // update savings to balance

                System.out.println("\n\nNew updated balance after " + time + " months of "
                        + "\nsaving = R" + balance);
                System.out.println("=============================================");
            }
            else if (saving >= 600 && saving <= 1000) {
                amount2 = (saving * rate2) * (time); // interest formula
                System.out.println("\n=============================================");
                System.out.print("The return on investment of R" + saving + " for " 
                        + time + "\nmonths = R" + decfor.format(amount2));

                balance = (int) (balance + amount2); // update savings to balance

                System.out.println("\n\nNew updated balance after " + time + " months of "
                        + "\nsaving = R" + balance);
                System.out.println("=============================================");
            } 
            else if (saving > 1000) {
                amount3 = (saving * rate3) * (time); // interest formula
                System.out.println("\n=============================================");
                System.out.print("The return on investment of R" + saving + " for " 
                        + time + "\nmonths = R" + decfor.format(amount3));

                balance = (int) (balance + amount3); // update savings to balance

                System.out.println("\n\nNew updated balance after " + time + " months of "
                        + "\nsaving = R" + balance);
                System.out.println("=============================================");
            } 
            else {
                System.out.print("\nThere are no savings in your account\n");
            }
        } 
        else {
        }
    }
    
    // previousTransaction method
    void getPreviousTransaction() {
        
        if (previousTransaction > 0) {
            System.out.print("Deposited: R" + previousTransaction);
        }
        else if (previousTransaction < 0) {
            System.out.print("Withdrawn: R" + Math.abs(previousTransaction));
            // Math.abs converts negative number to positive number
        }
        else {
            System.out.print("No transaction has occured!");
        }
    }
    
    // showMenu method
    void showMenu() {
        
        Scanner scanner = new Scanner(System.in); // Create Scanner Object
        
        // initialize user input 
        char option = '\0';
        
        // display details
        System.out.println("\n********** CTU Banking Application **********");
        System.out.println("\n=============================================");
        System.out.print("Welcome again " + customerName);
        System.out.print("\n\nID number: " + customerID);
        System.out.print("\n\nYou bank with: " + bankType);
        System.out.print("\nAccount type: " + accountType);
        System.out.print("\nAccount number: " + accountNum);
        System.out.println("\n=============================================");
        
        // Program Loop
        do {
            System.out.print("\nA. Check Balance");
            System.out.print("\nB. Deposit");
            System.out.print("\nC. Savings");
            System.out.print("\nD. Withdraw");
            System.out.print("\nE. Previous Transaction");
            System.out.print("\nF. Exit");
            
            // prompt user for input
            System.out.println("\n=============================================");
            System.out.print("Enter the option: ");
            System.out.println("\n=============================================");
            option = scanner.next().charAt(0); // get first character
            option = Character.toUpperCase(option); // Validation for lowercase user input
            
            // User Options
            switch (option) {
                
                // option A to get the account balance
                case 'A' -> { 
                    System.out.println("\n=============================================");
                    System.out.println("Your Balance is: R" + balance);
                    System.out.println("=============================================");
                }
                
                // option B to deposit into the account
                case 'B' -> { 
                    
                    // loop to validate if user input is an integer
                    do {
                        System.out.println("\n=============================================");
                        System.out.println("Enter the amount to Deposit: ");
                        System.out.println("=============================================");
                    
                        if (scanner.hasNextInt()) {
                            amount = scanner.nextInt();

                            if (amount > 0) {
                                deposit(amount);
                            } 
                            else if (amount < 0) {
                                System.out.print("\nPlease enter a positive value.\n");
                            } 
                            else {
                                System.out.print("\nInput is not an integer.");
                            }
                        } 
                        else {
                            System.out.print("\nPlease restart the process and be sure to");
                            System.out.print("\nenter a valid integer.");
                            scanner.next();
                            System.out.println();
                            break;
                        }
                    } 
                    while (amount < 0);
                    continue;
                }
                
                // option C to calculate savings
                case 'C' -> { 
                    
                    // loop to validate if user input is an integer
                    do {
                        System.out.println("\nBelow is a table indicating the different savings options:");
                        System.out.println("_____________________________________________________________");
                        System.out.println("| Savings Amount Range  | Savings Duration  | Interest Rate  |");
                        System.out.println("|_______________________|___________________|________________|");
                        System.out.println("| R100 to R500          | 1 month           | 0.5%           |");
                        System.out.println("|_______________________|___________________|________________|");
                        System.out.println("| R600 to R1000         | 1 month           | 2%             |");
                        System.out.println("|_______________________|___________________|________________|");
                        System.out.println("| Over R1000            | 1 month           | 5%             |");
                        System.out.println("|_______________________|___________________|________________|");
                        
                        System.out.println("\n=============================================");
                        System.out.println("Enter the amount you would like to save: ");
                        System.out.println("=============================================");
                        
                        if (scanner.hasNextInt()) {
                            saving = scanner.nextInt();

                            if (saving > 0) {
                                
                                // loop to validate if account balance is is greater than saving amount
                                do {
                                    if (balance < saving) {
                                        System.out.print("""
                                                         
                                                         You cannot save for an amount greater than 
                                                         your account balance. Select option 'B' to 
                                                         deposit some funds and try again.
                                                         """);
                                    }
                                    else {
                                        savings(saving);
                                    }
                                } 
                                while (saving <= 0);
                            } 
                            else if (saving <= 0) {
                                System.out.print("\nPlease restart the process and be sure\n");
                                System.out.print("to enter a positive value.\n");
                            } 
                            else {
                                System.out.print("Input is not an integer.");
                            }
                        } 
                        else {
                            System.out.print("\nPlease restart the process and be sure to");
                            System.out.print("\nenter a valid integer.");
                            scanner.next();
                            System.out.println();
                            break;
                        }
                    } 
                    while (amount < 0);
                    continue;
                }
                
                // option D to withdraw from the account
                case 'D' -> { 
                    
                    // loop to validate if user input is an integer
                    do {
                        System.out.println("\n=============================================");
                        System.out.println("Enter the amount to Withdraw: ");
                        System.out.println("=============================================");
                        
                        if (scanner.hasNextInt()) {
                            amount = scanner.nextInt();

                            if (amount > 0) {
                                withdraw(amount);
                            } 
                            else if (amount < 0) {
                                System.out.print("\nPlease enter a positive value.\n");
                            } 
                            else {
                                System.out.print("\nInput is not an integer.");
                            }
                        } 
                        else {
                            System.out.print("\nPlease restart the process and be sure to");
                            System.out.print("\nenter a valid integer.");
                            scanner.next();
                            System.out.println();
                            break;
                        }
                    } 
                    while (amount < 0);
                    continue;
                }
                
                // option E to view the previous transaction
                case 'E' -> { 
                    System.out.println("\n=============================================");
                    getPreviousTransaction();
                    System.out.println("\n=============================================");
                }
                
                // option F to exit the loop/application
                case 'F' -> { 
                    System.out.println("\n*********************************************");
                    System.out.println("Thank you for banking with us " + customerName);
                }
                
                // validation if user inputs incorrect character
                default -> System.out.println("\nInvalid Option! Please try again.");
            }
        } 
        while (option != 'F');
        
        scanner.close(); // close the scanner object
    }
}