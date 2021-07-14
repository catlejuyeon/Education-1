package com.example.education;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import java.util.ArrayList;
import java.util.List;

public class SubActivity3 extends AppCompatActivity {

    private ViewPager2 viewPager2;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.subactivity3_main);

        viewPager2 = findViewById(R.id.viewPagerImageSlider);

        List<SliderItem> sliderItems = new ArrayList<>();
        sliderItems.add(new SliderItem(R.drawable.runner1));
        sliderItems.add(new SliderItem(R.drawable.runner2));
        sliderItems.add(new SliderItem(R.drawable.runner3));
        sliderItems.add(new SliderItem(R.drawable.runner4));
        sliderItems.add(new SliderItem(R.drawable.runner5));

        viewPager2.setAdapter(new SliderAdapter(sliderItems, viewPager2));

    }
}
