package com.example.plan_a;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.google.android.material.tabs.TabLayout;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class THR1 extends FragmentActivity {



    private FragmentPagerAdapter fragmentPagerAdapter; //뷰페이저
    private RecyclerView recyclerView;
    private RecyclerView.Adapter adapter;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<List> arrayList;
    private FirebaseDatabase database;
    private DatabaseReference databaseReference;
    KoreaFragment fragment_korea;
    ChinaFragment fragment_china;
    JapenFragment fragment_japen;
    UsaFragment fragment_usa;
    Button button_korea, button_japen, button_china, button_usa;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thr1);


        ViewPager viewPager = findViewById(R.id.viewPager);
        fragmentPagerAdapter = new ViewPagerAdaper(getSupportFragmentManager());

        TabLayout tabLayout = findViewById(R.id.tab_layout);
        viewPager.setAdapter(fragmentPagerAdapter);
        tabLayout.setupWithViewPager(viewPager);
        //뷰페이저 세팅

        fragment_korea = new KoreaFragment();
        fragment_china = new ChinaFragment();
        fragment_japen = new JapenFragment();
        fragment_usa = new UsaFragment();

        /*button_korea = findViewById(R.id.button_korea);
        button_korea.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout2, fragment_korea).commit();
            }
        });

        button_china = findViewById(R.id.button_china);
        button_china.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout2, fragment_china).commit();
            }
        });

        button_japen = findViewById(R.id.button_japen);
        button_japen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout2, fragment_japen).commit();
            }
        });

        button_usa = findViewById(R.id.button_USA);
        button_usa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getSupportFragmentManager().beginTransaction().replace(R.id.framelayout2, fragment_usa).commit();
            }
        });*/
    }
}
