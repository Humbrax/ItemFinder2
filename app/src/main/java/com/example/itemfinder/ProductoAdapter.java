package com.example.itemfinder;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class ProductoAdapter extends RecyclerView.Adapter<ProductoAdapter.ProductoViewHolder> {
    private List<Producto> productos;
    private Context context;

    public ProductoAdapter(Context context, List<Producto> productos) {
        this.context = context;
        this.productos = productos;
    }

    @Override
    public ProductoViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_producto, parent, false);
        return new ProductoViewHolder(view);
    }

    @Override
    public int getItemCount() {
        return productos.size();
    }

    @Override
    public void onBindViewHolder(ProductoViewHolder holder, int position) {
        Producto producto = productos.get(position);
        holder.productoTextView.setText(producto.getNombre());
        holder.imagenImageView.setImageResource(producto.getUrlImagen());
        holder.verCarac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Crea un Intent para iniciar la actividad "Especificaciones"
                Intent intent = new Intent(context, Especificaciones.class);
                // Pasa el objeto Producto a la actividad Especificaciones
                intent.putExtra("producto", producto);
                context.startActivity(intent);
            }
        });
    }

    public class ProductoViewHolder extends RecyclerView.ViewHolder {
        public TextView productoTextView;
        public ImageView imagenImageView;
        public Button verCarac;

        public ProductoViewHolder(View itemView) {
            super(itemView);
            productoTextView = itemView.findViewById(R.id.productoTextView);
            imagenImageView = itemView.findViewById(R.id.iconoImagenWiew);
            verCarac = itemView.findViewById(R.id.verCarac);
        }
    }
}