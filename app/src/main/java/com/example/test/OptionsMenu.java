package com.example.test;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.LinearLayout;

public class OptionsMenu extends AppCompatActivity {
    LinearLayout La;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_options_menu);
        La = (LinearLayout) findViewById(R.id.Layout);
    }

    /**
     *
     * @param menu
     * @return The method return true when the option menu have been clicked.
     * Adding items to the Options Menu.
     */
    public boolean onCreateOptionsMenu(Menu menu){
        getMenuInflater().inflate(R.menu.main, menu);
        menu.add(0,0,500,"Yellow");
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
                } else La.setBackgroundColor(Color.YELLOW);
            }
        }
        return true;
    }

    /**
     * Closing the Activity, and returning to the previous Activity.
     * @param view
     */
    public void BackToMainActiv(View view) {
        finish();
    }
}
