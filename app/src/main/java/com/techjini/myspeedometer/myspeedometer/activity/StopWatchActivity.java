package com.techjini.myspeedometer.myspeedometer.activity;

import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.DecelerateInterpolator;
import android.widget.ProgressBar;

import com.techjini.myspeedometer.myspeedometer.R;

public class StopWatchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stop_watch);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.progressBar);
        progressBar.setProgress(40);
//        ObjectAnimator animation = ObjectAnimator.ofInt(progressBar, "progress", 0, 100); // see this max value coming back here, we animale towards that value
//        animation.setDuration(5000); //in milliseconds
//        animation.setInterpolator(new DecelerateInterpolator());
//        animation.start();
    }
}
