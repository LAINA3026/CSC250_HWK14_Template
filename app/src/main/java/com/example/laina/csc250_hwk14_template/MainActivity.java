package com.example.laina.csc250_hwk14_template;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Person[] persons = new Person[4];
        persons[0] = new Person("Mike", "Litman", 21, "male", 125.31);
        persons[1] = new Person("Gail", "Litman", 40, "female", 13.28);
        persons[2] = new Person("David", "Litman", 19, "male", 0);
        persons[3] = new Person("Larry", "Litman", 42, "male", 427);

       // Arrays.sort(persons);

        this.printArray(persons);
    }

    private void printArray(Person[] p)
    {
        for(int i = 0; i < p.length; i++)
        {
            System.out.println(p[i]);
        }

    }
}
