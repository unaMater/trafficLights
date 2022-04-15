package com.example.trafficlights;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;

import java.util.Timer;
import java.util.TimerTask;

public class MainActivity extends AppCompatActivity {

    int counter = 0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button red = findViewById(R.id._redbutton);
        Button yellow = findViewById(R.id.yellowbutton);
        Button green = findViewById(R.id.greenbutton);

        class Svetofor extends TimerTask {

            @Override
            public void run() {
                Log.d("123", "counter = " + counter);
                switch (counter) {
                    case 0:
                        red.setBackgroundColor(Color.RED);
                        green.setBackgroundColor(Color.BLACK);
                        yellow.setBackgroundColor(Color.BLACK);
                        break;
                    case 1:
                        red.setBackgroundColor(Color.BLACK);
                        green.setBackgroundColor(Color.BLACK);
                        yellow.setBackgroundColor(Color.YELLOW);
                        break;
                    case 2:
                        red.setBackgroundColor(Color.BLACK);
                        green.setBackgroundColor(Color.GREEN);
                        yellow.setBackgroundColor(Color.BLACK);
                        break;
                }
                if (counter == 2)
                    counter=0;
                else
                    counter++;

            }
        }



        Timer timer = new Timer();
        timer.schedule(new Svetofor(), 0, 1000);

    }
}