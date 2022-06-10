package com.example.dontpressthebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    public void Press1 (View view){
        Uri uri = Uri.parse("tel:055 11 40028922");
        Intent it = new Intent (Intent.ACTION_DIAL,uri);
        startActivity(it);
    }
}