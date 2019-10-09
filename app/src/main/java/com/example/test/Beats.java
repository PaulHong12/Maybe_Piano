package com.example.test;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class Beats extends AppCompatActivity {

    MediaPlayer acoustic,rock,retro;
    ImageButton rock1Play,rock1Stop,acoustic1Play,acoustic1Stop,retro1Play,retro1Stop;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beats);
        BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(
                R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications)
                .build();
        NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        NavigationUI.setupWithNavController(navView, navController);
/*

        //beats
        acoustic = MediaPlayer.create(this,R.raw.acoustic);
        rock = MediaPlayer.create(this,R.raw.rock);
        retro = MediaPlayer.create(this,R.raw.retro);

        //buttons
        rock1Play = findViewById(R.id.rock1Play);
        rock1Stop = findViewById(R.id.rock1Pause);
        acoustic1Play = findViewById(R.id.acoustic1Play);
        acoustic1Stop = findViewById(R.id.acoustic1Stop);
        retro1Play = findViewById(R.id.retro1Play);
        retro1Stop = findViewById(R.id.retro1Stop);

        rock1Play.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                rock.start();
                return false;
            }
        });
        rock1Stop.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                rock.stop();
                return false;
            }
        });

*/



    }
}
