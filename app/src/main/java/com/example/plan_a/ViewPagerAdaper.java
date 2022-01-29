package com.example.plan_a;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

public class ViewPagerAdaper extends FragmentPagerAdapter {
    public ViewPagerAdaper(@NonNull FragmentManager fm) {
        super(fm);
    }
    // 뷰페이저 어댑터



    // 프래그먼트 교체를 보여주는 처리를 구현한 곳
    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return FragmentKorea.newInstance();
            case 1:
                return FragmentChina.newInstance();
            case 2:
                return FragmentJapen.newInstance();
            case 3:
                return FragmentUSA.newInstance();
            default:
                return null;

        }


    }

    @Override
    public int getCount() {
        return 4;
    }


    //상단의 탭 레이아웃 인디케이터 쪽에 텍스터를 선언해주는 곳
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "한식";
            case 1:
                return "중식";
            case 2:
                return "일식";
            case 3:
                return "양식";
            default:
                return null;

        }
    }
}







