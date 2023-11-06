package com.example.lab6_20192270;

import androidx.appcompat.app.AppCompatActivity;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.lab6_20192270.databinding.ActivityJuegoPuzzleBinding;

import java.util.Random;

public class JuegoPuzzle extends AppCompatActivity {
    private int[] images = {R.drawable.crashflotante, R.drawable.gato, R.drawable.perrosalchicha};
    private GridView gridView;
    private ImageView imageViewCenter;
    private Button btnAgregarImagen;
    private ImagePagerAdapter imageAdapter;
    private int[] drawableIds;
    private boolean imageAdded = false;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_juego_puzzle);

        gridView = findViewById(R.id.gridView);
        btnAgregarImagen = findViewById(R.id.buttonAgregarPuzzle);

        TypedArray imagesArray = getResources().obtainTypedArray(R.array.drawable_images);
        drawableIds = new int[imagesArray.length()];
        for (int i = 0; i < imagesArray.length(); i++) {
            drawableIds[i] = imagesArray.getResourceId(i, 0);
        }
        imagesArray.recycle();


        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (imageAdded) {
                    // Solo permitir intercambiar piezas cuando se haya agregado una imagen
                    // Implementa la lógica de intercambio de piezas aquí
                    // Puedes usar las imágenes cargadas en el adaptador
                } else {
                    Toast.makeText(JuegoPuzzle.this, "Agrega una imagen primero", Toast.LENGTH_SHORT).show();
                }
            }
        });

        btnAgregarImagen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Obtén un número aleatorio para seleccionar una imagen del array
                int randomIndex = getRandomImageNumber(images.length);

                if (randomIndex >= 0 && randomIndex < images.length) {
                    // Muestra la imagen seleccionada en el centro
                    imageViewCenter.setImageResource(images[randomIndex]);
                    imageViewCenter.setVisibility(View.VISIBLE);
                } else {
                    Toast.makeText(JuegoPuzzle.this, "No se pudo encontrar la imagen aleatoria", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
    private int getRandomImageNumber(int maxImages) {
        Random random = new Random();
        return random.nextInt(maxImages);
    }

}