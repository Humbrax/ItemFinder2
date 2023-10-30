package com.example.itemfinder;

import android.os.Parcel;
import android.os.Parcelable;

public class Tienda implements Parcelable {
    private String nombre;

    public Tienda(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    // Implementación de Parcelable
    protected Tienda(Parcel in) {
        nombre = in.readString();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nombre);
    }

    @Override
    public int describeContents() {
        return 0;
    }

    public static final Creator<Tienda> CREATOR = new Creator<Tienda>() {
        @Override
        public Tienda createFromParcel(Parcel in) {
            return new Tienda(in);
        }

        @Override
        public Tienda[] newArray(int size) {
            return new Tienda[size];
        }
    };
}
