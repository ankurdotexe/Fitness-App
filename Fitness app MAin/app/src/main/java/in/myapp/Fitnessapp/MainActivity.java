package in.myapp.Fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button button1, button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolBar);
        setSupportActionBar(toolbar);


        button1 = findViewById(R.id.startFitness1);
        button2 = findViewById(R.id.startFitness2);


        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(intent);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
                startActivity(intent);

            }
        });
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
            String sharebody = "welcome to fitness app \n  This is the free app download now \n" +"https://play.google.com/store/apps/details?id=in.myapp.Fitnessapp&h1=en";
            String sharehub =  "fitness App";
            myIntent.putExtra(Intent.EXTRA_SUBJECT,sharehub);
            myIntent.putExtra(Intent.EXTRA_TEXT,sharebody);
            startActivity(Intent.createChooser(myIntent,"share using"));

            return true;
        }


        return true;
    }















    public void beforeage18(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity.class);
        startActivity(intent);
    }

    public void afteage18(View view) {
        Intent intent = new Intent(MainActivity.this,SecondActivity2.class);
        startActivity(intent);
    }

    public void food(View view) {
        Intent intent = new Intent(MainActivity.this,FoodActivity.class);
        startActivity(intent);
    }
}