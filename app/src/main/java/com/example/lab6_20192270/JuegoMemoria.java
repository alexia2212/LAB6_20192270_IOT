package com.example.lab6_20192270;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.lab6_20192270.databinding.ActivityJuegoMemoriaBinding;

public class JuegoMemoria extends AppCompatActivity {

    ActivityJuegoMemoriaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityJuegoMemoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

    }
}