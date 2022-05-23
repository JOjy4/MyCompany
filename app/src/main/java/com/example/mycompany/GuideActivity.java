package com.example.mycompany;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class GuideActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_guide);
        //Imageview img_map = findViewById(R.id.img_map);
        //img_map.setOnClickListener(this);

        findViewById(R.id.img_map).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(Intent.ACTION_VIEW,
                Uri.parse("geo:37.2570823, 127.0521345?z=15"));
        startActivity(intent);
    }
}