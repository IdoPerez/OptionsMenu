package com.example.test;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.text.Layout;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

/**
 * @author Ido Perez
 * @since 2.9.2003(just saying i need new keyboard)- 9/11/2019
 * @version 0.01
 */
public class MainActivity extends AppCompatActivity {
    LinearLayout La;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        La = (LinearLayout) findViewById(R.id.Layout);
    }

    /**
     *
     * @param menu
     * @return Method return true when on option clicked.
     *
     *
     * Adding items to the options menu.
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,300,"Black");
        return true;
    }

    /**
     *
     * @param item
     * @return The method react to the item selected
     * Method changing the background color by choosing.
     * Compering of id for more efficiency.
     */
    public boolean onOptionsItemSelected(MenuItem item){
        int id = item.getItemId();
        if(id == R.id.Green){
            La.setBackgroundColor(Color.GREEN);
        } else{
            if(id == R.id.Blue){
                La.setBackgroundColor(Color.BLUE);
            } else{
                if(id == R.id.Red){
                    La.setBackgroundColor(Color.RED);
                } else La.setBackgroundColor(Color.BLACK);
            }
        }
        return true;
    }

    /**
     *
     * @param view
     * Moving to OptionsMenu activity.
     */
    public void NextActiv(View view) {
        Intent si = new Intent(this, OptionsMenu.class);
        startActivity(si);
    }
}
