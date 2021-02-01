package com.ExerciseThreeOneOne;

/*3.11 (Modified Account Class) Modify class Account (Fig. 3.8) to provide a method called withdraw
        that withdraws money from an Account. Ensure that the withdrawal amount does not exceed
        the Account’s balance. If it does, the balance should be left unchanged and the method should print
        a message indicating "Withdrawal amount exceeded account balance." Modify class AccountTest
        (Fig. 3.9) to test method withdraw.
package com.ModifiedAccount;*/

import java.sql.SQLOutput;

public class ModifiedAccount {
    private String name;
    private double balance;

    public ModifiedAccount(String name, double balance) {
        this.name = name;

        if (balance > 0.0)
            this.balance = balance;
    }
        public void deposit(double depositAmount){
            if (depositAmount > 0.0) {
                balance = balance + depositAmount;
            }
            else {
                System.out.println("Sorry Negative Deposit is not Allowed! ");
                System.out.println();
            }
        }
        public double getBalance(){
            return balance;
        }
        public void withdraw(double withdrawalAmount){
            if (withdrawalAmount > 0.0 && withdrawalAmount < balance) {
                balance = balance - withdrawalAmount;

         }
            else {
                System.out.println("Sorry You Cannot Deposit Negative Amount");
                System.out.println();
            }

        }
        public void setName(String name){
            this.name = name;
        }
        public String getName()
        {
            return name;
        }

    }


