package in.myapp.Fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splashscreenok extends AppCompatActivity {
    Animation up,down;
    ImageView imageView;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashscreenok);


        ImageView imageView = findViewById(R.id.appsplsh);
        up = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.up);
        imageView.setAnimation(up);

        TextView textView = findViewById(R.id.appname);
        down = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.down);
        textView.setAnimation(down);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(getApplicationContext(),MainActivity.class));
                finish();
            }
        },3500);
    }
}