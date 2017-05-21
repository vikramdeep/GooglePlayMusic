package com.example.a1691595.googleplaymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class newoverall extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newoverall);
    }


    public void back(View view) {
        Intent intent = new Intent(this, browse.class);
        startActivity(intent);
    }
}



