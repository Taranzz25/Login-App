package com.example.tj.overflow;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        RelativeLayout background = (RelativeLayout) findViewById(R.id.background);
        TextView color = (TextView) findViewById(R.id.color);

        switch(item.getItemId()){
            case R.id.red:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                background.setBackgroundColor(Color.RED);
                color.setText("Red");
                return true;
            case R.id.blue:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                background.setBackgroundColor(Color.BLUE);
                color.setText("Blue");
                return true;
            case R.id.green:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                background.setBackgroundColor(Color.GREEN);
                color.setText("Green");
                return true;
            case R.id.yellow:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                background.setBackgroundColor(Color.YELLOW);
                color.setText("Yellow");
                return true;
            case R.id.white:
                if(item.isChecked())
                    item.setChecked(false);
                else
                    item.setChecked(true);
                background.setBackgroundColor(Color.WHITE);
                color.setText("White");
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
