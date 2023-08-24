package com.example.lesson_4_month3;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class SeccondFragment extends Fragment {

    private RecyclerView rv_country;
    private ArrayList<CountryModel> countryNames = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_seccond, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        String continentName =getArguments().getString("continent");
        rv_country = requireActivity().findViewById(R.id.rv_country);
        switch (continentName){
            case ("Европа"):
                loadDataEuropa();
                CountryAdapter EuropaAdapter = new CountryAdapter(countryNames);
                rv_country.setAdapter(EuropaAdapter);
                break;
            case ("Азия"):
                loadDataAzia();
                CountryAdapter AziaAdapter = new CountryAdapter(countryNames);
                rv_country.setAdapter(AziaAdapter);
                break;
            case ("Африка"):
                loadDataAfrica();
                CountryAdapter AfricaAdapter = new CountryAdapter(countryNames);
                rv_country.setAdapter(AfricaAdapter);
                break;
            case ("Австралия"):
                loadDataAustralia();
                CountryAdapter AustraliaAdapter = new CountryAdapter(countryNames);
                rv_country.setAdapter(AustraliaAdapter);
                break;
            case ("Америка"):
                loadDataAmerica();
                CountryAdapter AmericaAdapter = new CountryAdapter(countryNames);
                rv_country.setAdapter(AmericaAdapter);
                break;
        }
    }

    private void loadDataEuropa() {
        countryNames.add(new CountryModel("Германия", "Берлин", "https://www.zastavki.com/pictures/originals/2012/World_Germany_Flag_of_Germany_035277_.jpg"));
        countryNames.add(new CountryModel("Италия", "Рим", "https://images.satu.kz/22815409_w640_h640_flag-italii-razmer.jpg"));
        countryNames.add(new CountryModel("Ватикан", "Ватикан", "https://cdn.pixabay.com/photo/2016/01/09/22/26/vatican-flag-1131092_1280.png"));
        countryNames.add(new CountryModel("Греция", "Афины", "https://flagof.ru/wp-content/uploads/2018/10/1200px-Merchant_Navy_of_Greece_flag_1822-1828.svg_.png"));
        countryNames.add(new CountryModel("Швецария", "Берн", "https://admin.allstar.com.ua/uploads/Embassy/%D0%A8%D0%B2%D0%B5%D0%B9%D1%86%D0%B0%D1%80%D0%B8%D1%8F.jpg"));
    }

    private void loadDataAzia() {
        countryNames.add(new CountryModel("Турция", "Анкара", "https://www.digiseller.ru/preview/1101259/p1_3544451_d1137dfc.jpg"));
        countryNames.add(new CountryModel("Япония", "Токио", "https://www.free-wallpapers.su/data/media/418/big/fl0073.jpg"));
        countryNames.add(new CountryModel("Китай", "Пекин", "https://w.forfun.com/fetch/72/72d1e5fb0796df5e6254154072d3d259.jpeg"));
        countryNames.add(new CountryModel("Кыргызстан", "Бишкек", "https://upload.wikimedia.org/wikipedia/commons/thumb/c/c7/Flag_of_Kyrgyzstan.svg/1600px-Flag_of_Kyrgyzstan.svg.png"));
        countryNames.add(new CountryModel("Казахстан", "Астана", "https://images.satu.kz/101132373_w640_h640_gosudarstvennyj-flag-respubliki.jpg"));
    }

    private void loadDataAfrica() {
        countryNames.add(new CountryModel("Алжир", "Алжир", "https://upload.wikimedia.org/wikipedia/commons/thumb/7/77/Flag_of_Algeria.svg/128px-Flag_of_Algeria.svg.png"));
        countryNames.add(new CountryModel("Египет", "Каир", "https://upload.wikimedia.org/wikipedia/commons/thumb/f/fe/Flag_of_Egypt.svg/128px-Flag_of_Egypt.svg.png"));
        countryNames.add(new CountryModel("Кения", "Найроби", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/49/Flag_of_Kenya.svg/128px-Flag_of_Kenya.svg.png"));
        countryNames.add(new CountryModel("Мадагаскар", "Антананариву", "https://upload.wikimedia.org/wikipedia/commons/thumb/b/bc/Flag_of_Madagascar.svg/128px-Flag_of_Madagascar.svg.png"));
        countryNames.add(new CountryModel("Мозамбик", "Мапуту", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d0/Flag_of_Mozambique.svg/128px-Flag_of_Mozambique.svg.png"));
    }

    private void loadDataAustralia() {
        countryNames.add(new CountryModel("Австралия", "Канберра", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/88/Flag_of_Australia_%28converted%29.svg/480px-Flag_of_Australia_%28converted%29.svg.png"));
        countryNames.add(new CountryModel("Тонга", "Нукуалофа", "https://upload.wikimedia.org/wikipedia/commons/thumb/9/9a/Flag_of_Tonga.svg/480px-Flag_of_Tonga.svg.png"));
        countryNames.add(new CountryModel("Кирибати", "Южная Тарава", "https://upload.wikimedia.org/wikipedia/commons/thumb/d/d3/Flag_of_Kiribati.svg/480px-Flag_of_Kiribati.svg.png"));
        countryNames.add(new CountryModel("Науру", "Нет", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/30/Flag_of_Nauru.svg/480px-Flag_of_Nauru.svg.png"));
        countryNames.add(new CountryModel("Тувалу", "Фунафути", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/38/Flag_of_Tuvalu.svg/480px-Flag_of_Tuvalu.svg.png"));
    }

    private void loadDataAmerica() {
        countryNames.add(new CountryModel("Парагвай", "Асунсьон", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/27/Flag_of_Paraguay.svg/480px-Flag_of_Paraguay.svg.png"));
        countryNames.add(new CountryModel("Белиз", "Бельмопан", "https://upload.wikimedia.org/wikipedia/commons/thumb/e/e7/Flag_of_Belize.svg/480px-Flag_of_Belize.svg.png"));
        countryNames.add(new CountryModel("Колумбия", "Богота", "https://upload.wikimedia.org/wikipedia/commons/thumb/2/21/Flag_of_Colombia.svg/480px-Flag_of_Colombia.svg.png"));
        countryNames.add(new CountryModel("Бразилия", "Бразилиа", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Flag_of_Brazil.svg/480px-Flag_of_Brazil.svg.png"));
        countryNames.add(new CountryModel("США", "Вашингтон", "https://upload.wikimedia.org/wikipedia/commons/thumb/a/a4/Flag_of_the_United_States.svg/480px-Flag_of_the_United_States.svg.png"));
    }

}