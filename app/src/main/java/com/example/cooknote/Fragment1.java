package com.example.cooknote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        setHasOptionsMenu(true);
        return inflater.inflate(R.layout.fragment_1, container, false);
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        setBtn();
    }
/*
    //    카테고리
//    1 = 히라가나, 2 = 가타카나
    void setBtn() {
        rye_bread_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startStudyActivity(1);
            }
        });
        btn_hiragana_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTestActivity(1);
            }
        });
        btn_gatakana_study.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startStudyActivity(2);
            }
        });
        btn_gatakana_test.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTestActivity(2);
            }
        });
        btn_daara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startChatBotActivity();
            }
        });
    }

 */

}
