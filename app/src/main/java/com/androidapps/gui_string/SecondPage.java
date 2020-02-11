package com.androidapps.gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_page);
        TextView textView = findViewById(R.id.outPutText);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra(MainActivity.messageKey));

    }
}
