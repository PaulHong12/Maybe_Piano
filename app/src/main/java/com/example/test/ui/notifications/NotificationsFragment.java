package com.example.test.ui.notifications;

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

public class NotificationsFragment extends Fragment {

    private NotificationsViewModel notificationsViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        notificationsViewModel =
                ViewModelProviders.of(this).get(NotificationsViewModel.class);
        View root = inflater.inflate(R.layout.fragment_notifications, container, false);
        ImageButton retro1Play = (ImageButton)root.findViewById(R.id.retro1Play);
        ImageButton retro1Stop = (ImageButton)root.findViewById(R.id.retro1Stop);
        ImageButton retro2Play = (ImageButton)root.findViewById(R.id.retro2Play);
        ImageButton retro2Stop = (ImageButton)root.findViewById(R.id.retro2Stop);

        final MediaPlayer retro = MediaPlayer.create(getActivity(), R.raw.retro);
        final View retro2 = (View)root.findViewById(R.id.retro2);

        final View retro1 = (View)root.findViewById(R.id.retro1);

        retro1Play.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                retro1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                retro.setLooping(true);
                retro.start();
                return false;
            }
        });
        retro1Stop.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                retro1.setBackgroundColor(getResources().getColor(R.color.grey));
                if(retro.isPlaying())
                    retro.pause();
                return false;
            }
        });
        retro2Play.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                retro2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//                rock.setLooping(true);
//                rock.start();
                return false;
            }
        });
        retro2Stop.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
//                if(rock.isPlaying()) {
//                    rock.pause();
                retro2.setBackgroundColor(getResources().getColor(R.color.grey));
//                }
                return false;
            }
        });
        return root;
    }
}