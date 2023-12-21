package com.co1.app4;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    private EditText etName, etPhone, etAddress;
    private CheckBox checkBox;

    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etName = findViewById(R.id.et_name);
        etPhone = findViewById(R.id.et_phone);
        etAddress = findViewById(R.id.et_address);
        checkBox = findViewById(R.id.checkBox);
        radioGroup = findViewById(R.id.radiogroup);

        Button validateButton = findViewById(R.id.validateButton);
        validateButton.setOnClickListener(view -> validateInputs());
    }

    private void validateInputs() {
        int selectedRadioButtonId = radioGroup.getCheckedRadioButtonId();
        String userName = etName.getText().toString().trim();
        String userPhone = etPhone.getText().toString().trim();
        String userAddress = etAddress.getText().toString().trim();

        if (userName.isEmpty()) {
            etName.requestFocus();
            etName.setError("Enter Name");
            return;
        }

        if (userPhone.isEmpty()) {
            etPhone.requestFocus();
            etPhone.setError("Enter Phone");
            return;
        }

        if (userPhone.length() < 10) {
            etPhone.requestFocus();
            etPhone.setError("Enter valid phone number");
            return;
        }

        if (selectedRadioButtonId == -1) {
            showToast("Select Gender");
            return;
        } else {
            if (selectedRadioButtonId == R.id.radio_male) {
                // Action
            } else if (selectedRadioButtonId == R.id.radio_female) {
                // Action
            }
        }

        if (userAddress.isEmpty()) {
            etAddress.requestFocus();
            etAddress.setError("Enter Address");
            return;
        }

        if (!checkBox.isChecked()) {
            showToast("Accept the terms and conditions");
            return;
        }

        showToast("Validation successful!");
    }

    private void showToast(String message) {
        Toast.makeText(MainActivity.this, message, Toast.LENGTH_SHORT).show();
    }
}