package com.example.itemfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class Especificaciones extends AppCompatActivity {

    private Producto producto;
    private ImageView imagendetalleView;
    private Button btnVolver;
    private ImageView imagendetalleView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_especificaciones);

        btnVolver = findViewById(R.id.btnVolver);
        btnVolver.setOnClickListener(v -> finish());

        if (getIntent() != null && getIntent().hasExtra("producto")) {
            producto = getIntent().getParcelableExtra("producto");

            TextView nombreProductoTextView = findViewById(R.id.nombreProductoTextView);
            TextView tiendaTextView = findViewById(R.id.tiendaTextView);
            TextView marcaTextView = findViewById(R.id.marcaTextView);
            imagendetalleView = findViewById(R.id.imagendetalleView);
            imagendetalleView2 = findViewById(R.id.imagendetalleView2);
            TextView descripTextView = findViewById(R.id.descripTextView);
            TextView precioEspecTextView = findViewById(R.id.precioEspecTextView);

            nombreProductoTextView.setText(producto.getNombre());
            tiendaTextView.setText(producto.getTienda());
            marcaTextView.setText(producto.getMarca());
            descripTextView.setText(producto.getDescripcion());

            precioEspecTextView.setText("$ " + producto.getPrecio());

            if (producto.getTienda() == null || producto.getTienda().isEmpty()) {
                tiendaTextView.setText("Tienda no especificada");
            }

            // Cargar la imagen directamente si está almacenada en el código
            imagendetalleView.setImageResource(producto.getUrlImagen());
            imagendetalleView2.setImageResource(producto.getUbicacionTienda());
        }
    }
}
