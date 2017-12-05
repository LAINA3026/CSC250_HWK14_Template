package com.example.laina.csc250_hwk14_template;

/**
 * Created by LAINA on 11/30/2017.
 */
//private only accessible in class name

public class Patient extends Person
{
    private double balance;

    public Patient(String firstName, String LastName, int age, String gender, double balance)
    {
        super(firstName, lastName, age, gender); //MUST be the first line in this contructor
        this.balance = balance;
    }
    public String toString()
    {
        return String.format("%s Balance: %f", super.toString(), this.balance);
    }
}
