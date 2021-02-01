package com.AccountNameAndBalance;

import java.util.Scanner;

public class AccountNameAndBalanceTest {
    public static void main(String[] args) {
        AccountNameAndBalance accountOne = new AccountNameAndBalance("IC Daniel1",100.00);
        AccountNameAndBalance accountTwo = new AccountNameAndBalance("IC Daniel2",100.00);
        System.out.println("\t\t\tMy Account Details are : \n");
        System.out.printf("Account name is :%s\t\t: Account balance is: $ %.2f%n%n ",accountOne.getName(), accountOne.getBalance());
        System.out.printf("Account name is :%s\t: Account balance is: $ %.2f %n%n",accountTwo.getName(), accountTwo.getBalance());

        //create deposit method and user input prompt for deposit.
        Scanner input = new Scanner(System.in);
        //enter deposit amount
        System.out.println("Enter deposit amount for accountOne");
        double depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to balance%n%n",depositAmount);
        accountOne.deposit(depositAmount);
        // display the balance
        System.out.printf("%s's\t\t: Account balance is: $ %.2f%n%n ",accountOne.getName(), accountOne.getBalance());
        // enter deposit amount
        System.out.println("Enter deposit amount for accountTwo");
        depositAmount = input.nextDouble();
        System.out.printf("%nAdding $%.2f to balance%n%n",depositAmount);
        accountTwo.deposit(depositAmount);
        // display the balance
        System.out.printf("%s's\t\t: Account balance is: $ %.2f%n%n ",accountTwo.getName(), accountTwo.getBalance());

    }

}
