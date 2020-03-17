package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class operationsDone extends AppCompatActivity {

    private RecyclerView mRecycleView;
    private static final int LISTA_NUMEROS = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations_done);

        //Primero definimos el recycleView
        mRecycleView = findViewById(R.id.mRecyclerViewHistorico);

        //Agregamos un divider (linea que separa cada elemento)
        mRecycleView.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));

        //Creamos linear layout manager (linear, grid o stagered) y lo añadimos a nuestro RecyclerView
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        mRecycleView.setLayoutManager(linearLayoutManager);

        //Adaptador (el que pasa los datos al RecyclerView)
        RecyclerAdapter mAdapter = new RecyclerAdapter(LISTA_NUMEROS);

        mRecycleView.setAdapter(mAdapter);
    }
}
