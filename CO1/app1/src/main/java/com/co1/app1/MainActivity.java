package com.co1.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.uname);
        password = findViewById(R.id.pass);
        login = findViewById(R.id.btnlogin);

        login.setOnClickListener(View -> {
            String name = username.getText().toString();
            String pass = password.getText().toString();

            if (name.equals("admin") && pass.equals("admin")) {
                Toast.makeText(MainActivity.this, "Login Success", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
            }

        });
    }
}