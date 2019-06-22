package com.ganesh.materialdesignpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class StandaloneToolbar extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("StandAloneToolbar!");
        toolbar.setSubtitle("By Ganesh");
        toolbar.setNavigationIcon(R.drawable.ic_navigation_back);
    }
}
