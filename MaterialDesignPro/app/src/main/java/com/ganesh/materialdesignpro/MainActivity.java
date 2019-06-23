package com.ganesh.materialdesignpro;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP)
//        {
//
//        }
//        else
//        {
//
//        }
    }

    public void ShowStandAloneToolbar(View view) {
        Intent intent=new Intent(this,StandaloneToolbar.class);
        startActivity(intent);
    }

    public void ShowToolbarAsActionBar(View view) {
        Intent intent=new Intent(this,ActionBarToolBar.class);
        startActivity(intent);
    }

    public void ShowContextualMenu(View view) {
    }
}
