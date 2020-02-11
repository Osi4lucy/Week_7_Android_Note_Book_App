package com.androidapps.gui_string;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class MainActivity extends AppCompatActivity {
public static final String messageKey = "MESSAGE_KEY";

    private String message=" ";

    private EditText txtEditor;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtEditor=(EditText)findViewById(R.id.textBox);

    }

    public void onClickSave(View view) {
        message = txtEditor.getText().toString();
        Log.i("all", "Saved " + message);
    }

    public void goToViewText(View view){
        Intent intent = new Intent(this, SecondPage.class);
        intent.putExtra(messageKey, message);
        startActivity(intent);
    }
}
