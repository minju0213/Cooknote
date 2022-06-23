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

    Button btn[] = new Button[21];
    Button btn_bread,btn_cookie,btn_western_food,btn_drink,btn_korean_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);
        init();
        set_make_bread();
        setBtn();

// Bread
        btn_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_make_bread();



            }
        });

// Cookie
        btn_cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               set_make_cookie();


            }
        });
// Western_food
        btn_western_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               set_make_western_food();


            }
        });
// Korean_food
        btn_korean_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               set_make_korean_food();


            }
        });
// Drink
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
        btn[0] = findViewById(R.id.bread_recipe_btn1);
        btn[1] = findViewById(R.id.bread_recipe_btn2);
        btn[2] = findViewById(R.id.bread_recipe_btn3);
        btn[3] = findViewById(R.id.bread_recipe_btn4);
        btn[4] = findViewById(R.id.bread_recipe_btn5);
        btn[5] = findViewById(R.id.bread_recipe_btn6);
        btn[6] = findViewById(R.id.bread_recipe_btn7);
        btn[7] = findViewById(R.id.bread_recipe_btn8);
        btn[8] = findViewById(R.id.bread_recipe_btn9);
        btn[9] = findViewById(R.id.bread_recipe_btn10);

        btn[10] = findViewById(R.id.cookie_recipe_btn1);
        btn[11] = findViewById(R.id.cookie_recipe_btn2);
        btn[12] = findViewById(R.id.cookie_recipe_btn3);
        btn[13] = findViewById(R.id.cookie_recipe_btn4);
        btn[14] = findViewById(R.id.cookie_recipe_btn5);
        btn[15] = findViewById(R.id.cookie_recipe_btn6);
        btn[16] = findViewById(R.id.cookie_recipe_btn7);
        btn[17] = findViewById(R.id.cookie_recipe_btn8);
        btn[18] = findViewById(R.id.cookie_recipe_btn9);
        btn[19] = findViewById(R.id.cookie_recipe_btn10);
    }
    void set_make_bread () {
        for (int i = 0; i < 19; i++){
            if (i >= 0 && i <= 9){
                btn[i].setVisibility(View.VISIBLE);


            } else {
                btn[i].setVisibility(View.GONE);
            }

        }

    }


    void set_make_cookie () {
        for (int i = 10; i < 19; i++){
            if (i >= 10 && i <= 19){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }

        }

    }


    void set_make_western_food () {
        for (int i = 0; i < 10; i++){
            if (i >= 20 && i <= 29){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }


    void set_make_korean_food () {
        for (int i = 0; i < 10; i++){
            if (i >= 30 && i <= 39){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }


    void set_make_drink () {
        for (int i = 0; i < 10; i++){
            if (i >= 40 && i <= 49){
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


