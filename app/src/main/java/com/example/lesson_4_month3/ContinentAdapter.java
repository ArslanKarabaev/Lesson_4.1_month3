package com.example.lesson_4_month3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {

    private ArrayList<String> continentNames;
    private OnItemClick onItemClick;

    public ContinentAdapter(ArrayList<String> continentNames, OnItemClick onItemClick) {
        this.continentNames = continentNames;
        this.onItemClick = onItemClick;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ContinentViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        holder.bind(continentNames.get(position));
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onItemClick.OnClick(holder.getAdapterPosition());
            }
        });

    }

    @Override
    public int getItemCount() {
        return continentNames.size();
    }
}



class ContinentViewHolder extends RecyclerView.ViewHolder{

    private TextView tv_continent;

    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_continent = itemView.findViewById(R.id.tv_continent);
    }

    public void bind(String name){
        tv_continent.setText(name);

    }
}