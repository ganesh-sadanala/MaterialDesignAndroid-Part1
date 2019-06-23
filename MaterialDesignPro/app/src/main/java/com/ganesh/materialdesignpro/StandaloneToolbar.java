package com.ganesh.materialdesignpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;

public class StandaloneToolbar extends AppCompatActivity {

    Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toolbar);
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("StandAloneToolbar!");
        toolbar.setSubtitle("By Ganesh");
        //toolbar.setNavigationIcon(R.drawable.ic_navigation_back);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
        {
           toolbar.setElevation(10f);
        }
       toolbar.inflateMenu(R.menu.menu_main);
       toolbar.setOnMenuItemClickListener(new Toolbar.OnMenuItemClickListener() {
           @Override
           public boolean onMenuItemClick(MenuItem item) {



               return true;
           }
       });
    }
}
