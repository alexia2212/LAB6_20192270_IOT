package com.example.lab6_20192270;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import com.example.lab6_20192270.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.button.setOnClickListener(view ->{
            Intent intent = new Intent(MainActivity.this, JuegoPuzzle.class);
            startActivity(intent);

        });
        binding.button2.setOnClickListener(view ->{
            Intent intent2 = new Intent(MainActivity.this, JuegoMemoria.class);
            startActivity(intent2);
        });

    }
}