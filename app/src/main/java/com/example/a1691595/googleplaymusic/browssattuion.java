package com.example.a1691595.googleplaymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class browssattuion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browssattuionn);
    }


    public void lib(View view) {
        Intent intent = new Intent(this,library.class);
        startActivity(intent);
    }
    public void home(View view) {
        Intent intent = new Intent(this,home.class);
        startActivity(intent);
    }
}




