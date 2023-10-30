package com.example.itemfinder;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import android.widget.Button;

import java.util.List;

public class ProductosFiltrados extends AppCompatActivity {
    private RecyclerView datosFiltrados;
    private RecyclerView.Adapter mAdapter;
    private Button btnVolver5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_productos_filtrados);

        datosFiltrados = findViewById(R.id.productoFiltrado);

        btnVolver5 = findViewById(R.id.btnVolver5);
        btnVolver5.setOnClickListener(v -> finish());

        // Obtiene la lista de productos filtrados
        List<Producto> productosFiltrados = getIntent().getParcelableArrayListExtra("productosFiltrados");

        // Configura el RecyclerView con la lista de productos filtrados
        datosFiltrados.setLayoutManager(new LinearLayoutManager(this));
        mAdapter = new ProductoAdapter(this, productosFiltrados);
        datosFiltrados.setAdapter(mAdapter);
    }
}


