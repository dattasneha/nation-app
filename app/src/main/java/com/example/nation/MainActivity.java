package com.example.nation;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {
    private ImageView country_image;
    private RadioGroup radiogroup;
    private RadioButton radioIndia, radioAmerica, radioUK, radioChina;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        country_image = findViewById(R.id.imageView2);
        radiogroup = findViewById(R.id.radioGroup);
        radioIndia = findViewById(R.id.radioIndia);
        radioAmerica = findViewById(R.id.radioAmerica);
        radioUK = findViewById(R.id.radioUk);
        radioChina = findViewById(R.id.radioChina);

        radiogroup.setOnCheckedChangeListener((group, checkedId) -> {
            int imageResource = R.drawable.placeholder;
            if(checkedId==R.id.radioIndia) {
                imageResource = R.drawable.india;
            }
            else if(checkedId==R.id.radioAmerica) {
                imageResource = R.drawable.image2;
            }
            else if(checkedId==R.id.radioUk) {
                imageResource = R.drawable.british;
            }
            else if(checkedId==R.id.radioChina) {
                imageResource = R.drawable.china;
            }

            country_image.setImageResource(imageResource);
        });
    }
}