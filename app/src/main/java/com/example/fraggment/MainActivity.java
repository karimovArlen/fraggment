package com.example.fraggment;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initfragmet();
    }


    private void initfragmet() {
        getSupportFragmentManager().beginTransaction().add(R.id.main_box,new fisrFragment()).commit();
    }

}