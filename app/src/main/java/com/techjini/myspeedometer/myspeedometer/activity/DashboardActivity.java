package com.techjini.myspeedometer.myspeedometer.activity;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import com.techjini.myspeedometer.myspeedometer.R;
import com.techjini.myspeedometer.myspeedometer.databinding.ActivityDashboardBinding;

public class DashboardActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityDashboardBinding binding= DataBindingUtil.setContentView(this,R.layout.activity_dashboard);
        binding.setHandler(this);
    }

    public void onSpeedometerClick(View view){
        Intent speedoMeterIntent=new Intent(this,SpeedoMeterActivity.class);
        startActivity(speedoMeterIntent);
    }

    public void onStopWatchClick(View view){
        Intent stopWatchIntent=new Intent(this,StopWatchActivity.class);
        startActivity(stopWatchIntent);
    }

}
