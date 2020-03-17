package com.example.simplecalculator;

import android.content.Context;
import android.media.VolumeShaper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.OperationsViewHolder> {
    //Clase adapter para nuestro RecylerView

    //private String mOperationDone;
    private int mOperationDone;

    public RecyclerAdapter (int mOperationDone){
        this.mOperationDone = mOperationDone;
    }

    @NonNull
    @Override
    public OperationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context mContext = parent.getContext();
        int layoutIdListItem = R.layout.operations_list_row;
        LayoutInflater inflater = LayoutInflater.from(mContext);
        boolean attachToParentRapido = false;

        View view =inflater.inflate(layoutIdListItem, parent, attachToParentRapido);

        OperationsViewHolder viewHolder = new OperationsViewHolder(view);



        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull OperationsViewHolder holder, int position) {
        //'bindea' a cada vista del ViewHolder los datos.
        holder.bind(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    //ViewHOlder "vista" que tiene cada elemento de nuestro RecycleView
    class OperationsViewHolder extends  RecyclerView.ViewHolder {

        TextView mTWOperationsDoneView;

        public OperationsViewHolder(@NonNull View itemView) {
            super(itemView);
            mTWOperationsDoneView = itemView.findViewById(R.id.tw_operations_list);

        }
        void bind(int operationsIndex){
            mTWOperationsDoneView.setText(String.valueOf(operationsIndex));
        }

    }
}
