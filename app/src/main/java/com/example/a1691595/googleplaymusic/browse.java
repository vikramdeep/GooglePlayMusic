package com.example.a1691595.googleplaymusic;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class browse extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.browseee);
    }

    public void newoverall(View view) {
        Intent intent = new Intent(this,newoverall.class);
        startActivity(intent);

    }
    public void backer(View view) {
        Intent intent = new Intent(this, browssattuion.class);
        startActivity(intent);
    }
}

