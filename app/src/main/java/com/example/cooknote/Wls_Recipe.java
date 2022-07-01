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
            recipe_1();
        } else if (category.equals("소세지빵")) {
            recipe_2();
        } else if (category.equals("식빵")){
           recipe_3();
        } else if (category.equals("단팥빵")){
            recipe_4();
        } else if (category.equals("그리시니")) {
            recipe_5();
        } else if (category.equals("밤식빵")){
            recipe_6();
        } else if (category.equals("베이글")){
            recipe_7();
        } else if (category.equals("스위트롤")) {
            recipe_8();
        } else if (category.equals("우유식빵")){
            recipe_9();
        } else if (category.equals("크림빵")){
            recipe_10();

        //제과
        } else if (category.equals("초코머핀")) {
            recipe_11();
        } else if (category.equals("버터스펀지 케이크")) {
            recipe_12();
        } else if (category.equals("젤리롤 케이크")){
            recipe_13();
        } else if (category.equals("마드레느")){
            recipe_14();
        } else if (category.equals("쇼트브레드 쿠키")) {
            recipe_15();
        } else if (category.equals("슈")){
            recipe_16();
        } else if (category.equals("브라우니")){
            recipe_17();
        } else if (category.equals("과일케이크")) {
            recipe_18();
        } else if (category.equals("파운드케이크")){
            recipe_19();
        } else if (category.equals("다쿠와즈")){
            recipe_20();

        //양식
        } else if (category.equals("쉬림프 카나페")) {
            recipe_21();
        } else if (category.equals("스페니쉬 오믈렛")) {
            recipe_22();
        } else if (category.equals("치즈 오믈렛")){
            recipe_23();
        } else if (category.equals("월도프샐러드")){
            recipe_24();
        } else if (category.equals("포테이토샐러드")) {
            recipe_25();
        } else if (category.equals("BLT샌드위치")){
            recipe_26();
        } else if (category.equals("햄버거샌드위치")){
            recipe_27();
        } else if (category.equals("브라운스톡")) {
            recipe_28();
        } else if (category.equals("이탈리안미트소스")){
            recipe_29();
        } else if (category.equals("홀렌다이즈소스")){
            recipe_30();
        //한식
        } else if (category.equals("비빔밥")) {
            recipe_31();
        } else if (category.equals("콩나물밥")) {
            recipe_32();
        } else if (category.equals("장국죽")){
            recipe_33();
        } else if (category.equals("완자탕")){
            recipe_34();
        } else if (category.equals("생선찌개")) {
            recipe_35();
        } else if (category.equals("두부젓국찌개")){
            recipe_36();
        } else if (category.equals("제육구이")){
            recipe_37();
        } else if (category.equals("너비아니구이")) {
            recipe_38();
        } else if (category.equals("더덕구이")){
            recipe_39();
        } else if (category.equals("생선양념구이")){
            recipe_40();
        } else {
        finish();
        }
    }

    // 제빵
    void recipe_1() { tittle = "빵도넛입니다";}
    void recipe_2() { tittle = "소세지빵입니다"; }
    void recipe_3() { tittle = "소세지빵입니다"; }
    void recipe_4() { tittle = "입니다"; }
    void recipe_5() { tittle = "빵도넛입니다";}
    void recipe_6() { tittle = "소세지빵입니다"; }
    void recipe_7() { tittle = "소세지빵입니다"; }
    void recipe_8() { tittle = "입니다"; }
    void recipe_9() { tittle = "소세지빵입니다"; }
    void recipe_10() { tittle = "입니다"; }

    // 제과
    void recipe_11() { tittle = "빵도넛입니다";}
    void recipe_12() { tittle = "소세지빵입니다"; }
    void recipe_13() { tittle = "소세지빵입니다"; }
    void recipe_14() { tittle = "입니다"; }
    void recipe_15() { tittle = "빵도넛입니다";}
    void recipe_16() { tittle = "소세지빵입니다"; }
    void recipe_17() { tittle = "소세지빵입니다"; }
    void recipe_18() { tittle = "입니다"; }
    void recipe_19() { tittle = "소세지빵입니다"; }
    void recipe_20() { tittle = "입니다"; }

    // 양식
    void recipe_21() { tittle = "빵도넛입니다";}
    void recipe_22() { tittle = "소세지빵입니다"; }
    void recipe_23() { tittle = "소세지빵입니다"; }
    void recipe_24() { tittle = "입니다"; }
    void recipe_25() { tittle = "빵도넛입니다";}
    void recipe_26() { tittle = "소세지빵입니다"; }
    void recipe_27() { tittle = "소세지빵입니다"; }
    void recipe_28() { tittle = "입니다"; }
    void recipe_29() { tittle = "소세지빵입니다"; }
    void recipe_30() { tittle = "입니다"; }

    // 한식
    void recipe_31() { tittle = "빵도넛입니다";}
    void recipe_32() { tittle = "소세지빵입니다"; }
    void recipe_33() { tittle = "소세지빵입니다"; }
    void recipe_34() { tittle = "입니다"; }
    void recipe_35() { tittle = "빵도넛입니다";}
    void recipe_36() { tittle = "소세지빵입니다"; }
    void recipe_37() { tittle = "소세지빵입니다"; }
    void recipe_38() { tittle = "입니다"; }
    void recipe_39() { tittle = "소세지빵입니다"; }
    void recipe_40() { tittle = "입니다"; }


}
