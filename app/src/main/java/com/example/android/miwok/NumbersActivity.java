package com.example.android.miwok;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class NumbersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_numbers);

        // Create array for number translation
//        String [] words = new String[10];
//        words[0] = "one";
//        words[1] = "two";
//        words[2] = "three";
//        words[3] = "four";
//        words[4] = "five";
//        words[5] = "six";
//        words[6] = "seven";
//        words[7] = "eight";
//        words[8] = "nine";
//        words[9] = "ten";

        // Create an ArrayList to store the number translations
        ArrayList<String> numbersArrayList = new ArrayList<String>();
        numbersArrayList.add("one");
        numbersArrayList.add("two");
        numbersArrayList.add("three");
        numbersArrayList.add("four");
        numbersArrayList.add("five");
        numbersArrayList.add("six");
        numbersArrayList.add("seven");
        numbersArrayList.add("eight");
        numbersArrayList.add("nine");
        numbersArrayList.add("ten");

        // Create an ArrayAdapter to display the numbers on the screen
        ArrayAdapter<String> numbersAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, numbersArrayList);
        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(numbersAdapter);
    }
}