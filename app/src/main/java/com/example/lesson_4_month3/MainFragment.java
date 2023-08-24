package com.example.lesson_4_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.lesson_4_month3.databinding.ActivityMainBinding;

import java.util.ArrayList;

public class MainFragment extends Fragment implements OnItemClick {
    private RecyclerView rv_continent;
    private ArrayList<String> continentNames = new ArrayList<>();



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        loadData();
        rv_continent = requireActivity().findViewById(R.id.rv_continent);
        ContinentAdapter continentAdapter = new ContinentAdapter(continentNames, this);
        rv_continent.setAdapter(continentAdapter);


    }

    private void loadData() {
        continentNames.add("Европа");
        continentNames.add("Азия");
        continentNames.add("Африка");
        continentNames.add("Австралия");
        continentNames.add("Америка");
    }

    @Override
    public void OnClick(int position) {
        Bundle bundle = new Bundle();
        bundle.putString("continent", continentNames.get(position));
        SeccondFragment seccondFragment = new SeccondFragment();
        seccondFragment.setArguments(bundle);
        continentNames.clear();
        requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.conteyner, seccondFragment).addToBackStack(null).commit();
    }
}