package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.media.MediaPlayer;
import android.media.Image;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    ImageButton toBeat,toSettings,start,record,stop;
    View d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11;
    View t1,t2,t3,t4,t5,t6,t7,t8;
    Button first,second,third;
    private MediaPlayer lD1,lD2,lD3,lD4,lD5,lD6,lD7;
    private MediaPlayer lT1,lT2,lT3,lT4,lT5;
    private MediaPlayer mD1,mD2,mD3,mD4,mD5,mD6,mD7,mD8,mD9,mD10,mD11;
    private MediaPlayer mT1,mT2,mT3,mT4,mT5,mT6,mT7,mT8;
    private MediaPlayer nD1,nD2,nD3,nD4,nD5,nD6,nD7;
    private MediaPlayer nT1,nT2,nT3,nT4,nT5,nT6,nT7;

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        first = findViewById(R.id.first);
        second = findViewById(R.id.second);
        third = findViewById(R.id.third);



        //when first button was clicked
        first.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                second.setBackgroundColor(getResources().getColor(R.color.white));
                third.setBackgroundColor(getResources().getColor(R.color.white));

                d1.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lD1.start();
                        d1.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d1.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d2.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lD2.start();
                        d2.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d2.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d3.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lD3.start();
                        d3.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d3.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d4.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lD4.start();
                        d4.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d4.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d5.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lD5.start();
                        d5.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d5.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d6.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lD6.start();
                        d6.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d6.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d7.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lD7.start();
                        d7.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d7.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d8.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD1.start();
                        d8.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d8.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d9.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD2.start();
                        d9.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d9.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d10.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD3.start();
                        d10.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d10.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d11.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD4.start();
                        d11.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d11.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                t1.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lT1.start();
                        t1.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t2.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lT2.start();
                        t2.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t2.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t3.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lT3.start();
                        t3.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t3.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t4.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lT4.start();
                        t4.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t4.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t5.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        lT5.start();
                        t5.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t5.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t6.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT1.start();
                        t6.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t6.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t7.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT2.start();
                        t7.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t7.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t8.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT3.start();
                        t8.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t8.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });



            }
        });
        //when second button was clicked
        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setBackgroundColor(getResources().getColor(R.color.white));
                second.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                third.setBackgroundColor(getResources().getColor(R.color.white));
                d1.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD1.start();
                        d1.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d1.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d2.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD2.start();
                        d2.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d2.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d3.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD3.start();
                        d3.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d3.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d4.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD4.start();
                        d4.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d4.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d5.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD5.start();
                        d5.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d5.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d6.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD6.start();
                        d6.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d6.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d7.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD7.start();
                        d7.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d7.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d8.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD8.start();
                        d8.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d8.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d9.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD9.start();
                        d9.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d9.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d10.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD10.start();
                        d10.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d10.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d11.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD11.start();
                        d11.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d11.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                t1.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT1.start();
                        t1.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t2.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT2.start();
                        t2.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t2.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t3.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT3.start();
                        t3.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t3.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t4.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT4.start();
                        t4.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t4.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t5.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT5.start();
                        t5.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t5.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t6.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT6.start();
                        t6.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t6.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t7.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT7.start();
                        t7.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t7.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t8.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT8.start();
                        t8.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t8.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
            }
        });
        //when third button was clicked
        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                first.setBackgroundColor(getResources().getColor(R.color.white));
                second.setBackgroundColor(getResources().getColor(R.color.white));
                third.setBackgroundColor(getResources().getColor(R.color.colorAccent));
                d1.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD8.start();
                        d1.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d1.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d2.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD9.start();
                        d2.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d2.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d3.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD10.start();
                        d3.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d3.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d4.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mD11.start();
                        d4.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d4.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d5.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nD1.start();
                        d5.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d5.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d6.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nD2.start();
                        d6.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d6.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d7.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nD3.start();
                        d7.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d7.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d8.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nD4.start();
                        d8.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d8.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d9.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nD5.start();
                        d9.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d9.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d10.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nD6.start();
                        d10.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 100, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d10.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                d11.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nD7.start();
                        d11.setBackgroundColor(getResources().getColor(R.color.touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                d11.setBackgroundColor(getResources().getColor(R.color.white));
                            }
                        }.start();
                        return false;
                    }
                });
                t1.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT6.start();
                        t1.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t2.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT7.start();
                        t2.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t2.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t3.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        mT8.start();
                        t3.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t3.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t4.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nT1.start();
                        t4.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t4.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t5.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nT2.start();
                        t5.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t5.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t6.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nT3.start();
                        t6.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t6.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t7.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nT4.start();
                        t7.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t7.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
                t8.setOnTouchListener(new View.OnTouchListener() {
                    @SuppressLint("NewApi")
                    @Override
                    public boolean onTouch(View view, MotionEvent motionEvent) {
                        nT5.start();
                        t8.setBackgroundColor(getResources().getColor(R.color.t_touched));
                        new CountDownTimer(1 * 50, 100) {
                            @Override
                            public void onTick(long millisUntilFinished) {
                                String.valueOf(millisUntilFinished / 100);
                            }
                            @Override
                            public void onFinish() {
                                t8.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                            }
                        }.start();
                        return false;
                    }
                });
            }
        });

        d1 = findViewById(R.id.d1);
        d2 = findViewById(R.id.d2);
        d3 = findViewById(R.id.d3);
        d4 = findViewById(R.id.d4);
        d5 = findViewById(R.id.d5);
        d6 = findViewById(R.id.d6);
        d7 = findViewById(R.id.d7);
        d8 = findViewById(R.id.d8);
        d9 = findViewById(R.id.d9);
        d10 = findViewById(R.id.d10);
        d11 = findViewById(R.id.d11);

        d1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                    mD1.start();
                    d1.setBackgroundColor(getResources().getColor(R.color.touched));
                    new CountDownTimer(1 * 100, 100) {
                        @Override
                        public void onTick(long millisUntilFinished) {
                            String.valueOf(millisUntilFinished / 100);
                        }
                        @Override
                        public void onFinish() {
                            d1.setBackgroundColor(getResources().getColor(R.color.white));
                        }
                    }.start();
                    return false;
            }
        });
        d2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD2.start();
                d2.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d2.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD3.start();
                d3.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d3.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD4.start();
                d4.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d4.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD5.start();
                d5.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d5.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD6.start();
                d6.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d6.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD7.start();
                d7.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d7.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD8.start();
                d8.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d8.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d9.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD9.start();
                d9.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d9.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d10.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD10.start();
                d10.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 100, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d10.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });
        d11.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mD11.start();
                d11.setBackgroundColor(getResources().getColor(R.color.touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        d11.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }.start();
                return false;
            }
        });

        //-1
        lD1 = MediaPlayer.create(this,R.raw.lld1);
        lD2 = MediaPlayer.create(this,R.raw.lld2);
        lD3 = MediaPlayer.create(this,R.raw.lld3);
        lD4 = MediaPlayer.create(this,R.raw.lld4);
        lD5 = MediaPlayer.create(this,R.raw.lld5);
        lD6 = MediaPlayer.create(this,R.raw.lld6);
        lD7 = MediaPlayer.create(this,R.raw.lld7);

        lT1 = MediaPlayer.create(this, R.raw.llt1);
        lT2 = MediaPlayer.create(this, R.raw.llt2);
        lT3 = MediaPlayer.create(this, R.raw.llt3);
        lT4 = MediaPlayer.create(this, R.raw.llt4);
        lT5 = MediaPlayer.create(this, R.raw.llt5);

        //+0
        mD1 = MediaPlayer.create(this,R.raw.d1);
        mD2 = MediaPlayer.create(this,R.raw.d2);
        mD3 = MediaPlayer.create(this,R.raw.d3);
        mD4 = MediaPlayer.create(this,R.raw.d4);
        mD5 = MediaPlayer.create(this,R.raw.d5);
        mD6 = MediaPlayer.create(this,R.raw.d6);
        mD7 = MediaPlayer.create(this,R.raw.d7);
        mD8 = MediaPlayer.create(this,R.raw.d8);
        mD9 = MediaPlayer.create(this,R.raw.d9);
        mD10 = MediaPlayer.create(this,R.raw.d10);
        mD11 = MediaPlayer.create(this,R.raw.d11);

        mT1 = MediaPlayer.create(this, R.raw.tt1);
        mT2 = MediaPlayer.create(this, R.raw.tt2);
        mT3 = MediaPlayer.create(this, R.raw.tt3);
        mT4 = MediaPlayer.create(this, R.raw.tt4);
        mT5 = MediaPlayer.create(this, R.raw.tt5);
        mT6 = MediaPlayer.create(this, R.raw.tt6);
        mT7 = MediaPlayer.create(this, R.raw.tt7);
        mT8 = MediaPlayer.create(this, R.raw.tt8);


        //+1
        nD1 = MediaPlayer.create(this,R.raw.nnd1);
        nD2 = MediaPlayer.create(this,R.raw.nnd2);
        nD3 = MediaPlayer.create(this,R.raw.nnd3);
        nD4 = MediaPlayer.create(this,R.raw.nnd4);
        nD5 = MediaPlayer.create(this,R.raw.nnd5);
        nD6 = MediaPlayer.create(this,R.raw.nnd6);
        nD7 = MediaPlayer.create(this,R.raw.nnd7);

        nT1 = MediaPlayer.create(this, R.raw.nnt1);
        nT2 = MediaPlayer.create(this, R.raw.nnt2);
        nT3 = MediaPlayer.create(this, R.raw.nnt3);
        nT4 = MediaPlayer.create(this, R.raw.nnt4);
        nT5 = MediaPlayer.create(this, R.raw.nnt5);

        t1 = findViewById(R.id.t1);
        t2 = findViewById(R.id.t2);
        t3 = findViewById(R.id.t3);
        t4 = findViewById(R.id.t4);
        t5 = findViewById(R.id.t5);
        t6 = findViewById(R.id.t6);
        t7 = findViewById(R.id.t7);
        t8 = findViewById(R.id.t8);

        t1.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mT1.start();
                t1.setBackgroundColor(getResources().getColor(R.color.t_touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        t1.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }.start();
                return false;
            }
        });
        t2.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mT2.start();
                t2.setBackgroundColor(getResources().getColor(R.color.t_touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        t2.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }.start();
                return false;
            }
        });
        t3.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mT3.start();
                t3.setBackgroundColor(getResources().getColor(R.color.t_touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        t3.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }.start();
                return false;
            }
        });
        t4.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mT4.start();
                t4.setBackgroundColor(getResources().getColor(R.color.t_touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        t4.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }.start();
                return false;
            }
        });
        t5.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mT5.start();
                t5.setBackgroundColor(getResources().getColor(R.color.t_touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        t5.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }.start();
                return false;
            }
        });
        t6.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mT6.start();
                t6.setBackgroundColor(getResources().getColor(R.color.t_touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        t6.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }.start();
                return false;
            }
        });
        t7.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mT7.start();
                t7.setBackgroundColor(getResources().getColor(R.color.t_touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        t7.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }.start();
                return false;
            }
        });
        t8.setOnTouchListener(new View.OnTouchListener() {
            @SuppressLint("NewApi")
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                mT8.start();
                t8.setBackgroundColor(getResources().getColor(R.color.t_touched));
                new CountDownTimer(1 * 50, 100) {
                    @Override
                    public void onTick(long millisUntilFinished) {
                        String.valueOf(millisUntilFinished / 100);
                    }
                    @Override
                    public void onFinish() {
                        t8.setBackgroundColor(getResources().getColor(R.color.colorPrimaryDark));
                    }
                }.start();
                return false;
            }
        });


        start = findViewById(R.id.start);
        record = findViewById(R.id.record);
        stop = findViewById(R.id.stop);
        toBeat = findViewById(R.id.toBeat);
        toSettings = findViewById(R.id.toSettings);

        toBeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Beats.class);
                startActivity(intent);
            }
        });

        toSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
        hideNav();
    }

    private void hideNav(){
        this.getWindow().getDecorView()
                .setSystemUiVisibility(
                        View.SYSTEM_UI_FLAG_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY |
                                View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN |
                                View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION |
                                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                );
    }



}
