package com.example.screamitus_android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void calculateButtonPressed(View view) {

        TextView resultsLabel = findViewById(R.id.resultsLabel);
        EditText tbDays = findViewById(R.id.daysTextBox);

        int days = Integer.parseInt(tbDays.getText().toString());

//        // uncomment this code when you do your UI tests
//        Infection infection = new Infection();
//        int numInfected = infection.calculateTotalInfected(days);
//        resultsLabel.setText(String.valueOf(numInfected) + " instructors infected");

    }


//    public void dayMustBeGreaterThan0()
//    {
//        //R1 number of days must be >0
//        Infection x = new Infection();
//        double actualOutput=x.calculateTotalInfected(-12);
//
//        Assert.assertEquals(-1,actualOutput);
//    }

    public  void daysWithin5()
    {
        //R2 the virus infects instructors at the rate of 5 instructors/day
        Infection x = new Infection();
        double actualOutput=x.calculateTotalInfected(2);

        Assert.assertEquals(10,actualOutput);

    }
//
//    public  void daysAfter7()
//    {
//        //R3 after 7 days, infection rate changes to 8 instructor
//        Infection x = new Infection();
//        double actualOutput=x.calculateTotalInfected(9);
//        Assert.assertEquals(51,actualOutput);
//
//    }


}
