package com.example.javaapp;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




    }


        public void Toast (View view)
        {
            if (view.getId() == R.id.button1)
            {

                Toast.makeText(this, "Hello My Friend", Toast.LENGTH_SHORT).show();
            }


        }
    public void Log (View view)
    {
        if (view.getId() == R.id.button2)
        {

            Log.i("info", "This is a message in the log");

        }


    }
}


