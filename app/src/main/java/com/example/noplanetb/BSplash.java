package com.example.noplanetb;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;


public class BSplash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bsplash);
        getSupportActionBar().hide();
        TextView myTitle = (TextView)findViewById(R.id.titulo);
        TextView mySubtitle = (TextView)findViewById(R.id.slogan);
        ImageView myImage = (ImageView)findViewById(R.id.cohete);

        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);

        myTitle.startAnimation(myanim);
        myImage.startAnimation(myanim);
        mySubtitle.startAnimation(myanim);
        openApp(true);
    }

    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(BSplash
                        .this, BLogin.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}