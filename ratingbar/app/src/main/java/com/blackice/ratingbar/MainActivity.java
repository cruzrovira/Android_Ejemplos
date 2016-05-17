package com.blackice.ratingbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ratingBar = (RatingBar) findViewById(R.id.ratingbar);
        button = (Button) findViewById(R.id.button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String rating = String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_SHORT).show();

            }
        });
    }
}
