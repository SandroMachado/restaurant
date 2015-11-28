package com.sandro.restaurantesample;

import android.graphics.Color;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.sandro.restaurant.Restaurant;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button snackbarCustomBackgroundColor = (Button) findViewById(R.id.button_snackbar_custom_background);
        snackbarCustomBackgroundColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Restaurant(MainActivity.this, "Snackbar with custom background color", Snackbar.LENGTH_LONG)
                    .setBackgroundColor(Color.GRAY)
                    .show();
            }
        });

        Button snackbarCustomTextColor = (Button) findViewById(R.id.button_snackbar_custom_text_color);
        snackbarCustomTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Restaurant(MainActivity.this, "Snackbar with custom text color", Snackbar.LENGTH_LONG)
                    .setTextColor(Color.GREEN)
                    .show();
            }
        });

        Button snackbarCustom = (Button) findViewById(R.id.button_snackbar_custom);
        snackbarCustom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Restaurant(MainActivity.this, "Snackbar with custom background and text color", Snackbar.LENGTH_LONG)
                    .setBackgroundColor(Color.GRAY)
                    .setTextColor(Color.GREEN)
                    .show();
            }
        });

        Button snackbarMultipleCustomTextColor = (Button) findViewById(R.id.button_snackbar_multiple_custom_text_color);
        snackbarMultipleCustomTextColor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                new Restaurant(MainActivity.this, "", Snackbar.LENGTH_LONG)
                    .appendText("RED", Color.RED)
                    .appendText("GREEN", Color.GREEN)
                    .appendText("BLUE", Color.BLUE)
                    .appendText("WHITE", Color.WHITE)
                    .show();
            }
        });
    }
}
