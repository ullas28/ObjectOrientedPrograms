/*Modify class Account to provide a method called debit that withdraws money
from an Account. Ensure that the debit amount does not exceed the Account’s
balance. If it does, the balance should be left unchanged and the method
should print a message indicating ―Debit amount exceeded account balance.
Modify class AccountTest to test method debit.*/

package com.bridgelabz.Account;

import java.util.Scanner;

public class Account {
    double balance;

    // Constructor
    public Account(double balance) {
        this.balance = balance;
    }

    // Debit method to check account balance and debit some amount

    public void debit() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter amount to withdraw from your account:");
        int debitAmount = sc.nextInt();
        if (debitAmount < balance) {
            balance -= debitAmount;
            System.out.println("Debited amount is : " + debitAmount);
            System.out.println("Account balance after update : " + balance);
        } else {
            System.out.println("Debit amount exceeded Account balance");
            sc.close();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the account balance : ");
        Account account = new Account(sc.nextDouble());
        account.debit();
        sc.close();
    }
}
