package com.example.cooknote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Wls_Recipe extends AppCompatActivity {

    String category;
    String[] arrayOriginal = new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initActivity();

    }

    void initActivity() {
        Intent intent = getIntent();
        category = String.valueOf(intent.getIntExtra("category", 1));
        if (category == "제빵") {
            setBreadRecipe();
        } else if(category == "제과") {
            setCookieRecipe();
        } else {
            finish();
        }

    }

    void setBreadRecipe() {
        arrayOriginal[0] = "호밀빵";
        arrayOriginal[1] = "식빵";
        arrayOriginal[2] = "단팥빵";
        arrayOriginal[3] = "감빵";
        arrayOriginal[4] = "죽빵";

        arrayOriginal[5] = "뿡빵";
        arrayOriginal[6] = "뛰뛰빵빵";
        arrayOriginal[7] = "무슨빵";
        arrayOriginal[8] = "어쩔티빵";
        arrayOriginal[9] = "저쩔티빵";
    }

    void setCookieRecipe() {
        arrayOriginal[0] = "초코쿠키";
        arrayOriginal[1] = "버터쿠키";
        arrayOriginal[2] = "일단쿠키";
        arrayOriginal[3] = "개발하기싫쿠키";
        arrayOriginal[4] = "집가고싶쿠키";

        arrayOriginal[5] = "촉촉한쿠키";
        arrayOriginal[6] = "퍽퍽한쿠키";
        arrayOriginal[7] = "그냥그런쿠키";
        arrayOriginal[8] = "쿠.쿠쿠.쿠.쿠키";
        arrayOriginal[9] = "쿠쿠하세요쿠쿠키";
    }



}
