package com.begers.kentsimgeleri;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;

import com.begers.kentsimgeleri.databinding.ActivityDetayBinding;
import com.begers.kentsimgeleri.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding; //binding kullanılarak view öğelerimize erişim sağlayacağiz.

    List<Landmark> data;

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); //layout nesleleri ile bağlama işlemi yapılıyor.
        View view = binding.getRoot();
        setContentView(view);

        data = new ArrayList<>();

        Landmark ayasofya =new Landmark("Ayasofya", "Türkiye", R.drawable.ayasofya);
        Landmark galataKulesi =new Landmark("Galata Kulesi", "Türkiye", R.drawable.galata_kulesi);
        Landmark kizKulesi =new Landmark("Kız Kulesi", "Türkiye", R.drawable.kiz_kulesi);
        Landmark londonBridge =new Landmark("London Bridge", "UK", R.drawable.london_brige);
        Landmark pisa =new Landmark("Pisa", "Italy", R.drawable.pisa);

        data.add(ayasofya);
        data.add(galataKulesi);
        data.add(kizKulesi);
        data.add(londonBridge);
        data.add(pisa);

        //adapter -- listView -- mapping
        ArrayAdapter arrayAdapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1,
                data.stream().map(landmark -> landmark.getName()).collect(Collectors.toList())
                );
        binding.listView.setAdapter(arrayAdapter);

    }
}