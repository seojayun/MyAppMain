package com.example.myappmain;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class OpActivity extends AppCompatActivity {

    ImageView ivop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_op);

        ivop=(ImageView)findViewById(R.id.ivop);
        Glide.with(this).load(R.drawable.startop).into(ivop);


        ActionBar bar = getSupportActionBar();
        bar.hide();
        Handler hd = new Handler();
        hd.postDelayed(new Runnable() {//  postDelayed  3000=3초동안 딜레이 된 다음에 그 안에 있는 메소드 명령을 수행해라 라는 의미임.
            @Override
            public void run() {
                finish();
            }
        },4000);
    }
}
