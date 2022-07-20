package com.etonkooc.cooknote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Question extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.question);

        // 제과 버튼 클릭시 제과 문제풀기 화면으로 이동
        ImageButton cookie_bt = (ImageButton) findViewById(R.id.cookie_bt);
        // 제빵 버튼을 클릭 시 제빵 문제풀기 화면으로 전환
        ImageButton bread_bt = (ImageButton) findViewById(R.id.bread_bt);
        // 한식 버튼을 클릭시 제과 문제풀기 화면으로 이동
        ImageButton korean_food_bt = (ImageButton) findViewById(R.id.korean_food_bt);
        //종목별 문제 풀기-양식 버튼을 누를 시 액티비티 전환
        ImageButton western_food_bt = (ImageButton) findViewById(R.id.western_food_bt);
        //종목별 문제 풀기-조주 버튼을 누를 시 액티비티 전환
        ImageButton drink_bt = (ImageButton) findViewById(R.id.drink_bt);


        korean_food_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Korean_food.class);
                startActivity(intent);
            }
        });

        cookie_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Cookie.class);
                startActivity(intent);
            }
        });

        bread_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Bread.class);
                startActivity(intent);
            }
        });


        western_food_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Western_food.class);
                startActivity(intent);
            }
        });


        drink_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Drink.class);
                startActivity(intent);
            }
        });
    }
}
