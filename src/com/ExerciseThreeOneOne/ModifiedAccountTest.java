package com.ExerciseThreeOneOne;

import com.AccountWithConstructor.Account;

import javax.swing.*;
import java.sql.SQLOutput;
import java.util.Scanner;

public class ModifiedAccountTest {
    public static void main(String[] args) {
        ModifiedAccount myAccount1 = new ModifiedAccount("Ic_Daniels1",500.00);
        ModifiedAccount myAccount2 = new ModifiedAccount("Ic_Daniels2", -50.00);

        System.out.printf("%s Your Balance is : $ %.2f%n",myAccount1.getName(),myAccount1.getBalance());
        System.out.printf("%s Your Balance is : $ %.2f%n",myAccount2.getName(),myAccount2.getBalance());

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your deposit amount to IC_Daniels1: ");
        double depositAmount = input.nextDouble();
         myAccount1.deposit(depositAmount);
         if(depositAmount <0.00){
             System.out.println(" You Cannot deposit Negative Amount");
         }

        System.out.println("Enter your deposit amount to IC_Daniels2: ");
        depositAmount = input.nextDouble();
        myAccount2.deposit(depositAmount);

        System.out.printf("%s Your Balance is : $ %.2f%n",myAccount1.getName(),myAccount1.getBalance());
        System.out.printf("%s Your Balance is : $ %.2f%n",myAccount2.getName(),myAccount2.getBalance());

        //String output = String.format("%s Your Balance is : $ %.2f%n", myAccount1.getName(),myAccount1.getBalance());
        //JOptionPane.showMessageDialog(output);
       //JOptionPane.showInputDialog("")

        System.out.println("Enter your withdrawal amount from IC_Daniels1: ");
        double withdrawalAmount = input.nextDouble();
        myAccount1.withdraw(withdrawalAmount);

        System.out.println("Enter your withdrawal amount from IC_Daniels2: ");
        withdrawalAmount = input.nextDouble();
        myAccount2.withdraw(withdrawalAmount);

        System.out.printf("%s Your Balance is : $ %.2f%n",myAccount1.getName(),myAccount1.getBalance());
        System.out.printf("%s Your Balance is : $ %.2f%n",myAccount2.getName(),myAccount2.getBalance());

    }

}
