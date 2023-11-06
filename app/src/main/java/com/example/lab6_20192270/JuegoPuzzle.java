package com.example.lab6_20192270;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab6_20192270.databinding.ActivityJuegoPuzzleBinding;

public class JuegoPuzzle extends AppCompatActivity {

    ActivityJuegoPuzzleBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityJuegoPuzzleBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());



    }
}