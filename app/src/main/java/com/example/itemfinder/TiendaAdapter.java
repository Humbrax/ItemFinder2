package com.example.itemfinder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class TiendaAdapter extends AppCompatActivity {

    private GridView verTienda;

    Tienda[] tiendas = new Tienda[] {
            new Tienda("Paris"),
            new Tienda("Falabella"),
            new Tienda("Ripley"),
            new Tienda("PcFactory"),
            new Tienda("Hites"),
            new Tienda("Lider"),
    };


    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tienda);

        verTienda = findViewById(R.id.verTienda);

        // Crea una lista de nombres de tiendas
        String[] nombresTiendas = new String[tiendas.length];
        for (int i = 0; i < tiendas.length; i++) {
            nombresTiendas[i] = tiendas[i].getNombre();
        }

        // Crea un adaptador para el GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, nombresTiendas);

        // Asigna el adaptador al GridView
        verTienda.setAdapter(adapter);

        // Configura un clic en un elemento del GridView (puedes agregar más funcionalidad aquí)
        verTienda.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedTienda = tiendas[position].getNombre();

                Intent resultIntent = new Intent();
                resultIntent.putExtra("selectedTienda", selectedTienda);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });
    }
}
