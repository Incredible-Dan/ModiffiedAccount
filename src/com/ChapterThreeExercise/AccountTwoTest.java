package com.ChapterThreeExercise;
    //Creating and Manipulating an AccountTwo object
import java.util.Scanner;

public class AccountTwoTest {
    public static void main(String[] args) {

        //Creates a Scanner object to obtain input from the command window
        Scanner input  = new Scanner(System.in);
        //Create an AccountTwo object and assigns it to myAccountTWo
        AccountTwo myAccountTwo  = new AccountTwo();
        // displays initial value of name (null)

        System.out.printf("Initial name is : %s%n%n",myAccountTwo.getName());
        System.out.println("Please enter the name :");// prompts for and reads name
        String myAccountTwo_Name = input.nextLine(); // reads a line of text from User
        myAccountTwo.setName(myAccountTwo_Name);//puts myAccountTwo_Name in AccountTwo
        System.out.println(); //outputs a blank line
        //displays the name set or stored in object myAccountTwo
        System.out.printf("Name in object myAccountTwo is : %n%s%n", myAccountTwo.getName());

    }
}
