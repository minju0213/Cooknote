package com.example.cooknote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class Wls_Recipe extends AppCompatActivity {

    String category;
    String tittle;
    TextView recipe_text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wls_recipe);
        recipe_text1 = findViewById(R.id.recipe_text1);
        initActivity();

        recipe_text1.setText(tittle);


    }

    void initActivity() {
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        if (category.equals("빵도넛")) {
            bread_recipe_1();
        } else if (category.equals("소세지빵")) {
            bread_recipe_2();
        } else if (category.equals("식빵")){
           bread_recipe_3();
        } else if (category.equals("단팥빵")){
            bread_recipe_4();
        } else if (category.equals("그리시니")) {
            bread_recipe_5();
        } else if (category.equals("밤식빵")){
            bread_recipe_6();
        } else if (category.equals("베이글")){
            bread_recipe_7();
        } else if (category.equals("스위트롤")) {
            bread_recipe_8();
        } else if (category.equals("우유식빵")){
            bread_recipe_9();
        } else if (category.equals("크림빵")){
            bread_recipe_10();

        //제과
        } else if (category.equals("초코머핀")) {
            bread_recipe_11();
        } else if (category.equals("버터스펀지 케이크")) {
            bread_recipe_12();
        } else if (category.equals("젤리롤 케이크")){
            bread_recipe_13();
        } else if (category.equals("마드레느")){
            bread_recipe_14();
        } else if (category.equals("쇼트브레드 쿠키")) {
            bread_recipe_15();
        } else if (category.equals("슈")){
            bread_recipe_16();
        } else if (category.equals("브라우니")){
            bread_recipe_17();
        } else if (category.equals("과일케이크")) {
            bread_recipe_18();
        } else if (category.equals("파운드케이크")){
            bread_recipe_19();
        } else if (category.equals("다쿠와즈")){
            bread_recipe_20();
        } else {
        finish();
        }
    }

    void bread_recipe_1() { tittle = "빵도넛입니다";}

    void bread_recipe_2() { tittle = "소세지빵입니다"; }

    void bread_recipe_3() { tittle = "소세지빵입니다"; }

    void bread_recipe_4() { tittle = "입니다"; }

    void bread_recipe_5() { tittle = "빵도넛입니다";}

    void bread_recipe_6() { tittle = "소세지빵입니다"; }

    void bread_recipe_7() { tittle = "소세지빵입니다"; }

    void bread_recipe_8() { tittle = "입니다"; }

    void bread_recipe_9() { tittle = "소세지빵입니다"; }

    void bread_recipe_10() { tittle = "입니다"; }


    void bread_recipe_11() { tittle = "빵도넛입니다";}

    void bread_recipe_12() { tittle = "소세지빵입니다"; }

    void bread_recipe_13() { tittle = "소세지빵입니다"; }

    void bread_recipe_14() { tittle = "입니다"; }

    void bread_recipe_15() { tittle = "빵도넛입니다";}

    void bread_recipe_16() { tittle = "소세지빵입니다"; }

    void bread_recipe_17() { tittle = "소세지빵입니다"; }

    void bread_recipe_18() { tittle = "입니다"; }

    void bread_recipe_19() { tittle = "소세지빵입니다"; }

    void bread_recipe_20() { tittle = "입니다"; }

}
