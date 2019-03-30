package com.example.goslinglovelaceapplicationbasic;

import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.res.Configuration;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_FULL_SENSOR);

        int orientation = getResources().getConfiguration().orientation;

        if (Configuration.ORIENTATION_LANDSCAPE == orientation) {
            // Landscape
            setContentView(R.layout.activity_ada);

        }
        else {
            // Portrait
            setContentView(R.layout.activity_main);

        }

    }

    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        if(newConfig.orientation==Configuration.ORIENTATION_PORTRAIT){

            setContentView(R.layout.activity_main);

        }else{

            setContentView(R.layout.activity_ada);

       }
    }
}
