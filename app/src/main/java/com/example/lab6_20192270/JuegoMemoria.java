package com.example.lab6_20192270;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.lab6_20192270.databinding.ActivityJuegoMemoriaBinding;

public class JuegoMemoria extends AppCompatActivity {

    private int[] images = {R.drawable.abrapokemon, R.drawable.aerodactylpokemon, R.drawable.alakazampokemon, R.drawable.arbokpokemon,
    R.drawable.arcaninepokemon, R.drawable.articunopokemon, R.drawable.beedrillpokemon, R.drawable.bellsproutpokemon, R.drawable.blastoisepokemon,
    R.drawable.bulbasaurpokemon, R.drawable.butterfreepokemon, R.drawable.caterpiepokemon, R.drawable.chanseypokemon, R.drawable.charizardpokemon,
    R.drawable.charmanderpokemon};
    ActivityJuegoMemoriaBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityJuegoMemoriaBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ViewPager viewPager = findViewById(R.id.viewPager);
        ImagePagerAdapter adapter = new ImagePagerAdapter(this, images);
        viewPager.setAdapter(adapter);


    }
}