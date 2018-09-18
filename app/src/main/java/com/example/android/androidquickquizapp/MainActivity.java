package com.example.android.androidquickquizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Initializing all the RadioGroups used in the App
    RadioGroup radioGroup1, radioGroup2, radioGroup3, radioGroup4, radioGroup5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    /*
    TOTAL SCORE METHOD IS USED TO CALCULATE THE TOTAL SCORE THE PERSON GOT!
    It uses a conditional IF Else If Statement where we check the RadioButton ID to determine the right answer.

     */
    public int totalscore() {
        int total = 0;
        radioGroup1 = findViewById(R.id.radio_group1);
        int radioId1 = radioGroup1.getCheckedRadioButtonId();
        if (radioId1 == R.id.radio_group1_1) {
            total = total + 1;
        } else {
            return total;
        }
        radioGroup2 = findViewById(R.id.radio_group2);
        int radioId2 = radioGroup2.getCheckedRadioButtonId();
        if (radioId2 == R.id.radio_group2_2) {
            total = total + 1;
        } else {
            return total;
        }
        radioGroup3 = findViewById(R.id.radio_group3);
        int radioId3 = radioGroup3.getCheckedRadioButtonId();
        if (radioId3 == R.id.radio_group3_1) {
            total = total + 1;
        } else {
            return total;
        }
        radioGroup4 = findViewById(R.id.radio_group4);
        int radioId4 = radioGroup4.getCheckedRadioButtonId();
        if (radioId4 == R.id.radio_group4_1) {
            total = total + 1;
        } else {
            return total;
        }
        radioGroup5 = findViewById(R.id.radio_group5);
        int radioId5 = radioGroup5.getCheckedRadioButtonId();
        if (radioId5 == R.id.radio_group5_2) {
            total = total + 1;
        } else {
            return total;
        }

        return total;
    }
    /*
    The Submit Score method is used to display the result of the Person in the Quiz using a Toast method
     */
    public void submit_score(View view) {
        int total_score = totalscore();
        EditText name = findViewById(R.id.name);
        String thename = name.getText().toString();
        Toast.makeText(this, "Hey " + thename + "! Your score is :" + total_score, Toast.LENGTH_SHORT).show();

    }
}
