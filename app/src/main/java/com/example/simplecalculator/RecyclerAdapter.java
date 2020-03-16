package com.example.simplecalculator;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class RecyclerAdapter extends RecyclerView.Adapter <RecyclerAdapter.OperationsViewHolder> {
    //Clase adapter para nuestro RecylerView

    private String mOperationDone;

    public RecyclerAdapter (String mOperationDone){
        this.mOperationDone = mOperationDone;
    }

    @NonNull
    @Override
    public OperationsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        Context mContext = parent.getContext();
        // Minuto 20:06

        return null;
    }

    @Override
    public void onBindViewHolder(@NonNull OperationsViewHolder holder, int position) {

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
