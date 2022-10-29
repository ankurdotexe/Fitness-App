package in.myapp.Fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class SecondActivity2 extends AppCompatActivity {

    int[] newArray;
    private AdView mAdView, mAdView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);


        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);




        mAdView1 = findViewById(R.id.adView1);
        AdRequest adRequest1 = new AdRequest.Builder().build();
        mAdView1.loadAd(adRequest1);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);

        newArray = new int[]{

                R.id.bow_pose,R.id.bridge_pose,R.id.chair_pose,R.id.cobbler_pose,
                R.id.cow_pose,R.id.playji_pose,R.id.pause_pose,R.id.plank_pose,
                R.id.crunches_pose,R.id.situp_pose,R.id.rotation_pose,R.id.twist_pose,
                R.id.windmill_pose,R.id.legup_pose,
        };

    }








    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.main,menu);
        return true;
    }




    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item)
    {
        int id = item.getItemId();
        if(id == R.id.id_privacy)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.freeprivacypolicy.com/live/5307628a-a7d4-4b30-b284-5d1328eefbc8"));
            startActivity(intent);
            return true;
        }

        if(id == R.id.id_term)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.termsfeed.com/live/557ea671-a2fc-4215-9db5-bf199d994bdd"));
            startActivity(intent);
            return true;
        }

        if(id == R.id.rate)
        {
            try {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("market://details?id=" +getPackageName())));
            }
            catch (Exception ex)
            {
                startActivity(new Intent(Intent.ACTION_VIEW,Uri.parse("https://play.google.com/store/apps/details?id=" +getPackageName())));
            }
            return true;
        }

        if(id == R.id.more)
        {
            Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://play.google.com/store/search?q=fitness+apps&c=apps"));
            startActivity(intent);
            return true;
        }

        if(id == R.id.share)
        {
            Intent myIntent = new Intent(Intent.ACTION_SEND);
            myIntent.setType("text/plain");
            String sharebody = "Welcome to fitness app \n  This is the free app download now \n" +"https://play.google.com/store/apps/details?id=in.myapp.Fitnessapp&h1=en";
            String sharehub =  "Fitness  App";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(myIntent,"share using"));

            return true;
        }


        return true;
    }







    public void Imagebuttonclicked(View view)
    {
        for (int i=0 ; i< newArray.length; i++)
        {
            if(view.getId()== newArray[i])
            {
                int value = i+1;
                Log.i("FIRST",String.valueOf(value));
                Intent intent = new Intent(SecondActivity2.this,ThirdActivity2.class);
                intent.putExtra("value",String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}