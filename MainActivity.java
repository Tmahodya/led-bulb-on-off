package com.example.smarthome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    private Button button;
    private boolean swith = false;
    private Button butn;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final MediaPlayer click = MediaPlayer.create(this,R.raw.click);

        imageView = findViewById(R.id.imageView);
        button = findViewById(R.id.button);
        butn=(Button) findViewById(R.id.buttonNEXT);



        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //click to play sound all time

                click.start();

                if (swith == false) {
                    imageView.setImageResource(R.drawable.on);
                    button.setText("OFF");
                    swith = true;

                } else {
                    imageView.setImageResource(R.drawable.off);
                    button.setText("ON");
                    swith = false;
                }


            }
        });

        butn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                NEXT();
            }
        });
    }

    public void NEXT(){

        Intent intent = new Intent(this, teparature.class);
        startActivity(intent);
    }
}