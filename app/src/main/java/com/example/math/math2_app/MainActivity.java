package com.example.math.math2_app;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void generate(View v){
        //generate random number 2
        Integer num1, num2;
        num1 = generateRandomNumber(10);
        num2 = generateRandomNumber(100);

        //set random number in textView
        TextView tv;
        tv = findViewById(R.id.text);
        tv.setText(Integer.toString(num1)+ "x" +Integer.toString(num2));


    }
    public void answerCheck(View view){

        //read question....:-

        TextView tv = findViewById(R.id.answer_check);
        String answer_check = tv.getText().toString();
        Log.d("Q" , answer_check);


        //split numbers....:-
        String[] numbers = answer_check.split("X");

        //numbers = {"5" , "60"}
        Log.d("numbers" , numbers[0] + "," + numbers[1]);

        //convert numbers into integers....:-
        Integer num1, num2;
        num1 = Integer.valueOf(numbers[0]);
        num2 = Integer.valueOf(numbers[1]);

        Log.d("Int numbers" , String.format("%s %s", Integer.toString(num1), Integer.toString(num2)));


    }

    public int generateRandomNumber(int limit){
        Random r = new Random();
        Integer i;
        i = r.nextInt(limit);

        return i;

    }
}
