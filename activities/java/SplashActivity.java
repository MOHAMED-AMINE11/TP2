package com.example.pizzaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.pizzaapp.R;

public class SplashActivity extends AppCompatActivity {

    private ImageView logo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        logo = findViewById(R.id.logo);

        Animation rotateFast = AnimationUtils.loadAnimation(this, R.transition.rotate_fast);
        logo.startAnimation(rotateFast);

        logo.postDelayed(() -> {
            logo.clearAnimation();
            Animation rotateSlow = AnimationUtils.loadAnimation(this, R.transition.rotate_slow);
            logo.startAnimation(rotateSlow);

            rotateSlow.setAnimationListener(new Animation.AnimationListener() {
                @Override
                public void onAnimationStart(Animation animation) {}

                @Override
                public void onAnimationEnd(Animation animation) {
                    // Ajouter l'animation de brillance
                    Animation shine = AnimationUtils.loadAnimation(SplashActivity.this, R.transition.shine);
                    logo.startAnimation(shine);
                }

                @Override
                public void onAnimationRepeat(Animation animation) {}
            });
        }, 2000);  // Délai avant de ralentir

        // Passer à l'activité suivante après un certain temps (par exemple, 5 secondes)
        new Thread(() -> {
            try {
                Thread.sleep(5000);
                startActivity(new Intent(SplashActivity.this, ListPizzaActivity.class));
                finish();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }).start();
    }
}


