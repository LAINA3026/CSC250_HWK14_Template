package com.example.laina.csc250_hwk14_template;

/**
 * Created by LAINA on 11/30/2017.
 */

public class Person implements Comparable<Person>
{
    protected String firstName;
    protected String lastName;
    protected int age;
    protected String gender;


    public Person(String firstName, String lastName, int age, String gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.balance = balance;
    }
    public int compareTo(Person p)
    {
        return this.firstName.compareTo(p.firstName);
        //or .compareToIgnoreCase(p.firstName);

       /* if(this.age == p.age)
        {
            return 0;
        }
        else if(this.age < p.age)
        {
            return -1;
        }
        else if(this.age > p.age)
        {
            return 1;
        } */
    }
    public String toString()
    {
        return this.firstName + " " + this.lastName + " age: " + this.age + "gender: " + this.gender + "balance: " +this.balance;
        //return String.format("%s %s age: %d gender: %s %s", this.firstName, this.lastName, this.age, this.gender, this.balance);
    }
}
