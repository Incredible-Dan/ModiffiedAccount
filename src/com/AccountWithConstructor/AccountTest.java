package com.AccountWithConstructor;
// using the constructor to initialize the name instance
// variable at the time each Account object is created
public class AccountTest {

    public static void main(String[] args) {

        Account account1 =  new Account("IC Daniel");

        Account account2 = new Account("Incredible Dan");

        // displays initial value of name for each Amount

        System.out.printf("account1 name is : %s%n",account1.getName());

        System.out.printf("account1 name is : %s%n",account2.getName());

    }
}//end class AccountTest
