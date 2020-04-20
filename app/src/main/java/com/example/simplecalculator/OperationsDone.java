package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class OperationsDone extends AppCompatActivity {
    RecyclerView rwOperations;
    RecyclerView.LayoutManager mLayoutManager;
    rwAdapter adapter;

    //TODO: Pasar valores.
    String [] operations;
    String [] results;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_operations_done);

        rwOperations = findViewById(R.id.rwOperations);
        mLayoutManager = new LinearLayoutManager(this);

        rwOperations.setLayoutManager(mLayoutManager);
        rwOperations.addItemDecoration(new DividerItemDecoration(this, DividerItemDecoration.VERTICAL));
        adapter = new rwAdapter(operations, results);

        rwOperations.setAdapter(adapter);











    }
}
