package com.guardianforcegaming.dicebuddy;

import android.app.Activity;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.support.annotation.Nullable;
import android.util.DisplayMetrics;
import android.widget.TextView;

/**
 * Created by Jon on 4/11/2018.
 */

public class Pop extends Activity{
    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.popwindow);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);

        final TextView rolls = (TextView)findViewById(R.id.txtDisplayD4);
        final TextView rollsD6 = (TextView)findViewById(R.id.txtDisplayD6);
        final TextView rollsD8 = (TextView)findViewById(R.id.txtDisplayD8);
        final TextView rollsD10 = (TextView)findViewById(R.id.txtDisplayD10);
        final TextView rollsD12 = (TextView)findViewById(R.id.txtDisplayD12);
        final TextView rollsD20 = (TextView)findViewById(R.id.txtDisplayD20);
        final TextView display = (TextView)findViewById(R.id.txtTitle);

        int width = dm.widthPixels;
        int height = dm.heightPixels;

        getWindow().setLayout((int)(width*.75),(int)(height*.75));
        SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        int roll = sharedPref.getInt("key", 0);
        String individualD4 = sharedPref.getString("key1", "DEFAULT");
        String individualD6 = sharedPref.getString("key2", "DEFAULT");
        String individualD8 = sharedPref.getString("key3", "DEFAULT");
        String individualD10 = sharedPref.getString("key4", "DEFAULT");
        String individualD12 = sharedPref.getString("key5", "DEFAULT");
        String individualD20 = sharedPref.getString("key6", "DEFAULT");
        rolls.setText(individualD4);
        rollsD6.setText(individualD6);
        rollsD8.setText(individualD8);
        rollsD10.setText(individualD10);
        rollsD12.setText(individualD12);
        rollsD20.setText(individualD20);
        display.setText(String.valueOf(roll));



    }
}
