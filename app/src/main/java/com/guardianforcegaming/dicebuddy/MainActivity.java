package com.guardianforcegaming.dicebuddy;

import android.content.Intent;
import android.content.SharedPreferences;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final SharedPreferences sharedPref = PreferenceManager.getDefaultSharedPreferences(this);
        final SharedPreferences.Editor editor = sharedPref.edit();

        //text view to hold amount of dice to roll
        final TextView d4 = (TextView) findViewById(R.id.num4);
        final TextView d6 = (TextView) findViewById(R.id.num6);
        final TextView d8 = (TextView)findViewById(R.id.num8);
        final TextView d10 = (TextView) findViewById(R.id.num10);
        final TextView d12 = (TextView) findViewById(R.id.num12);
        final TextView d20 = (TextView)findViewById(R.id.num20);
        // dice objects created
        final Dice four = new Dice(4);
        final Dice six = new Dice(6);
        final Dice eight = new Dice(8);
        final Dice ten = new Dice(10);
        final Dice twelve = new Dice(12);
        final Dice twenty = new Dice(20);
        // buttons
        Button btnRoll = (Button)findViewById(R.id.btnRoll);
        Button btnClear = (Button)findViewById(R.id.btnClear);
        ImageButton btnDown4 = (ImageButton)findViewById(R.id.btnDown4);
        ImageButton btnUp4 = (ImageButton)findViewById(R.id.btnUp4);
        ImageButton btnDown6 = (ImageButton)findViewById(R.id.btnDown6);
        ImageButton btnUp6 = (ImageButton)findViewById(R.id.btnUp6);
        ImageButton btnDown8 = (ImageButton)findViewById(R.id.btnDown8);
        ImageButton btnUp8 = (ImageButton)findViewById(R.id.btnUp8);
        ImageButton btnDown10 = (ImageButton)findViewById(R.id.btnDown10);
        ImageButton btnUp10 = (ImageButton)findViewById(R.id.btnUp10);
        ImageButton btnDown12 = (ImageButton)findViewById(R.id.btnDown12);
        ImageButton btnUp12 = (ImageButton)findViewById(R.id.btnUp12);
        ImageButton btnDown20 = (ImageButton)findViewById(R.id.btnDown20);
        ImageButton btnUp20 = (ImageButton)findViewById(R.id.btnUp20);
        // click listeners for buttons
        // d4 dice
        btnUp4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d4.getText().toString());
                if(placeHolder < 15) {
                    placeHolder += 1;
                    if(placeHolder < 10) {
                        d4.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d4.setText(String.valueOf(placeHolder));
                    }
                }
            }
        });
        btnDown4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d4.getText().toString());
                if(placeHolder > 0) {
                    placeHolder -= 1;
                    if(placeHolder < 10) {
                        d4.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d4.setText(String.valueOf(placeHolder));
                    }
                }

            }
        });
        // d6 dice
        btnDown6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d6.getText().toString());
                if(placeHolder > 0) {
                    placeHolder -= 1;
                    if(placeHolder < 10) {
                        d6.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d6.setText(String.valueOf(placeHolder));
                    }
                }
            }
        });
        btnUp6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d6.getText().toString());
                if(placeHolder < 15) {
                    placeHolder += 1;
                    if(placeHolder < 10) {
                        d6.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d6.setText(String.valueOf(placeHolder));
                    }
                }
            }
        });
        // d8 dice
        btnDown8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d8.getText().toString());
                if(placeHolder > 0) {
                    placeHolder -= 1;
                    if(placeHolder < 10) {
                        d8.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d8.setText(String.valueOf(placeHolder));
                    }
                }
            }
        });
        btnUp8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d8.getText().toString());
                if(placeHolder < 15) {
                    placeHolder += 1;
                    if(placeHolder < 10) {
                        d8.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d8.setText(String.valueOf(placeHolder));
                    }
                }
            }
        });
        // d10 dice
        btnUp10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d10.getText().toString());
                if(placeHolder < 15) {
                    placeHolder += 1;

                    if(placeHolder < 10) {
                        d10.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d10.setText(String.valueOf(placeHolder));
                    }
                }

            }
        });
        btnDown10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d10.getText().toString());
                if(placeHolder > 0) {
                    placeHolder -= 1;
                    if(placeHolder < 10) {
                        d10.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d10.setText(String.valueOf(placeHolder));
                    }
                }
            }

        });
        // d12 dice
        btnUp12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d12.getText().toString());
                if(placeHolder < 15) {
                    placeHolder += 1;
                    if(placeHolder < 10) {
                        d12.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d12.setText(String.valueOf(placeHolder));
                    }
                }
            }

        });
        btnDown12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d12.getText().toString());
                if(placeHolder > 0) {
                    placeHolder -= 1;
                    if(placeHolder < 10) {
                        d12.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d12.setText(String.valueOf(placeHolder));
                    }
                }
            }
        });
        // d20 dice
        btnDown20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d20.getText().toString());
                if(placeHolder > 0) {
                    placeHolder -= 1;
                    if(placeHolder < 10) {
                        d20.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d20.setText(String.valueOf(placeHolder));
                    }
                }
            }
        });
        btnUp20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int placeHolder = Integer.parseInt(d20.getText().toString());
                if(placeHolder < 15) {
                    placeHolder += 1;
                    if(placeHolder < 10) {
                        d20.setText("0" + String.valueOf(placeHolder));
                    }
                    else {
                        d20.setText(String.valueOf(placeHolder));
                    }
                }
            }
        });
        // button to roll dice
        btnRoll.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this,Pop.class));
                int answer = 0;
                Roll rollD4 = new Roll(four, Integer.parseInt(d4.getText().toString()));
                answer = rollD4.getResult();
                Roll rollD6 = new Roll(six, Integer.parseInt(d6.getText().toString()));
                answer += rollD6.getResult();
                Roll rollD8 = new Roll(eight, Integer.parseInt(d8.getText().toString()));
                answer += rollD8.getResult();
                Roll rollD10 = new Roll(ten, Integer.parseInt(d10.getText().toString()));
                answer += rollD10.getResult();
                Roll rollD12 = new Roll(twelve, Integer.parseInt(d12.getText().toString()));
                answer += rollD12.getResult();
                Roll rollD20 = new Roll(twenty, Integer.parseInt(d20.getText().toString()));
                answer += rollD20.getResult();

                editor.putInt("key", answer);



                String individuald4 = "";
                String individuald6 = "";
                String individuald8 = "";
                String individuald10 = "";
                String individuald12 = "";
                String individuald20 = "";


                if(rollD4.getCheck() == true){
                    individuald4 = "D4: " + rollD4.getRolls() + " ";
                }
                if(rollD6.getCheck() == true){
                    individuald6 ="D6: " + rollD6.getRolls()+ " ";
                }
                if(rollD8.getCheck() == true){
                    individuald8 ="D8: " + rollD8.getRolls()+ " ";
                }
                if(rollD10.getCheck() == true){
                    individuald10 +="D10: " + rollD10.getRolls()+ " ";
                }
                if(rollD12.getCheck() == true){
                    individuald12 ="D12: " + rollD12.getRolls()+ " ";
                }
                if(rollD20.getCheck() == true){
                    individuald20 ="D20: " + rollD20.getRolls();
                }

                editor.putString("key1", individuald4);
                editor.putString("key2", individuald6);
                editor.putString("key3", individuald8);
                editor.putString("key4", individuald10);
                editor.putString("key5", individuald12);
                editor.putString("key6", individuald20);
                editor.commit();



            }
        });
        // clear button
        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                d4.setText("00");
                d6.setText("00");
                d8.setText("00");
                d10.setText("00");
                d12.setText("00");
                d20.setText("00");

            }
        });


    }
}

