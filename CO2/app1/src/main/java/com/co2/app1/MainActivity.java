package com.co2.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button btnLogin;
    SharedPreferences sharedPreferences;
    SharedPreferences.Editor editor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.uname);
        password = findViewById(R.id.pass);
        btnLogin = findViewById(R.id.btnlogin);
        sharedPreferences = getSharedPreferences("sp", MODE_PRIVATE);
        editor = sharedPreferences.edit();

        btnLogin.setOnClickListener(View -> {
            if (!username.getText().toString().isEmpty() || !password.getText().toString().isEmpty()) {
                editor.putString("username", username.getText().toString());
                editor.putString("pass", password.getText().toString());
                editor.apply();
                startActivity(new Intent(MainActivity.this, HomeActivity.class));
            }
        });

    }
}