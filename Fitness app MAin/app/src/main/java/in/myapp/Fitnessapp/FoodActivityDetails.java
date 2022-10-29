package in.myapp.Fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class FoodActivityDetails extends AppCompatActivity
{
    TextView textView;
    private AdView mAdView;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_food_details);



        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        textView = findViewById(R.id.txt);
        String dstory = getIntent().getStringExtra("story");
        textView.setText(dstory);


    }

    public void gooback(View view)
    {
        Intent intent = new Intent(FoodActivityDetails.this,FoodActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void onBackPressed()
    {
        Intent intent = new Intent(FoodActivityDetails.this,FoodActivity.class);
        startActivity(intent);
        finish();
    }
}