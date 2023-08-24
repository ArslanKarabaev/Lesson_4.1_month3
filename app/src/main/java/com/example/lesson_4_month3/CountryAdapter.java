package com.example.lesson_4_month3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class CountryAdapter extends RecyclerView.Adapter<CountryViewHolder> {

    private ArrayList<CountryModel> putCountryList;

    public CountryAdapter(ArrayList<CountryModel> putCountryList) {
        this.putCountryList = putCountryList;
    }

    @NonNull
    @Override
    public CountryViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new CountryViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country,parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewHolder holder, int position) {
        holder.bind(putCountryList.get(position));
    }

    @Override
    public int getItemCount() {
        return putCountryList.size();
    }
}


class CountryViewHolder extends RecyclerView.ViewHolder{

    private TextView tv_country,tv_capital;
    private ImageView img_flag;

    public CountryViewHolder(@NonNull View itemView) {
        super(itemView);
        tv_country = itemView.findViewById(R.id.tv_country);
        tv_capital = itemView.findViewById(R.id.tv_capital);
        img_flag = itemView.findViewById(R.id.img_flag);
    }

    public void bind(CountryModel country){
        tv_country.setText(country.getName());
        tv_capital.setText(country.getCapital());
        Glide.with(img_flag).load(country.getFlag()).into(img_flag);


    }
}