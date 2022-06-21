package com.example.cooknote;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
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

    Button btn[] = new Button[10];
    Button btn_bread,btn_cookie,btn_western_food,btn_drink,btn_korean_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);
        init();
        set_make_bread();
        setBtn();

// Fragment1
        btn_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_make_bread();



            }
        });

// Fragment2
        btn_cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_make_cookie();


            }
        });
// Fragment3
        btn_western_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               set_make_western_food();


            }
        });
// Fragment4
        btn_korean_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               set_make_korean_food();


            }
        });
// Fragment5
       btn_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_make_drink();


            }
        });


    }
    void setBtn() {
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("호밀빵");
            }
        });
    }

    void init () {
        btn_bread = findViewById(R.id.btn1);
        btn_cookie = findViewById(R.id.btn2);
        btn_western_food = findViewById(R.id.btn3);
        btn_korean_food = findViewById(R.id.btn4);
        btn_drink = findViewById(R.id.btn5);
        btn[0] = findViewById(R.id.rye_bread_btn);
        btn[1] = findViewById(R.id.rye_bread_btn1);
        btn[2] = findViewById(R.id.rye_bread_btn2);
        btn[3] = findViewById(R.id.rye_bread_btn3);
        btn[4] = findViewById(R.id.rye_bread_btn4);
        btn[5] = findViewById(R.id.rye_bread_btn5);
        btn[6] = findViewById(R.id.rye_bread_btn6);
        btn[7] = findViewById(R.id.rye_bread_btn7);
        btn[8] = findViewById(R.id.rye_bread_btn8);
        btn[9] = findViewById(R.id.rye_bread_btn9);
    }
    void set_make_bread () {
        for (int i = 0; i < 10; i++){
            final int a = i;
            Log.d("TAG", "set_make_bread: ");
            if (i >= 0 && i <= 1){
                btn[a].setVisibility(View.VISIBLE);

            } else {
                btn[a].setVisibility(View.GONE);
            }
        }

    }


    void set_make_cookie () {
        for (int i = 0; i < 10; i++){
            if (i >= 2 && i <= 3){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }


    void set_make_western_food () {
        for (int i = 0; i < 10; i++){
            if (i >= 4 && i <= 5){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }


    void set_make_korean_food () {
        for (int i = 0; i < 10; i++){
            if (i >= 6 && i <= 7){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }


    void set_make_drink () {
        for (int i = 0; i < 10; i++){
            if (i >= 8 && i <= 9){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }

    void Wls_Recipe(String category) {
        Intent intent = new Intent(Recipe.this, Wls_Recipe.class);
        intent.putExtra("category",category);
        startActivity(intent);
    }
}


