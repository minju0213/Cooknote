package com.example.cooknote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;


public class FragmentC extends Fragment {
    private int frag_num;
    TextView data_t;

    public FragmentC(){

    }

    public static FragmentC newInstance(int num){
        FragmentC fragment = new FragmentC();
        Bundle args = new Bundle();
        args.putInt("num",num);
        fragment.setArguments(args);
        return fragment;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        frag_num = getArguments().getInt("num", 0);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(
                R.layout.fragment_c, container, false);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }

    @Override
    public void onStop() {
        super.onStop();
    }
}