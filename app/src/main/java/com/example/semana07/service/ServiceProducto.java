package com.example.semana07.service;

import com.example.semana07.entity.Producto;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ServiceProducto {

    @GET("products")
    public abstract Call<List<Producto>> listaProducto();

}
