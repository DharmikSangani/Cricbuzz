package com.example.cricbuzz;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    ImageView main_img1, main_img2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        main_img1 = findViewById(R.id.main_img1);
        main_img2 = findViewById(R.id.main_img2);

        main_img1.setOnClickListener((View.OnClickListener) this);
        main_img2.setOnClickListener((View.OnClickListener) this);


    }

    @Override
    public void onClick(View v)
    {
        if(v.getId()==main_img1.getId())
        {
            Intent intent=new Intent(MainActivity.this,OtherActivity.class);
            startActivity(intent);
        }
        else if(v.getId()==main_img2.getId())
        {
            Intent intent=new Intent(MainActivity.this,OtherActivity.class);
            startActivity(intent);
        }
    }
}