package com.blackice.datepicker;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    DatePicker datepicker ;
    TextView textview;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        datepicker = (DatePicker) findViewById(R.id.datepicker);
        textview =(TextView) findViewById(R.id.textview);
        button =(Button) findViewById(R.id.button);
        button.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                textview.setText(String.valueOf(datepicker.getMonth()
                        + "-"+
                        datepicker.getDayOfMonth()
                        +"-"+
                        datepicker.getYear()
                ));
                break;
        }
    }
}
