package com.example.cooknote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class Wls_Recipe extends AppCompatActivity {

    String category;
    TextView recipe_text1,recipe_text2,recipe_text3,recipe_text4,recipe_text5,recipe_text6,recipe_text7,recipe_text8,recipe_text9,recipe_text10;

    TextView number_text_1,number_text_2,number_text_3,number_text_4,number_text_5,number_text_6,number_text_7,number_text_8,number_text_9,number_text_10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wls_recipe);
        findID();
        initActivity();

    }
    void findID(){
        recipe_text1 = findViewById(R.id.recipe_text1);
        recipe_text2 = findViewById(R.id.recipe_text2);
        recipe_text3 = findViewById(R.id.recipe_text3);
        recipe_text4 = findViewById(R.id.recipe_text4);
        recipe_text5 = findViewById(R.id.recipe_text5);
        recipe_text6 = findViewById(R.id.recipe_text6);
        recipe_text7 = findViewById(R.id.recipe_text7);
        recipe_text8 = findViewById(R.id.recipe_text8);
        recipe_text9 = findViewById(R.id.recipe_text9);
        recipe_text10 = findViewById(R.id.recipe_text10);

        number_text_1 = findViewById(R.id.number_text_1);
        number_text_2 = findViewById(R.id.number_text_2);
        number_text_3 = findViewById(R.id.number_text_3);
        number_text_4 = findViewById(R.id.number_text_4);
        number_text_5 = findViewById(R.id.number_text_5);
        number_text_6 = findViewById(R.id.number_text_6);
        number_text_7 = findViewById(R.id.number_text_7);
        number_text_8 = findViewById(R.id.number_text_8);
        number_text_9 = findViewById(R.id.number_text_9);
        number_text_10 = findViewById(R.id.number_text_10);

    }

    void initActivity() {
        //초기화
        number_text_1.setText("");
        number_text_2.setText("");
        number_text_3.setText("");
        number_text_4.setText("");
        number_text_5.setText("");
        number_text_6.setText("");
        number_text_7.setText("");
        number_text_8.setText("");
        number_text_9.setText("");

        recipe_text1.setText("");
        recipe_text2.setText("");
        recipe_text3.setText("");
        recipe_text4.setText("");
        recipe_text5.setText("");
        recipe_text6.setText("");
        recipe_text7.setText("");
        recipe_text8.setText("");
        recipe_text9.setText("");

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

            //조주
        } else if (category.equals("푸스카페")) {
            recipe_41();
        } else if (category.equals("맨하탄")) {
            recipe_42();
        } else if (category.equals("드라이 마티니")){
            recipe_43();
        } else if (category.equals("올드 패션드")){
            recipe_44();
        } else if (category.equals("브랜디 알렉산더")) {
            recipe_45();
        } else if (category.equals("싱가폴 슬링")){
            recipe_46();
        } else if (category.equals("블랙 러시안")){
            recipe_47();
        } else if (category.equals("마가리타")) {
            recipe_48();
        } else if (category.equals("러스티 네일")){
            recipe_49();
        } else if (category.equals("위스키 사워")){
            recipe_50();
        } else {
        finish();
        }

}


    // 제빵
    void recipe_1()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

    recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
    recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
    recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
    recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
    recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
    recipe_text6.setText("11~12개씩 4판 팬닝한다.");
    recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
    recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
    recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_2()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_3()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_4()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_5()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_6()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_7()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_8()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_9()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_10()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}

    // 제과
    void recipe_11()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_12()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_13()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_14()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_15()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_16()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_17()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_18()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_19()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_20()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}

    // 양식
    void recipe_21()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_22()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_23()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_24()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_25()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_26()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_27()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_28()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_29()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_30()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}

    // 한식
    void recipe_31()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_32()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_33()
    {   recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_34()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_35()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_36()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_37()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_38()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_39()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_40()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}

    //조주(동민)
    void recipe_41()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_42()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_43()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_44()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_45()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_46()
    {   recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_47()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_48()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_49()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_50()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");
        number_text_9.setText("9. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
        recipe_text6.setText("11~12개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
        recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}

}
