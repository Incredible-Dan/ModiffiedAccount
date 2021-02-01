package com.AccountWithConstructor;

public class Account {
    private String name; // instance variable

    // constructor initializes name with parameter name
    public Account(String name)
    {
        this.name =name;
    }
    //method to set the name
    public String getName()
    {
        return name;
    }
} // end class Account
