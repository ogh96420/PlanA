package com.example.plan_a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentUSA extends Fragment {
    private View view;

    public static FragmentUSA newInstance(){
        FragmentUSA fragmentUSA = new FragmentUSA();
        return fragmentUSA;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_usa, container, false);

        return view;
    }
}
