package com.example.itemfinder;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class VistaGeneral extends AppCompatActivity {

    private Button btnBuscar;
    private EditText txtBuscar;
    private List<Producto> productosList;
    public static List<Producto> favoritosList;
    private Button btnCategoria;
    private Button btnMarca;
    private Button btnTienda;
    private static final int MARCA_REQUEST_CODE = 1;
    private static final int CATEGORIA_REQUEST_CODE = 2;
    private static final int TIENDA_REQUEST_CODE = 3;
    private String selectedMarca;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vista_general);

        btnCategoria = findViewById(R.id.btnCategoria);
        btnMarca = findViewById(R.id.btnMarca);
        btnTienda = findViewById(R.id.btnTienda);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Intent intent = null;

                if (item.getItemId() == R.id.home) {
                    intent = new Intent(VistaGeneral.this, VistaGeneral.class);
                } else if (item.getItemId() == R.id.action_profile) {
                    intent = new Intent(VistaGeneral.this, Perfil.class);
                }
                if (intent != null) {
                    startActivity(intent);
                }

                return true;
            }
        });

        favoritosList = new ArrayList<>();

        productosList = new ArrayList<>();
        productosList.add(new Producto(R.drawable.descarga1,1,"ASUS ProArt StudioBook Pro 16", " i9-13900HX , 3,90 GHz , 16 GB DDR5-5600MHz , ", "ASUS", "Computacion","Paris",R.drawable.paris,2899990));
        productosList.add(new Producto(R.drawable.descarga2,2,"Acer Aspire 3 A315-56-31LE-10", "Intel® Core™ i3 1005G1 / 8GB RAM / 512GB SSD / 15 pulgadas HD / Intel® Intel UHD Graphics", "Acer", "Computacion","Ripley",R.drawable.ripley,329990));
        productosList.add(new Producto(R.drawable.descarga3,3,"ASUS TUF Dash F15 FX516PC", "AMD Ryzen 5 4600H, AMD Radeon RX Vega 6 , NVIDIA GeForce GTX 1650 (4 GB)", "ASUS", "Computacion","Paris",R.drawable.paris,737991));
        productosList.add(new Producto(R.drawable.descarga4,4,"Laptop ThinkBook 15", " AMD Ryzen™ 7 5700U, 8 GB DDR4-3200MHz , 512 GB SSD", "ASUS", "Computacion", "Ripley",R.drawable.ripley,769990));
        productosList.add(new Producto(R.drawable.descarga5,5,"Lenovo Legion 7", "AMD Ryzen™ 9 5900HX Processor (3,30 GHz hasta 4,60 GHz)", "Lenovo", "Computacion", "Ripley",R.drawable.ripley,2099990));
        productosList.add(new Producto(R.drawable.descarga6,6,"Lenovo LOQ", "", "Lenovo", "Computacion", "Falabella",R.drawable.falabella,1377109));
        productosList.add(new Producto(R.drawable.descarga7,7,"IdeaPad Gaming 3", "", "ASUS", "Computacion", "Ripley",R.drawable.ripley,1099990));
        productosList.add(new Producto(R.drawable.descarga8,8,"Dell Vostro 3420", "I5 8gb Ram 256gb Ssd", "Dell", "Computacion", "PcFactory",R.drawable.pcfactory,474990));
        productosList.add(new Producto(R.drawable.descarga9,9,"Samsung Galaxy Book 3", "Intel i7-1355U 8GB 512GB SSD Windows 11", "Samsung", "Computacion", "Falabella",R.drawable.falabella,619990));
        productosList.add(new Producto(R.drawable.descarga11,11,"Asus Vivobook 14", "Tablet Android de 10 pulgadas", "ASUS", "Computacion","Paris",R.drawable.paris,299992));
        productosList.add(new Producto(R.drawable.descarga12,12,"Xiaomi A1", "Smartphone Redmi A1 32GB/2GB Negro", "Xiaomi", "Celulares", "PcFactory",R.drawable.pcfactory,79990));
        productosList.add(new Producto(R.drawable.descarga13,13,"Redmi 9C", "Smartphone Redmi 9C 32GB/2GB Gris", "Xiaomi", "Celulares", "PcFactory",R.drawable.pcfactory,85000));
        productosList.add(new Producto(R.drawable.descarga14,14,"Oppo A15", "Smartphone A15 32GB/3GB Negro", "Oppo", "Celulares", "PcFactory",R.drawable.pcfactory,90000));
        productosList.add(new Producto(R.drawable.descarga15,15,"Moto E20", "Smartphone Moto E20 32GB/2GB Azul", "Mororola", "Celulares", "PcFactory",R.drawable.pcfactory,77000));
        productosList.add(new Producto(R.drawable.descarga16,16,"Huawei Y7P", "Smartphone Huawei Y7P 64GB/4GB Aurora Blue", "Huawei", "Celulares", "PcFactory",R.drawable.pcfactory,150000));
        productosList.add(new Producto(R.drawable.descarga17,17,"Galaxy A03 Core", "Smartphone Galaxy A03 Core 32GB/2GB Negro", "Samsung", "Celulares", "PcFactory",R.drawable.pcfactory,84000));
        productosList.add(new Producto(R.drawable.descarga18,18,"Moto E13", "Smartphone Moto E13 64GB/2GB Verde", "Motorola", "Celulares", "PcFactory",R.drawable.pcfactory,69990));
        productosList.add(new Producto(R.drawable.descarga19,19,"Galaxy Z Fold5", "Smartphone Galaxy Z Fold5 512GB 5G Azul", "Samsung", "Celulares", "PcFactory",R.drawable.pcfactory, 1799990));
        productosList.add(new Producto(R.drawable.descarga21,21,"iPhone 14 Pro Max", "iPhone 14 Pro Max 512GB - Morado oscuro", "Apple", "Celulares", "PcFactory",R.drawable.pcfactory,1200000));
        productosList.add(new Producto(R.drawable.descarga22,22,"Honor Magic 5 Pro", "Smartphone Honor Magic 5 Pro 512GB/12GB Verde", "Honor", "Celulares", "PcFactory",R.drawable.pcfactory,264650));
        productosList.add(new Producto(R.drawable.descarga24,24,"Smart TV QLED The Frame QN65LS03B 65” UHD 4K", "", "Samsung", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,1000000));
        productosList.add(new Producto(R.drawable.descarga25,25,"Smart TV LED 65” AU7090 UHD 4K", "", "Samsung", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,530000));
        productosList.add(new Producto(R.drawable.descarga27,27,"SMART TV 50” 50PUD7908/43 UHD 4K", "", "Philips", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,380000));
        productosList.add(new Producto(R.drawable.descarga28,28,"Smart TV OLED 48” C1 Ultra HD 4K WiFi", "", "LG", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,430000));
        productosList.add(new Producto(R.drawable.descarga29,29,"Smart TV 65PUD7406 65” UHD 4K Android", "", "Philips", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,1));
        productosList.add(new Producto(R.drawable.descarga30,30,"Smart TV 55” UHD 4K Q2 55", "", "Xiaomi", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,399990));
        productosList.add(new Producto(R.drawable.descarga31,31,"Smart TV 55NANO75SQA 55”", "", "LG", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,430000));
        productosList.add(new Producto(R.drawable.descarga32,32,"Smart TV LG 50” 50UR7300", "", "LG", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,362990));
        productosList.add(new Producto(R.drawable.descarga33,33,"Smart TV LED 55” AU7090 UHD 4K", "", "Samsung", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,362990));
        productosList.add(new Producto(R.drawable.descarga34,34,"Smart TV 6523NS 65” Ultra HD 4K WiFi", "", "Gear", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,349990));
        productosList.add(new Producto(R.drawable.descarga35,35,"Smart TV 55”  Roku UHD 4K 55U6125", "", "AOC", "Tv y Smart Tv", "PcFactory",R.drawable.pcfactory,286990));
        productosList.add(new Producto(R.drawable.descarga36,36,"Consola Portátil ASUS ROG ALLY", "Consola Portátil ASUS ROG ALLY AMD Ryzen Z1 Extreme 16GB RAM 512GB SSD 7” FHD 120Hz Pantalla Touch", "Asus", "Consolas", "PcFactory",R.drawable.pcfactory,799990));
        productosList.add(new Producto(R.drawable.descarga37,37,"PlayStation 5 Bundle", "PlayStation 5 Bundle FC24 PS5", "Sony", "Consolas", "PcFactory",R.drawable.pcfactory,799990));
        productosList.add(new Producto(R.drawable.descarga38,38,"PlayStation 5 Digital Edition", "Consola PlayStation 5 Digital Edition God of War Ragnarok ", "Sony", "Consolas", "PcFactory",R.drawable.pcfactory,596990));
        productosList.add(new Producto(R.drawable.descarga39,39,"Xbox Series X", "Consola Xbox Series X", "Microsoft", "Consolas", "PcFactory",R.drawable.pcfactory,549990));
        productosList.add(new Producto(R.drawable.descarga40,40,"Nintendo Switch OLED", "Consola Nintendo Switch OLED con Joy-Con Blanco", "Nintendo", "Consolas", "PcFactory",R.drawable.pcfactory,404990));
        productosList.add(new Producto(R.drawable.descarga41,41,"Xbox Series S", "Consola Xbox Series S Carbon Black", "Microsoft", "Consolas", "PcFactory",R.drawable.pcfactory,369990));
        productosList.add(new Producto(R.drawable.descarga42,42,"Nintendo Switch Oled", "Consola Nintendo Switch Oled Pokemon Scarlet And Violet", "Nintendo", "Consolas", "PcFactory",R.drawable.pcfactory,504390));
        productosList.add(new Producto(R.drawable.descarga43,43,"Nintendo Switch V2", "Consola Nintendo Switch V2 + Mario Kart 8 Deluxe", "Nintendo", "Consolas", "PcFactory",R.drawable.pcfactory,316990));
        productosList.add(new Producto(R.drawable.descarga44,44,"Nintendo Switch Lite", "Consola Nintendo Switch Lite Turquoise + Animal Crossing", "Nintendo", "Consolas", "PcFactory",R.drawable.pcfactory,211990));
        productosList.add(new Producto(R.drawable.descarga45,45,"Nintendo Game and Watch", "Consola Nintendo Game and Watch Zelda", "Nintendo", "Consolas", "PcFactory",R.drawable.pcfactory,67890));
        productosList.add(new Producto(R.drawable.descarga46,46,"Playstation 4", "Consola Playstation 4 (PS4) 1TB+God of War Ragnarok", "Sony", "Consolas", "PcFactory",R.drawable.pcfactory,419290));
        productosList.add(new Producto(R.drawable.descarga47,47,"Xbox Series S", "Consola Xbox Series S", "Microsoft", "Consolas", "PcFactory",R.drawable.pcfactory,312990));
        productosList.add(new Producto(R.drawable.descarga48,48,"AUDÍFONOS STEREO EXTRA BASS NEGRO", "AUDIFONOS MANOS LIBRES TIPO CINTILLO EXTRABASS DBLUE", "DBLUE", "Audio y Musica","Ripley",R.drawable.ripley,7550));
        productosList.add(new Producto(R.drawable.descarga49,49,"JBL CHARGE 5", "PARLANTE BLUETOOTH JBL CHARGE 5 ROJO", "JBL", "Audio y Musica","Ripley",R.drawable.ripley,139990));
        productosList.add(new Producto(R.drawable.descarga50,50,"ALEXA ECHO DOT 5", "AMAZON ALEXA ECHO DOT (5TA GENERACIÓN) BLACK", "AMAZON", "Audio y Musica","Ripley",R.drawable.ripley,52990));
        productosList.add(new Producto(R.drawable.descarga51,51,"PARLANTES LOGITECH Z120", "PARLANTES LOGITECH Z120 2.0 USB BLANCO", "LOGITECH", "Audio y Musica","Ripley",R.drawable.ripley,16990));
        productosList.add(new Producto(R.drawable.descarga52,52,"PARLANTE KARAOKE MLAB TOWER VIBES", "PARLANTE KARAOKE MLAB TOWER VIBES", "MLAB", "Audio y Musica","Ripley",R.drawable.ripley,17990));
        productosList.add(new Producto(R.drawable.descarga53,53,"ALEXA Echo Dot 4 con Reloj", "PARLANTE ECHO DOT 4 con Reloj ASISTENTE INTELIGENTE ALEXA 4TA GEN BLANCO AMAZON", "AMAZON", "Audio y Musica","Ripley",R.drawable.ripley,107990));
        productosList.add(new Producto(R.drawable.descarga54,54,"JBL Quantum 100", "Audífonos Gamer JBL Quantum 100", "JBL", "Audio y Musica","Hites",R.drawable.hites,39990));
        productosList.add(new Producto(R.drawable.descarga55,55,"Audifonos Apple iPhone", "Audifonos Apple iPhone Original Earpods Lightning Microfono", "Apple", "Audio y Musica","Hites",R.drawable.hites,21990));
        productosList.add(new Producto(R.drawable.descarga56,56,"Parlante Bluetooth SRS-XB13/BC", "Parlante Bluetooth Sony SRS-XB13/BC", "Sony", "Audio y Musica","Hites",R.drawable.hites,39990));
        productosList.add(new Producto(R.drawable.descarga57,57,"Cámara SONY ILCE-6100L/B - IPX0", "", "Sony", "Cámara y Fotografia","Falabella",R.drawable.falabella,749990));
        productosList.add(new Producto(R.drawable.descarga58,58,"Camara Profesional Sony ZV-E10L BQ E38", "", "Sony", "Cámara y Fotografia","Falabella",R.drawable.falabella,699990));
        productosList.add(new Producto(R.drawable.descarga59,59,"Eos Rebel T100 Premium Kit Canon", "", "CANON", "Cámara y Fotografia","Falabella",R.drawable.falabella,564990));
        productosList.add(new Producto(R.drawable.descarga60,60,"Estabilizador para Celular DJI OM 6", "", "DJI", "Cámara y Fotografia","Falabella",R.drawable.falabella,169990));
        productosList.add(new Producto(R.drawable.descarga61,61,"Cámara Profesional 90D 18-135 Canon", "", "CANON", "Cámara y Fotografia","Falabella",R.drawable.falabella,1499990));
        productosList.add(new Producto(R.drawable.descarga62,62,"Cámara I Sports Pro Azul 4K Wifi", "", "Microlab", "Cámara y Fotografia","Lider",R.drawable.lider,5999));
        productosList.add(new Producto(R.drawable.descarga63,63,"Cámara Reflex Eos Rebel T7 18-55 MM", "", "CANON", "Cámara y Fotografia","Lider",R.drawable.lider,489990));
        productosList.add(new Producto(R.drawable.descarga64,64,"Cámara Vintage Retro M35 Color Celeste 35Mm", "", "Kodak", "Cámara y Fotografia","Lider",R.drawable.lider,34990));
        productosList.add(new Producto(R.drawable.descarga65,65,"Camara Deportiva GoPro Hero 12 Black HyperSmooth 6.0", "", "GoPro", "Cámara y Fotografia","Lider",R.drawable.lider,499990));

        btnBuscar = findViewById(R.id.btnBuscar);

        txtBuscar = findViewById(R.id.txtBuscar);

        btnBuscar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String keyword = txtBuscar.getText().toString().trim();
                buscarProductos(keyword);
            }
        });

        btnCategoria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre la actividad Categoria y espera un resultado
                Intent intent = new Intent(VistaGeneral.this, Categoria.class);
                startActivityForResult(intent, CATEGORIA_REQUEST_CODE);
            }
        });

        btnTienda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre la actividad Tienda y espera un resultado
                Intent intent = new Intent(VistaGeneral.this, TiendaAdapter.class);
                startActivityForResult(intent, TIENDA_REQUEST_CODE);
            }
        });

        btnMarca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Abre la actividad Marca y espera un resultado
                Intent intent = new Intent(VistaGeneral.this, Marca.class);
                startActivityForResult(intent, MARCA_REQUEST_CODE);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (requestCode == MARCA_REQUEST_CODE && resultCode == RESULT_OK) {
            // Recibe la marca seleccionada desde la actividad Marca
            selectedMarca = data.getStringExtra("selectedMarca");

            // Filtra los productos por la marca seleccionada
            filterProductosPorMarca(selectedMarca);
        }

        if (requestCode == CATEGORIA_REQUEST_CODE && resultCode == RESULT_OK) {
            String selectedCategoria = data.getStringExtra("selectedCategoria");

            // Filtra los productos por la categoría seleccionada
            filterProductosPorCategoria(selectedCategoria);
        }
        if (requestCode == TIENDA_REQUEST_CODE && resultCode == RESULT_OK){
            String selectedTienda = data.getStringExtra("selectedTienda");

            filterProductosPorTienda(selectedTienda);
        }
    }

    private void filterProductosPorMarca(String marca) {
        List<Producto> filteredProductos = new ArrayList<>();

        for (Producto producto : productosList) {
            if (producto.getMarca().equals(marca)) {
                filteredProductos.add(producto);
            }
        }

        showFilteredProducts(filteredProductos);
    }
    private void filterProductosPorTienda(String tienda) {
        List<Producto> filteredProductos = new ArrayList<>();

        for (Producto producto : productosList) {
            if (producto.getTienda().equals(tienda)) {
                filteredProductos.add(producto);
            }
        }
        showFilteredProducts(filteredProductos);
    }

    private void filterProductosPorCategoria(String categoria) {
        List<Producto> filteredProductos = new ArrayList<>();

        for (Producto producto : productosList) {
            if (producto.getCategoria().equals(categoria)) {
                filteredProductos.add(producto);
            }
        }
        showFilteredProducts(filteredProductos);
    }


    // Método para buscar productos por subcadena en el nombre
    private void buscarProductos(String textoBusqueda) {
        List<Producto> resultados = new ArrayList<>();

        for (Producto producto : productosList) {
            if (producto.getNombre().toLowerCase().contains(textoBusqueda.toLowerCase())) {
                resultados.add(producto);
            }
        }

        showFilteredProducts(resultados);
    }

    private void showFilteredProducts(List<Producto> filteredProducts) {
        // Abre la actividad ProductosFiltrados con los productos filtrados
        Intent productosFiltradosIntent = new Intent(this, ProductosFiltrados.class);
        productosFiltradosIntent.putParcelableArrayListExtra("productosFiltrados", new ArrayList<>(filteredProducts));
        startActivity(productosFiltradosIntent);
    }
}

