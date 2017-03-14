package com.savelife.serviceexample;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import java.io.FileOutputStream;
import java.lang.String;


public class MainActivity extends AppCompatActivity {
private

    Spinner hour1,min1,ampm1,hour2,min2,ampm2;
    Button B1,B2;
    TextView b1,b2;
    int p1_hour,p1_min,p1_ante;
    int p2_hour,p2_min,p2_ante;
    String userDefinedTime1,userDefinedTime2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Calling a Service to Restart app after it is closed.

        startService(new Intent(MainActivity.this, UpdateService.class));

        //Declaring everything

        hour1 = (Spinner)findViewById(R.id.f_hour);
        min1 = (Spinner)findViewById(R.id.f_min);
        ampm1 = (Spinner)findViewById(R.id.f_am_pm);
        hour2 = (Spinner)findViewById(R.id.t_hour);
        min2 = (Spinner)findViewById(R.id.t_min);
        ampm2 = (Spinner)findViewById(R.id.t_am_pm);
        b1 = (TextView)findViewById(R.id.b1);
        b2 = (TextView)findViewById(R.id.b2);
        B1=(Button)findViewById(R.id.btn_timer1);
        B2=(Button)findViewById(R.id.btn_timer2);


        ////////////////////////////////////////////////////////////////////////////////////////////

        //Setting up 6 spinners for getting user input.

        hour1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {

                    case 0 :
                        p1_hour=1;
                        break;

                    case 1:
                        p1_hour=2;
                        break;

                    case 2:
                        p1_hour=3;
                        break;

                    case 3:
                        p1_hour=4;
                        break;

                    case 4:
                        p1_hour=5;
                        break;

                    case 5:
                        p1_hour=6;
                        break;

                    case 6:
                        p1_hour=7;
                        break;

                    case 7:
                        p1_hour=8;
                        break;

                    case 8:
                        p1_hour=9;
                        break;

                    case 9:
                        p1_hour=10;
                        break;

                    case 10:
                        p1_hour=11;
                        break;

                    case 11:
                        p1_hour=12;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        min1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {

                    case 0:
                        p1_min=0;
                        break;

                    case 1:
                        p1_min=5;
                        break;

                    case 2:
                        p1_min=10;
                        break;

                    case 3:
                        p1_min=15;
                        break;

                    case 4:
                        p1_min=20;
                        break;

                    case 5:
                        p1_min=25;
                        break;

                    case 6:
                        p1_min=30;
                        break;

                    case 7:
                        p1_min=35;
                        break;

                    case 8:
                        p1_min=40;
                        break;

                    case 9:
                        p1_min=45;
                        break;

                    case 10:
                        p1_min=50;
                        break;

                    case 11:
                        p1_min=55;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        ampm1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {

                    case 0 :
                        p1_ante=0;
                        break;

                    case 1:
                        p1_ante=1;
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        hour2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {

                    case 0 :
                        p2_hour=1;
                        break;

                    case 1:
                        p2_hour=2;
                        break;

                    case 2:
                        p2_hour=3;
                        break;

                    case 3:
                        p2_hour=4;
                        break;

                    case 4:
                        p2_hour=5;
                        break;

                    case 5:
                        p2_hour=6;
                        break;

                    case 6:
                        p2_hour=7;
                        break;

                    case 7:
                        p2_hour=8;
                        break;

                    case 8:
                        p2_hour=9;
                        break;

                    case 9:
                        p2_hour=10;
                        break;

                    case 10:
                        p2_hour=11;
                        break;

                    case 11:
                        p2_hour=12;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        min2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {

                    case 0:
                        p2_min=0;
                        break;

                    case 1:
                        p2_min=5;
                        break;

                    case 2:
                        p2_min=10;
                        break;

                    case 3:
                        p2_min=15;
                        break;

                    case 4:
                        p2_min=20;
                        break;

                    case 5:
                        p2_min=25;
                        break;

                    case 6:
                        p2_min=30;
                        break;

                    case 7:
                        p2_min=35;
                        break;

                    case 8:
                        p2_min=40;
                        break;

                    case 9:
                        p2_min=45;
                        break;

                    case 10:
                        p2_min=50;
                        break;

                    case 11:
                        p2_min=55;
                        break;
                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        ampm2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int position, long id) {
                switch (position) {

                    case 0 :
                        p2_ante=0;
                        break;

                    case 1:
                        p2_ante=1;
                        break;
                }

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        //Setting an OnclickListener for performing Silent Function.

        B1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                userDefinedTime1 = Integer.toString(p1_hour) + ":" + Integer.toString(p1_min) + ":" + Integer.toString(p1_ante);
                b1.setText(userDefinedTime1);
                try{
                    FileOutputStream f1out = openFileOutput("userStartTime", Context.MODE_PRIVATE);
                    f1out.write(userDefinedTime1.getBytes());
                    f1out.close();
                } catch(Exception e) { }
            }
        });

        ////////////////////////////////////////////////////////////////////////////////////////////

        //Setting an OnclickListener for performing Ringer Function.

        B2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)  {
                userDefinedTime2 = Integer.toString(p2_hour) + ":" + Integer.toString(p2_min) + ":" + Integer.toString(p2_ante);
                b2.setText(userDefinedTime2);
                try{
                    FileOutputStream f2out = openFileOutput("userStopTime", Context.MODE_PRIVATE);
                    f2out.write(userDefinedTime2.getBytes());
                    f2out.close();
                } catch(Exception e) { }
            }
        });
    }
}
