package com.ezeagu.android.tourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Open new activty on layout click
        LinearLayout lagos = (LinearLayout) findViewById(R.id.lagos_activity);
        lagos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, LagosActivity.class);
                startActivity(intent);
            }
        });

        // Open new activty on layout click
        LinearLayout anambra = (LinearLayout) findViewById(R.id.anambra_activity);
        anambra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AnambraActivity.class);
                startActivity(intent);
            }
        });

        // Open new activty on layout click
        LinearLayout abuja = (LinearLayout) findViewById(R.id.abuja_activity);
        abuja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, AbujaActivity.class);
                startActivity(intent);
            }
        });

        Animation blinkAnimation = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.blink_animation);
        TextView animText = (TextView) findViewById(R.id.animate_text);
        animText.startAnimation(blinkAnimation);

    }
}
