package com.example.semana07;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.semana07.entity.Producto;

public class DetalleProductoActivity extends AppCompatActivity {

    TextView txtDetalleTitulo, txtDetalleDescripcion;
    TextView txtDetalleCategoria, txtDetallePrecio, txtDetalleStock, txtDetalleScore;

    Button btnRegresar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle_producto);


        txtDetalleTitulo = findViewById(R.id.txtDetalleTitulo);
        txtDetalleDescripcion = findViewById(R.id.txtDetalleDescripcion);
        txtDetalleCategoria = findViewById(R.id.txtDetalleCategoria);
        txtDetallePrecio = findViewById(R.id.txtDetallePrecio);
        txtDetalleStock = findViewById(R.id.txtDetalleStock);
        txtDetalleScore = findViewById(R.id.txtDetalleScore);
        btnRegresar = findViewById(R.id.btnDetalleRegresar);

        Bundle extras = getIntent().getExtras();
        Producto objProducto = (Producto) extras.get("VAR_OBJETO");

        txtDetalleTitulo.setText(objProducto.getTitle());
        txtDetalleDescripcion.setText(objProducto.getDescription());
        txtDetalleCategoria.setText("Categoría : " + objProducto.getCategory());
        txtDetallePrecio.setText("Precio : " + objProducto.getPrice());
        txtDetalleStock.setText("Stock : " + objProducto.getRating().getCount());
        txtDetalleScore.setText("Puntuación : " + objProducto.getRating().getRate());

        btnRegresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DetalleProductoActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}