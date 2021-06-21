package com.example.wechatpage;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ViewPager2 viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initPager();
    }

    private void initPager() {
        viewPager = findViewById(R.id.id_viewPager);
        ArrayList<Fragment> fragments = new ArrayList<>();
        fragments.add(BlankFragment.newInstance("微信"));
        fragments.add(BlankFragment.newInstance("通讯录"));
        fragments.add(BlankFragment.newInstance("朋友圈"));
        fragments.add(BlankFragment.newInstance("我"));
        MyFragmentPagerAdapter PagerAdapter = new MyFragmentPagerAdapter(
                getSupportFragmentManager(),getLifecycle(),fragments);
        viewPager.setAdapter(PagerAdapter);
    }
}