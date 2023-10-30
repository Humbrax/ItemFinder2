package com.example.itemfinder;

import android.os.Parcel;
import android.os.Parcelable;

public class Producto implements Parcelable {
    private int id;
    private String nombre;
    private String descripcion;
    private int urlImagen;
    private String marca;
    private int precio;
    private String categoria;
    private String tienda;

    private int ubicacionTienda;


    public Producto(int urlImagen, int id, String nombre, String descripcion, String marca, String categoria, String tienda, int ubicacionTienda, int precio) {
        this.id = id;
        this.tienda = tienda;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.urlImagen = urlImagen;
        this.marca = marca;
        this.categoria = categoria;
        this.precio = precio;
        this.ubicacionTienda = ubicacionTienda ;

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public String getTienda() {
        return tienda;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getMarca() {
        return marca;
    }

    public String getCategoria() {
        return categoria;
    }
    public int getUrlImagen(){ return urlImagen;}
    public int getUbicacionTienda(){ return ubicacionTienda;}

    protected Producto(Parcel in) {
        nombre = in.readString();
        descripcion = in.readString();
        urlImagen = Integer.parseInt(in.readString());
        marca = in.readString();
        categoria = in.readString();
        tienda = in.readString();
        precio = in.readInt();
        ubicacionTienda = Integer.parseInt(in.readString());
    }

    public static final Creator<Producto> CREATOR = new Creator<Producto>() {
        @Override
        public Producto createFromParcel(Parcel in) {
            return new Producto(in);
        }

        @Override
        public Producto[] newArray(int size) {
            return new Producto[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
        dest.writeString(descripcion);
        dest.writeString(String.valueOf(urlImagen));
        dest.writeString(marca);
        dest.writeString(tienda);
        dest.writeString(categoria);
        dest.writeInt(precio);
        dest.writeString(String.valueOf(ubicacionTienda));
    }


}
