package com.farizma.diceroller;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ImageView imgView1, imgView2;
    private Button btn;
    private Random myRandomNumber = new Random();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imgView1 = findViewById(R.id.imageView1);
        imgView2 = findViewById(R.id.imageView2);
        btn = findViewById(R.id.btn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                rollDice();
            }
        });
    }

    private void rollDice() {
        int randomNumber1 = myRandomNumber.nextInt(6) + 1;
        int randomNumber2 = myRandomNumber.nextInt(6) + 1;

        switch (randomNumber1) {
            case 1: imgView1.setImageResource(R.drawable.dice1);
                    break;
            case 2: imgView1.setImageResource(R.drawable.dice2);
                    break;
            case 3: imgView1.setImageResource(R.drawable.dice3);
                    break;
            case 4: imgView1.setImageResource(R.drawable.dice4);
                break;
            case 5: imgView1.setImageResource(R.drawable.dice5);
                break;
            case 6: imgView1.setImageResource(R.drawable.dice6);
                break;
            default: break;
        }

        switch (randomNumber2) {
            case 1:
                imgView2.setImageResource(R.drawable.dice1);
                break;
            case 2:
                imgView2.setImageResource(R.drawable.dice2);
                break;
            case 3:
                imgView2.setImageResource(R.drawable.dice3);
                break;
            case 4:
                imgView2.setImageResource(R.drawable.dice4);
                break;
            case 5:
                imgView2.setImageResource(R.drawable.dice5);
                break;
            case 6:
                imgView2.setImageResource(R.drawable.dice6);
                break;
            default:
                break;
        }
    }
}
