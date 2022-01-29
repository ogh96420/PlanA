package com.example.plan_a;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentJapen extends Fragment {
    private View view;

    public static FragmentJapen newInstance(){
        FragmentJapen fragmentJapen = new FragmentJapen();
        return fragmentJapen;
    }


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_japen, container, false);

        return view;
    }
}
