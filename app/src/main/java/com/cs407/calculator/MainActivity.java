package com.cs407.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivity(String s){
        Log.i("INFO" ,s);
        Intent intent = new Intent(this, CalculatorOutput.class);
        intent.putExtra("message", s);
        startActivity(intent);
    }

    public void clickAdd(View view) {
        EditText text1 = findViewById(R.id.num1);
        EditText text2 = findViewById(R.id.num2);

        String num1Str = text1.getText().toString();
        String num2Str = text2.getText().toString();

        // Check if the strings are not empty and are valid numbers
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            Double num1 = Double.parseDouble(num1Str);
            Double num2 = Double.parseDouble(num2Str);

            Log.i("Doubles", num1 + " " + num2);

            Double finish = num1 + num2;
            goToActivity(String.valueOf(finish));
        } else {
            Log.i("ERROR", "Please enter valid numbers.");
        }
    }



    public void clickSubtract(View view){
        EditText text1 = findViewById(R.id.num1);
        EditText text2 = findViewById(R.id.num2);

        String num1Str = text1.getText().toString();
        String num2Str = text2.getText().toString();

        // Check if the strings are not empty and are valid numbers
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            Double num1 = Double.parseDouble(num1Str);
            Double num2 = Double.parseDouble(num2Str);

            Log.i("Doubles", num1 + " " + num2);

            Double finish = num1 - num2;
            goToActivity(String.valueOf(finish));
        } else {
            Log.i("ERROR", "Please enter valid numbers.");
        }
    }

    public void clickMultiply(View view){
        EditText text1 = findViewById(R.id.num1);
        EditText text2 = findViewById(R.id.num2);

        String num1Str = text1.getText().toString();
        String num2Str = text2.getText().toString();

        // Check if the strings are not empty and are valid numbers
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            Double num1 = Double.parseDouble(num1Str);
            Double num2 = Double.parseDouble(num2Str);

            Log.i("Doubles", num1 + " " + num2);

            Double finish = num1 * num2;
            goToActivity(String.valueOf(finish));
        } else {
            Log.i("ERROR", "Please enter valid numbers.");
        }
    }

    public void clickDivide(View view){
        EditText text1 = findViewById(R.id.num1);
        EditText text2 = findViewById(R.id.num2);

        String num1Str = text1.getText().toString();
        String num2Str = text2.getText().toString();

        // Check if the strings are not empty and are valid numbers
        if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
            Double num1 = Double.parseDouble(num1Str);
            Double num2 = Double.parseDouble(num2Str);

            Log.i("Doubles", num1 + " " + num2);

            Double finish = num1 / num2;
            if (Double.isInfinite(finish)) goToActivity("Infinity Error");
            else goToActivity(String.valueOf(finish));
        } else {
            Log.i("ERROR", "Please enter valid numbers.");
        }
    }
}