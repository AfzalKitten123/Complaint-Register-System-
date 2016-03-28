package com.echo.complaintsystem.Activities;

import android.support.v4.app.FragmentTabHost;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.echo.complaintsystem.R;

public class MainActivity extends AppCompatActivity {

    FragmentTabHost outTabHost;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        outTabHost = (FragmentTabHost) findViewById(android.R.id.tabhost);

        outTabHost.setup(this, getSupportFragmentManager(), android.R.id.tabcontent);
        outTabHost.addTab(outTabHost.newTabSpec("tab1").setIndicator("Individual"), IndividualActivity.class, null);
        outTabHost.addTab(outTabHost.newTabSpec("tab2").setIndicator("ResidentEntry"), ResidentActivity.class, null);
        outTabHost.addTab(outTabHost.newTabSpec("tab3").setIndicator("Institutional"), InstituteActivity.class, null);
    }
}
