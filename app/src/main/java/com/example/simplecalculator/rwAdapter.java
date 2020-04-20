package com.example.simplecalculator;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.MenuView;
import androidx.recyclerview.widget.RecyclerView;

public class rwAdapter  extends RecyclerView.Adapter<rwAdapter.mViewHolder> {

    private String [] operations;
    private String [] results;

    public rwAdapter(String [] operations, String [] results){
        this.operations = operations;
        this.results = results;
    }

    @NonNull
    @Override
    public rwAdapter.mViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        Context mContext = parent.getContext();
        boolean attachToParentRapido = false;
        int layoutIdParaListItem = R.layout.operations_list_raw;

        LayoutInflater inflater = LayoutInflater.from(mContext);
        View view = inflater.inflate(layoutIdParaListItem, parent, attachToParentRapido);
        mViewHolder viewHolder = new mViewHolder(view);

        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull rwAdapter.mViewHolder holder, int position) {
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        //Esta funcion devuelve el numero de elementos del RecyclerView
        return operations.length;
    }


    //ViewHolder --> Creamos la vista que vaa tener cada elemento de nuestro rw
    class mViewHolder extends RecyclerView.ViewHolder {

        TextView mTVOperaton, mTVResult;

        public mViewHolder(@NonNull View itemView) {
            super(itemView);
            mTVOperaton = itemView.findViewById(R.id.tw_recycler_operation);
            mTVResult = itemView.findViewById(R.id.tw_recycler_result);
        }

        //El bind se encarga de coger las vistas del viewHolder y pasarlas a cada elemento del rw
        void bind(int listaIndex){
            mTVOperaton.setText(operations[listaIndex]);
            mTVResult.setText(results[listaIndex]);
        }


    }

}
