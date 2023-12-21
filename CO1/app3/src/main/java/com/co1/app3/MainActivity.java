package com.co1.app3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText val1, val2;
    Button add, min, mul, div;
    TextView res;

    int a,b = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        val1 = findViewById(R.id.val1);
        val2 = findViewById(R.id.val2);
        res = findViewById(R.id.result);
        add = findViewById(R.id.btnAdd);
        min = findViewById(R.id.btnMin);
        mul = findViewById(R.id.btnMul);
        div = findViewById(R.id.btnDiv);

        add.setOnClickListener(View -> {
            if (!val1.getText().toString().equals("") && !val2.getText().toString().equals("")) {
                a = Integer.parseInt(val1.getText().toString().trim());
                b = Integer.parseInt(val2.getText().toString().trim());
                res.setText(String.valueOf(a+b));
            }
        });

        min.setOnClickListener(View -> {
            if (!val1.getText().toString().equals("") && !val2.getText().toString().equals("")) {
                a = Integer.parseInt(val1.getText().toString().trim());
                b = Integer.parseInt(val2.getText().toString().trim());
                res.setText(String.valueOf(a-b));
            }
        });

        mul.setOnClickListener(View -> {
            if (!val1.getText().toString().equals("") && !val2.getText().toString().equals("")) {
                a = Integer.parseInt(val1.getText().toString().trim());
                b = Integer.parseInt(val2.getText().toString().trim());
                res.setText(String.valueOf(a*b));
            }
        });

        div.setOnClickListener(View -> {
            if (!val1.getText().toString().equals("") && !val2.getText().toString().equals("")) {
                a = Integer.parseInt(val1.getText().toString().trim());
                b = Integer.parseInt(val2.getText().toString().trim());
                res.setText(String.valueOf(a/b));
            }
        });
    }
}