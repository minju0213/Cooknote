package com.example.cooknote;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.viewpager.widget.ViewPager;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

public class Recipe extends AppCompatActivity {
    private final int Fragment_1 = 1;
    private final int Fragment_2 = 2;
    private final int Fragment_3 = 3;
    private final int Fragment_4 = 4;
    private final int Fragment_5 = 5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);

// Fragment1
        findViewById(R.id.btn1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                FragmentView(Fragment_1);

            }
        });

// Fragment2
        findViewById(R.id.btn2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_2);


            }
        });
// Fragment3
        findViewById(R.id.btn3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_3);


            }
        });
// Fragment4
        findViewById(R.id.btn4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_4);


            }
        });
// Fragment5
        findViewById(R.id.btn5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentView(Fragment_5);


            }
        });

        FragmentView(Fragment_1);
    }

    private void FragmentView(int fragment){

        //FragmentTransactiom를 이용해 프래그먼트를 사용합니다.
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();

        switch (fragment){
            case 1:
                // 첫번 째 프래그먼트 호출
                Fragment1 fragment1 = new Fragment1();
                transaction.replace(R.id.fragment_container, fragment1);
                transaction.commit();
                break;

            case 2:
                // 두번 째 프래그먼트 호출
                Fragment2 fragment2 = new Fragment2();
                transaction.replace(R.id.fragment_container, fragment2);
                transaction.commit();
                break;

            case 3:
                // 세번 째 프래그먼트 호출
                Fragment3 fragment3 = new Fragment3();
                transaction.replace(R.id.fragment_container, fragment3);
                transaction.commit();
                break;

            case 4:
                // 세번 째 프래그먼트 호출
                Fragment4 fragment4 = new Fragment4();
                transaction.replace(R.id.fragment_container, fragment4);
                transaction.commit();
                break;

            case 5:
                // 세번 째 프래그먼트 호출
                Fragment5 fragment5 = new Fragment5();
                transaction.replace(R.id.fragment_container, fragment5);
                transaction.commit();
                break;


        }

    }
}


