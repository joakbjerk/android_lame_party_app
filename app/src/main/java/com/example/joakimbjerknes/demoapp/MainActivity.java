package com.example.joakimbjerknes.demoapp;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class MainActivity extends AppCompatActivity {

    private TextView mMessageDisplayTV;
    private ToggleButton mPartyToggleBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    };


    public void togglePartyMode(View view) {
        mMessageDisplayTV = (TextView) findViewById(R.id.messageDisplayTV);
        mPartyToggleBtn = (ToggleButton) findViewById(R.id.partyToggleBtn);
        boolean isChecked = mPartyToggleBtn.isChecked();
        if(isChecked) {
            Toast.makeText(MainActivity.this, "party mode on!", Toast.LENGTH_LONG);
            mMessageDisplayTV.setTextColor(getResources().getColor(R.color.green));
        } else {
            Toast.makeText(MainActivity.this, "party mode off!", Toast.LENGTH_LONG);
            mMessageDisplayTV.setTextColor(getResources().getColor(R.color.red));
        }
    }

    public void showMessage(View view) {
        mMessageDisplayTV = (TextView) findViewById(R.id.messageDisplayTV);
        mMessageDisplayTV.setTextSize(48);
        mMessageDisplayTV.setText("PAAAAAAARTY!");
    }
}
