package com.co2.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView1, imageView2;
    private FrameLayout frameLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageView1 = findViewById(R.id.img1);
        imageView2 = findViewById(R.id.img2);
        frameLayout = findViewById(R.id.frame);

        frameLayout.setOnClickListener(v -> {
            if (imageView1.getVisibility() == View.VISIBLE) {
                imageView1.setVisibility(View.GONE);
                imageView2.setVisibility(View.VISIBLE);
            } else {
                imageView1.setVisibility(View.VISIBLE);
                imageView2.setVisibility(View.GONE);
            }
        });
    }
}