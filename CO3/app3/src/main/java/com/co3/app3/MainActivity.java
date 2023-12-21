package com.co3.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText url;
    Button btn_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        url = findViewById(R.id.et_url);
        btn_login = findViewById(R.id.btn_open);

        btn_login.setOnClickListener( v -> {
            String link = url.getText().toString().trim();
            if (link.startsWith("http://") || link.startsWith("https://")) {
                startActivity(new Intent(Intent.ACTION_VIEW, Uri.parse(link)));
            } else {
                Toast.makeText(MainActivity.this, "Enter a valid URL", Toast.LENGTH_SHORT).show();
            }
        });
    }
}