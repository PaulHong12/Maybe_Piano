package com.example.test.ui.dashboard;

import android.annotation.SuppressLint;
import android.media.Image;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatDelegate;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import androidx.preference.Preference;
import androidx.preference.PreferenceFragmentCompat;
import androidx.preference.SwitchPreference;

import com.example.test.MainActivity;
import com.example.test.R;

public class DashboardFragment extends Fragment {

//    MediaPlayer acoustic,rock,retro;
//    ImageButton rock1Play,rock1Stop,acoustic1Play,acoustic1Stop,retro1Play,retro1Stop;

    private DashboardViewModel dashboardViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        dashboardViewModel =
                ViewModelProviders.of(this).get(DashboardViewModel.class);

        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);

        ImageButton rock1Play = (ImageButton)root.findViewById(R.id.rock1Play);
        ImageButton rock1Stop = (ImageButton)root.findViewById(R.id.rock1Pause);
        ImageButton rock2Play = (ImageButton)root.findViewById(R.id.rock2Play);
        ImageButton rock2Stop = (ImageButton)root.findViewById(R.id.rock2Stop);

        final MediaPlayer rock = MediaPlayer.create(getActivity(), R.raw.rock);
        final View rock1 = (View)root.findViewById(R.id.rock1);
        final View rock2 = (View)root.findViewById(R.id.rock2);





        rock1Play.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                rock1.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                rock.setLooping(true);
                rock.start();
                return false;
            }
        });
        rock1Stop.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(rock.isPlaying()) {
                    rock.pause();
                    rock1.setBackgroundColor(getResources().getColor(R.color.grey));
                }
                return false;
            }
        });
        rock2Play.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                rock2.setBackgroundColor(getResources().getColor(R.color.colorAccent));
//                rock.setLooping(true);
//                rock.start();
                return false;
            }
        });
        rock2Stop.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
//                if(rock.isPlaying()) {
//                    rock.pause();
                rock2.setBackgroundColor(getResources().getColor(R.color.grey));
//                }
                return false;
            }
        });
        return root;
    }
    public static class SettingsFragmentRock extends PreferenceFragmentCompat {
        @Override
        public void onCreatePreferences(Bundle savedInstanceState, String rootKey) {
            setPreferencesFromResource(R.xml.root_preferences, rootKey);
            //dark mode
            final MainActivity main = new MainActivity();


            final SwitchPreference darkMode = (SwitchPreference)findPreference(this.getResources()
                    .getString(R.string.dark_mode));

            darkMode.setOnPreferenceChangeListener(new Preference.OnPreferenceChangeListener() {
                @Override
                public boolean onPreferenceChange(Preference preference, Object o) {
                    if(darkMode.isChecked()){
                        main.getAcousticView().setBackgroundColor(getResources().getColor(R.color.grey));
                        darkMode.setChecked(false);
                    }else {
                        AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES);

                        darkMode.setChecked(true);
                    }
                    return false;
                }
            });
        }
    }
}