package com.co2.app1;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class HomeActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences;
    TextView txt;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        txt = findViewById(R.id.txt);
        sharedPreferences = getSharedPreferences("sp", MODE_PRIVATE);

        txt.setText("Welcome, "+sharedPreferences.getString("username", null));
    }
}
