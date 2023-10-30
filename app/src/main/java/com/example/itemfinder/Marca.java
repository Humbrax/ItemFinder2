package com.example.itemfinder;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.GridView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class Marca extends AppCompatActivity {

    private GridView verMarca;
    private Button btnVolver4;
    private String[] marcas = {"Samsung",
            "Lenovo", "Dell", "ASUS", "Acer", "Xiaomi",
            "Oppo", "Mororola", "Huawei", "Apple", "Honor",
            "Philips", "LG", "Gear", "AOC", "Sony", "Microsoft",
            "Nintendo", "DBLUE", "JBL", "AMAZON", "LOGITECH",
            "MLAB", "CANON", "DJI", "Microlab", "Kodak",
            "Nikon", "GoPro"};
    private BottomNavigationView bottomNavigationView;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marca);

        btnVolver4 = findViewById(R.id.btnVolver4);

        btnVolver4.setOnClickListener(v -> finish());


        verMarca = findViewById(R.id.verMarca);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, marcas);
        verMarca.setAdapter(adapter);

        verMarca.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String selectedMarca = marcas[position];
                Intent resultIntent = new Intent();
                resultIntent.putExtra("selectedMarca", selectedMarca);
                setResult(RESULT_OK, resultIntent);
                finish();
            }
        });

    }
}


