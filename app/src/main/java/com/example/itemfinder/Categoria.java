package com.example.itemfinder;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Categoria extends AppCompatActivity {

    private GridView verCategoria;
    private String[] categorias = {"Audio y Musica", "Computacion", "Celulares", "Tv y Smart Tv", "Consolas", "Cámara y Fotografia"};
    private Button btnVolver2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_categoria);

        btnVolver2 = findViewById(R.id.btnVolver2);
        btnVolver2.setOnClickListener(v -> finish());

        verCategoria = findViewById(R.id.verCategoria);

        // Crea un adaptador para el GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, categorias);

        // Asigna el adaptador al GridView
        verCategoria.setAdapter(adapter);

        // Configura un clic en un elemento del GridView (puedes agregar más funcionalidad aquí)
        verCategoria.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedCategoria = categorias[position];

                Intent resultIntent = new Intent();
                resultIntent.putExtra("selectedCategoria", selectedCategoria);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

    }
}

