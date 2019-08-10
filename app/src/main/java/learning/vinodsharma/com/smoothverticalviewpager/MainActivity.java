package learning.vinodsharma.com.smoothverticalviewpager;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.view.PagerAdapter;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.prabhat1707.verticalpager.VerticalViewPager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private VerticalViewPager viewPager;
    PagerAdapter pagerAdapter;


    List<Fragment> list = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        list.add(new FragMyFragment());
        list.add(new SecondFragment());
        list.add(new ThirdFragment());
        viewPager = findViewById(R.id.viewPager);
        pagerAdapter = new MyAdapter(getSupportFragmentManager(), list);
        viewPager.setAdapter(pagerAdapter);

    }
}