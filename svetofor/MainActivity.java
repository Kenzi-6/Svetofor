package com.example.svetofor;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void RED(View view) {
        getWindow().setBackgroundDrawableResource(R.color.red);
    }
    public void YELLOW(View view) {
        getWindow().setBackgroundDrawableResource(R.color.yellow);
    }
    public void GREEN(View view) {
        getWindow().setBackgroundDrawableResource(R.color.green);
    }
}