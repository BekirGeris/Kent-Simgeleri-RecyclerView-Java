package com.begers.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.begers.kentsimgeleri.databinding.ActivityDetayBinding;
import com.begers.kentsimgeleri.databinding.ActivityMainBinding;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding; //binding kullanılarak view öğelerimize erişim sağlayacağiz.

    List<Landmark> data;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater()); //layout nesleleri ile bağlama işlemi yapılıyor.
        View view = binding.getRoot();
        setContentView(view);

        Landmark ayasofya =new Landmark("Ayasofya", "Türkiye", R.drawable.ayasofya);
        Landmark galataKulesi =new Landmark("Ayasofya", "Türkiye", R.drawable.galata_kulesi);
        Landmark kizKulesi =new Landmark("Ayasofya", "Türkiye", R.drawable.kiz_kulesi);
        Landmark londonBridge =new Landmark("Ayasofya", "Türkiye", R.drawable.london_brige);
        Landmark pisa =new Landmark("Ayasofya", "Türkiye", R.drawable.pisa);

        data.add(ayasofya);
        data.add(galataKulesi);
        data.add(kizKulesi);
        data.add(londonBridge);
        data.add(pisa);

    }
}