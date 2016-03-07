package com.techjini.myspeedometer.myspeedometer.activity;

import android.Manifest;
import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.support.v4.app.ActivityCompat;
import android.widget.TextView;

import com.techjini.myspeedometer.myspeedometer.R;
import com.techjini.myspeedometer.myspeedometer.databinding.ActivitySpeedoMeterBinding;

public class SpeedoMeterActivity extends Activity implements LocationListener {


    private ActivitySpeedoMeterBinding binding;
    private String mSpeed;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_speedo_meter);

        LocationManager locationManager = (LocationManager) this.getSystemService(Context.LOCATION_SERVICE);
        if (ActivityCompat.checkSelfPermission(this, Manifest.permission.ACCESS_FINE_LOCATION) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            return;
        }
        locationManager.requestLocationUpdates(LocationManager.NETWORK_PROVIDER, 1000, 5, this);
        locationManager.requestLocationUpdates(LocationManager.GPS_PROVIDER, 1000, 5, this);
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    @Override
    public void onLocationChanged(Location location) {
        if (null == location) {
//            mSpeed.setText("-,- m/sec");
            binding.setSpeed("-,- m/sec");
        } else {
            float kmpersec = location.getSpeed() / (18 / 5);
//            mSpeed.setText(kmpersec + "km/hr");
            binding.setSpeed(kmpersec + "km/hr");
        }
    }

    @Override
    public void onStatusChanged(String provider, int status, Bundle extras) {

    }

    @Override
    public void onProviderEnabled(String provider) {

    }

    @Override
    public void onProviderDisabled(String provider) {

    }
}
