package com.co3.app5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import com.co3.app1.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = findViewById(R.id.listView);

        String[] items = {"Apple", "Mango", "Orange", "Grapes", "Banana"};

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_item, R.id.textViewItem, items);
        listView.setAdapter(adapter);
    }
}