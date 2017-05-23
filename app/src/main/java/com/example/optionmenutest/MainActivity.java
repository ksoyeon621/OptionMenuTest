package com.example.optionmenutest;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {
    LinearLayout Linear;
    Button but;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Linear=(LinearLayout) findViewById(R.id.Linear);
        but = (Button)findViewById(R.id.but_ok);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        super.onCreateOptionsMenu(menu);
        MenuInflater mInflater = getMenuInflater(); //New 연산자 x
        mInflater.inflate(R.menu.menu1, menu); //menu는 메게변수의 매뉴를 의미
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        super.onOptionsItemSelected(item);
        switch(item.getItemId()){
            case R.id.item_blue:
                Linear.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.item_yellow:
                Linear.setBackgroundColor(Color.YELLOW);
                return true;
            case R.id.item_red:
                Linear.setBackgroundColor(Color.RED);
                return true;
            case R.id.item_but_rotate:
                but.setRotation(but.getRotation()+45); //45씩 계속 돌아감
                return true;
            case R.id.item_but_size:
                but.setScaleX(but.getTextScaleX()*2);
                return true;
        }
        return false;
    }
}
