package com.example.randommoviegenerator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button filmButton = findViewById(R.id.filmButton);
        filmButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToFilm();
            }
        });

    }
    private void goToFilm(){
        Intent intent =new Intent(this,Film.class);
        startActivity(intent);
    }
}