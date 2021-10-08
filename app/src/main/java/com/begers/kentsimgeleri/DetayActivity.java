package com.begers.kentsimgeleri;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.begers.kentsimgeleri.databinding.ActivityDetayBinding;

import java.lang.reflect.Field;

public class DetayActivity extends AppCompatActivity {

    private ActivityDetayBinding binding; //binding kullanılarak view öğelerimize erişim sağlayacağiz.
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDetayBinding.inflate(getLayoutInflater()); //layout nesleleri ile bağlama işlemi yapılıyor.
        View view = binding.getRoot();
        setContentView(view);


    }
}