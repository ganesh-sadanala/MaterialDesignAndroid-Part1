package com.ganesh.materialdesignpro;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

public class ContextualMenu extends AppCompatActivity {
    Toolbar toolbar;
    ActionMode actionMode;
    Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contextual_menu);
        toolbar=findViewById(R.id.toolbar);
        toolbar.setTitle("StandAloneToolbar!");
        toolbar.setSubtitle("By Ganesh");
        button=findViewById(R.id.button);
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
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               actionMode=ContextualMenu.this.startSupportActionMode(new ActionMode.Callback() {
                   @Override
                   public boolean onCreateActionMode(ActionMode mode, Menu menu) {

                       mode.getMenuInflater().inflate(R.menu.contextual_menu,menu);
                       changeStatusBarColor("#5D4037");
                       return true;
                   }

                   @Override
                   public boolean onPrepareActionMode(ActionMode mode, Menu menu) {

                       mode.setTitle("Action Mode");
                       mode.setSubtitle("By Ganesh");
                       return false;
                   }

                   @Override
                   public boolean onActionItemClicked(ActionMode mode, MenuItem item) {

                       //To add functionality
                       return false;
                   }

                   @Override
                   public void onDestroyActionMode(ActionMode mode) {
                        changeStatusBarColor("#1976D2");
                   }
               });
    }


});

    }
    private void changeStatusBarColor(String color){
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = getWindow();
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.setStatusBarColor(Color.parseColor(color));
        }
    }}
