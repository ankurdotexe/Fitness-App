package in.myapp.Fitnessapp;

import android.content.Context;

import androidx.multidex.MultiDex;
import androidx.multidex.MultiDexApplication;

public class MyApplication extends MultiDexApplication {


    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
