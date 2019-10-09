package com.example.test.ui.home;

import android.annotation.SuppressLint;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.test.R;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                ViewModelProviders.of(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        ImageButton acoustic1Play = (ImageButton)root.findViewById(R.id.acoustic1Play);
        ImageButton acoustic1Stop = (ImageButton)root.findViewById(R.id.acoustic1Stop);
        ImageButton acoustic2Play = (ImageButton)root.findViewById(R.id.acoustic2Play);
        ImageButton acoustic2Stop = (ImageButton)root.findViewById(R.id.acoustic2Stop);

        final MediaPlayer acoustic = MediaPlayer.create(getActivity(), R.raw.acoustic);
        final View acoustic1 = (View)root.findViewById(R.id.acoustic1);
        final View acoustic2 = (View)root.findViewById(R.id.acoustic2);

        acoustic1Play.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                acoustic1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                acoustic.setLooping(true);
                acoustic.start();
                return false;
            }
        });

        acoustic1Stop.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(acoustic.isPlaying()) {
                    acoustic1.setBackgroundColor(getResources().getColor(R.color.grey));
                    acoustic.pause();
                }
                return false;
            }
        });
        acoustic2Play.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                acoustic2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//                rock.setLooping(true);
//                rock.start();
                return false;
            }
        });
        acoustic2Stop.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
//                if(rock.isPlaying()) {
//                    rock.pause();
                acoustic2.setBackgroundColor(getResources().getColor(R.color.grey));
//                }
                return false;
            }
        });
        return root;
    }
}