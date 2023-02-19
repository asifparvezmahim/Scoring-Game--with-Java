package com.example.scoringgame;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity  {
    int count=0;
    private Button increaseButtonId,decreaseButttonId,resetButtonId;
    private TextView scoreCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        increaseButtonId=(Button) findViewById(R.id.increaseButtonId);
        decreaseButttonId=(Button) findViewById(R.id.decreaseButttonId);
        scoreCard=(TextView) findViewById(R.id.scoreCard);



    }
    public void buttonActivity(View v){
        if (v.getId()==R.id.increaseButtonId)
        {
            count++;
            scoreCard.setText("Your Current Score is: "+count);

        }

      if(v.getId()==R.id.decreaseButttonId)
        {
            Log.d("tag","Decrease Button is Clicked");
            count--;

            if (count>=0){
                scoreCard.setText("Your Current Score is "+count);
            }

            else {
                count=0;
                scoreCard.setText("Your Current Score is Already Zero");
            }

        }

      if (v.getId()==R.id.resetButtonId){
          count=0;
          scoreCard.setText("Your Current Score is "+count);
          Toast.makeText(MainActivity.this, "Reset Done", Toast.LENGTH_SHORT).show();

      }

    }


    }


