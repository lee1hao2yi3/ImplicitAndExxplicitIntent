package com.example.java2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class intent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intent);

        Toast toast = Toast.makeText(getApplicationContext(),"Hi Airost",Toast.LENGTH_LONG);
        toast.show();

    }
}