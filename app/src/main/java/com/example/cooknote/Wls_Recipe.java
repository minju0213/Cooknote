package com.example.cooknote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class Wls_Recipe extends AppCompatActivity {

    String category;
    TextView recipe_text1, recipe_text2, recipe_text3, recipe_text4, recipe_text5, recipe_text6, recipe_text7, recipe_text8, recipe_text9, recipe_text10, recipe_text11;
    TextView recipe_text12, recipe_text13, recipe_text14, recipe_text15, recipe_text16, recipe_text17, recipe_text18, recipe_text19, recipe_text20, recipe_text21, recipe_text22, recipe_text23;


    TextView number_text_1, number_text_2, number_text_3, number_text_4, number_text_5, number_text_6, number_text_7, number_text_8, number_text_9, number_text_10, number_text_11;
    TextView number_text_12, number_text_13, number_text_14, number_text_15, number_text_16, number_text_17, number_text_18, number_text_19, number_text_20, number_text_21, number_text_22, number_text_23;

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
        recipe_text11 = findViewById(R.id.recipe_text11);
        recipe_text12 = findViewById(R.id.recipe_text12);
        recipe_text13 = findViewById(R.id.recipe_text13);
        recipe_text14 = findViewById(R.id.recipe_text14);
        recipe_text15 = findViewById(R.id.recipe_text15);
        recipe_text16 = findViewById(R.id.recipe_text16);
        recipe_text17 = findViewById(R.id.recipe_text17);
        recipe_text18 = findViewById(R.id.recipe_text18);
        recipe_text19 = findViewById(R.id.recipe_text19);
        recipe_text20 = findViewById(R.id.recipe_text20);
        recipe_text21 = findViewById(R.id.recipe_text21);
        recipe_text22 = findViewById(R.id.recipe_text22);
        recipe_text23 = findViewById(R.id.recipe_text23);



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
        number_text_11 = findViewById(R.id.number_text_11);
        number_text_12 = findViewById(R.id.number_text_12);
        number_text_13 = findViewById(R.id.number_text_13);
        number_text_14 = findViewById(R.id.number_text_14);
        number_text_15 = findViewById(R.id.number_text_15);
        number_text_16 = findViewById(R.id.number_text_16);
        number_text_17 = findViewById(R.id.number_text_17);
        number_text_18 = findViewById(R.id.number_text_18);
        number_text_19 = findViewById(R.id.number_text_19);
        number_text_20 = findViewById(R.id.number_text_20);
        number_text_21 = findViewById(R.id.number_text_21);
        number_text_22 = findViewById(R.id.number_text_22);
        number_text_23 = findViewById(R.id.number_text_23);

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
        number_text_10.setText("");
        number_text_11.setText("");
        number_text_12.setText("");
        number_text_13.setText("");
        number_text_14.setText("");
        number_text_15.setText("");
        number_text_16.setText("");
        number_text_17.setText("");
        number_text_18.setText("");
        number_text_19.setText("");
        number_text_20.setText("");
        number_text_21.setText("");
        number_text_22.setText("");
        number_text_23.setText("");


        recipe_text1.setText("");
        recipe_text2.setText("");
        recipe_text3.setText("");
        recipe_text4.setText("");
        recipe_text5.setText("");
        recipe_text6.setText("");
        recipe_text7.setText("");
        recipe_text8.setText("");
        recipe_text9.setText("");
        recipe_text10.setText("");
        recipe_text11.setText("");
        recipe_text12.setText("");
        recipe_text13.setText("");
        recipe_text14.setText("");
        recipe_text15.setText("");
        recipe_text16.setText("");
        recipe_text17.setText("");
        recipe_text18.setText("");
        recipe_text19.setText("");
        recipe_text20.setText("");
        recipe_text21.setText("");
        recipe_text22.setText("");
        recipe_text23.setText("");



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
    void recipe_1()//빵도넛
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
    recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
    recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
    recipe_text4.setText("46g씩 분할하고 둥글리기 후 스틱모양으로 예비정형해 약 10분간 중간발효한다.");
    recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, 꽈배기는 30~33cm 밀어편 후 양쪽 끝을 얇게하여 꼬아서 성형한다.");
    recipe_text6.setText("11~12개씩 4판 팬닝한다.");
    recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
    recipe_text8.setText("2차발효동안 튀김기름을 준비한다.");
    recipe_text9.setText("튀김기름 175~185℃가 되었을 때 반죽을 넣고 한 면당 약 1분씩 화이트라인이 나오게 튀겨준다.");}
    void recipe_2()//소시지빵
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
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("1차발효동안 양파를 찹하고, 케찹과 \n마요네즈, 피자치즈를 준비한다.");
        recipe_text5.setText("70g씩 분할하고 둥글리기 후 약 10분간 중간발효한다.");
        recipe_text6.setText("가스 빼듯 눌러준 후 뒤집어 소시지를 감싸고 6개씩 2판에 총 12개 팬닝한다. (남은 반죽 제출)");
        recipe_text7.setText("낙엽모양은 가위를 기울여서 7번 또는 \n9번(홀수) 깊이 가위집 내 성형하고, \n꽃잎모양은 가위를 세워서 6번 또는 \n8번(짝수) 깊이 가위집 내 성형한다.");
        recipe_text8.setText("반죽 위에 양파 찹한 것을 평평하게 \n올리고 피자치즈를 올린 후 마요네즈와 \n케찹을 반죽 위까지만 뿌려준다. \n(철판에 소스가 닿으면 탐)");
        recipe_text9.setText("190/160℃에 약 15~20분 굽는다.");}
    void recipe_3()//식빵
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
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("170g씩 분할하고 둥글리기 후 \n약 10분간 중간발효한다.");
        recipe_text5.setText("밀어펴기 -> 뒤집어 3겹접기 -> \n누르기 -> 빈공간 없이 꼼꼼하게 \n말아 이음매 일자로 \n봉합하기 순으로 성형한다.");
        recipe_text6.setText("한 팬에 세 덩이씩 총 4팬 팬닝 후 \n펀칭한다. (처음 성형한 반죽을 가운데 두고 팬닝)");
        recipe_text7.setText("발효실에 넣고 틀 밑 1cm까지 2차\n발효한다.");
        recipe_text8.setText("160/180℃에 약 30분 굽는다. \n(옆 색 확인)");
        recipe_text9.setText("작업대 위에 펀칭하고 \n즉시 틀 제거한다.");}
    void recipe_4()//단팥빵
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
        recipe_text4.setText("1차발효동안 팥앙금 개량 후 40g씩 분할해 준비한다. ");
        recipe_text5.setText("50g씩 분할하고 둥글리기 후 약 10분간 중간발효한다.");
        recipe_text6.setText("가스 빼듯 눌러준 후 헤라 이용하여 앙금을 포앙하고 지름 7~8cm 크기로 성형한다. (헤라 절대 내려놓지 않기)");
        recipe_text7.setText("12개씩 3판 팬닝한다.");
        recipe_text8.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text9.setText("190/150℃에 10~15분 굽는다.");}
    void recipe_5() //그리시니
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");


        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 30분간 1차발효한다.");
        recipe_text4.setText("30g씩 분할하고 둥글리기 후 \n스틱모양으로 예비정형해 \n약 10분간 중간발효한다.");
        recipe_text5.setText("길이 35~40cm로 2~3회에 나누어 \n길이 일정하게 밀어편다.");
        recipe_text6.setText("10~11개씩 4판 팬닝한다.");
        recipe_text7.setText("발효실에 넣고 약 15분간 2차발효한다. (시험장 오븐에는 3판씩만 들어갈 수 \n있으므로 한 판은 미리 꺼내 \n실온발효 해야 함)");
        recipe_text8.setText("210/180℃에 15~20분 굽는다.");}
    void recipe_6()//밤식빵
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
        number_text_10.setText("10. ");
        number_text_11.setText("11. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("1차발효동안 밤을 개량하고 \n토핑물 제조 유지 포마드화 -> \n감미료 크림화(거품 많이 내기) -> \n달걀 크림화 -> \n체 친 가루 가르듯이 혼합 -> \n깍지 끼운 짤주머니에 담아 준비");
        recipe_text5.setText("450g씩 분할하고 둥글리기 후 \n중간발효한다.");
        recipe_text6.setText("밀어펴기 -> 밤 올리기 -> 위에서부터 가볍게 끌어와 말아주기(원루프형) -> 이음매 일자로 봉합하기 순으로 \n성형한다.");
        recipe_text7.setText("한 팬에 한 덩이씩 4팬 팬닝 후 \n살짝 펀칭한다.");
        recipe_text8.setText("발효실에 넣고 틀 밑 2cm까지 \n2차발효한다.");
        recipe_text9.setText("윗면에 4~5줄 토핑 짜고 \n아몬드 슬라이스 올려준다.");
        recipe_text10.setText("160/180℃에 30분 굽는다. \n(옆 색 확인)");
        recipe_text11.setText("작업대 위에 펀칭하고 \n즉시 틀 제거한다.");}
    void recipe_7() //베이글
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
        number_text_10.setText("10. ");
        number_text_11.setText("11. ");


        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("1차발효동안 유산지 재단한다.");
        recipe_text5.setText("80g씩 분할하고 둥글리기 후 약 10분간 중간발효한다.");
        recipe_text6.setText("약 25cm로 밀어펴기 -> \n뒤집어 세로로 3겹접기 -> \n말기 -> \n이음매 일자로 봉합하기 -> \n한 쪽 끝은 얇게 밀고, \n한 쪽 끝은 밀대로 넓게 밀어펴 \n넓은 쪽이 얇은 쪽을 감싸 \n봉합하기 (속지름 4cm 이상) -> \n이음매가 아래로 가게 해서 \n유산지 붙여 팬닝하기 순으로 성형한다.");
        recipe_text7.setText("8개씩 2판에 총 16개 팬닝한다.");
        recipe_text8.setText("발효실에 넣고 약 20분간 2차발효한다.");
        recipe_text9.setText("2차발효동안 버너 가져와 물 끓여 \n준비한다.");
        recipe_text10.setText("팔팔 끓는 물에 한 면 당 10초정도 \n데친다. (이 때 유산지 떼기)");
        recipe_text11.setText("210/180℃에 15~20분 굽는다.");}
    void recipe_8() //스위트롤
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
        number_text_10.setText("10. ");
        number_text_11.setText("11. ");

        recipe_text1.setText("유지 제외한 모든 재료 넣어 저속으로 혼합한다.");
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("1차발효동안 물(또는 용해버터)과 계피설탕을 준비한다.");
        recipe_text5.setText("두 덩이(한 덩이로 해도 됨)로 나눠 \n둥글리기 후 약 10분간 중간발효한다.");
        recipe_text6.setText("세로 30~35cm, 두께 0.5cm 직사각형으로 밀어편다.");
        recipe_text7.setText("봉합 부분 1cm를 제외한 반죽 전체에 \n붓으로 물 또는 용해버터를 바르고 \n계피설탕을 골고루 펼친다.");
        recipe_text8.setText("꼼꼼하게 말아올려 봉합한다.");
        recipe_text9.setText("스크래퍼를 이용해 두꼐 1.5cm로 2번 \n잘라 트리플리프형과 1번 잘라 \n야자잎형 모양으로 성형한다.");
        recipe_text10.setText("야자잎형 12개 1판, 트리플리프형 9개 1판 팬닝한다. (남은 반죽 제출)");
        recipe_text11.setText("발효실에 넣고 약 30분간 2차발효한다.");}
    void recipe_9()//우유식빵
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
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("180g씩 분할하고 둥글리기 후 약 10분간 중간발효한다.");
        recipe_text5.setText("밀어펴기 -> \n뒤집어 3겹접기 -> \n누르기 -> \n빈공간 없이 꼼꼼하게 말아 이음매 \n일자로 봉합하기 순으로 성형한다.");
        recipe_text6.setText("한 팬에 세 덩이씩 \n총 4팬 팬닝 후 펀칭한다. \n(처음 성형한 반죽을 가운데 두고 팬닝)");
        recipe_text7.setText("발효실에 넣고 틀 밑 1cm까지 \n2차발효한다.");
        recipe_text8.setText("160/180℃에 약 30분 굽는다. \n(옆 색 확인)");
        recipe_text9.setText("작업대 위에 펀칭하고 즉시 틀 제거한다.");}

    void recipe_10() //단과자빵-트위스트형
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
        recipe_text2.setText("클린업 단계에서 유지 넣어 중속으로 \n혼합하고 최종단계까지 믹싱한다.");
        recipe_text3.setText("발효실에 넣고 약 40분간 1차발효한다.");
        recipe_text4.setText("50g씩 분할하고 둥글리기 후 \n스틱모양으로 예비정형해 \n약 10분간 중간발효한다.");
        recipe_text5.setText("8자형은 25cm 밀어편 후 8자 모양 잡고, \n달팽이형은 35~40cm 밀고 굵은 쪽을 중심으로 돌려가며 \n느슨하게 원을 만든 후 얇은 끝부분을 \n아래쪽으로 살짝 넣어 성형한다.");
        recipe_text6.setText("12개씩 2판 팬닝한다. \n(남은 반죽 제출)");
        recipe_text7.setText("발효실에 넣고 약 30분간 2차발효한다.");
        recipe_text8.setText("190/150℃에 10~15분 굽는다.");}

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
        number_text_10.setText("10. ");
        number_text_11.setText("11. ");
        number_text_12.setText("12. ");
        number_text_13.setText("13. ");
        number_text_14.setText("14. ");
        number_text_15.setText("15. ");
        number_text_16.setText("16. ");
        number_text_17.setText("17. ");
        number_text_18.setText("18. ");
        number_text_19.setText("19. ");
        number_text_20.setText("20. ");
        number_text_21.setText("21. ");
        number_text_22.setText("22. ");
        number_text_23.setText("23. ");

        recipe_text1.setText("재료를 전처리한다.\n" +
                ": 쌀 (물에 불려 보관) / 소고기 / 달걀 / 건다시마 / 그 외 재료 등으로 구분");
        recipe_text2.setText("물을 끓인다.");
        recipe_text3.setText("대파, 마늘을 다진다.");
        recipe_text4.setText("청포묵 껍질을 제거하고 5 X 0.5 X 0.5cm 크기로 잘라준다.");
        recipe_text5.setText("끓는 물에 소금을 넣고 청포묵이 투명해질 때까지 데치고 찬물에 헹군 후 소금 1/6t, 참기름 1/3t 넣고 간을 한다.");
        recipe_text6.setText("밥을 짓는다.\n" +
                ": 불려둔 쌀 씻기 -> 냄비에 쌀 1C, 물 1C 계량해 밥 앉히기 -> 강불에 2~3분 끓이기 -> 끓으면 중불에 5~6분 두기 -> 타닥타닥 소리 나면 약불에 1~2분 뜸 들이기 -> 불 끄고 5분 뜸 들이기");
        recipe_text7.setText("애호박을 돌려깎아 5 X 0.3 X 0.3cm 크기로 채 썰고 소금에 절인다.");
        recipe_text8.setText("도라지를 5cm 길이로 자르고 두꺼운 부분은 2~3등분 하여 소금에 절인다.");
        recipe_text9.setText("고사리를 5cm 길이로 자른다.");
        recipe_text10.setText("간장 2t, 설탕 1t, 대파, 마늘, 깨 (부숴서) 조금, 후추가루 조금, 참기름 1/3t 섞어 양념을 만든다.");
        recipe_text11.setText("고사리를 양념 소량에 버무린다.");
        recipe_text12.setText("소고기 5 X 0.3 X 0.3cm 크기로 채 썰고 남은 고기는 다진다.");
        recipe_text13.setText("채 썬 고기는 양념에 버무린다.");
        recipe_text14.setText("달걀 황/백을 분리하고 각각 소금 간을 한다.");
        recipe_text15.setText("소금에 절여진 애호박, 도라지를 면보에 감싸 찬물에 충분히 헹군 후 수분을 제거한다.");
        recipe_text16.setText("팬에 식용유 1T 넣고 다시마를 튀긴다. (사용한 기름 버리지 말고 애호박 볶을 때 다시 사용하기)");
        recipe_text17.setText("식용유 1t 제외한 기름을 걷어내고 팬을 코팅한 후 황/백 지단을 부친다.");
        recipe_text18.setText("팬에 식용유 1T 넣고 애호박, 도라지, 고사리, 소고기를 볶는다.");
        recipe_text19.setText("약불에 식용유 1t, 다진 소고기를 볶은 후 고추장 2T, 설탕 1t, 물 1t, 참기름 1/3t 넣고 볶아 약고추장을 만든다.");
        recipe_text20.setText("황/백 지단을 5 X 0.3 X 0.3cm 크기로 채 썰어준다.");
        recipe_text21.setText("다시마를 키친타올로 감싸 부순다.");
        recipe_text22.setText("완성 그릇에 그릇에 밥을 담고 흰(무)색 재료와 유색 재료를 번갈아가며 다른 재료들과 섞이지 않게 방향을 맞춰 가지런히 담아준다.");
        recipe_text23.setText("가운데 고추장을 얹고 고추장 위에 다시마를 올려 제출한다.");}
    void recipe_32()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");


        recipe_text1.setText("재료를 전처리한다.\n" +
                ": 쌀 (물에 불려 보관) / 소고기 / 그 외 재료 등으로 구분");
        recipe_text2.setText("대파, 마늘을 다진다.");
        recipe_text3.setText("콩나물 꼬리를 제거한 후 길이가 너무 길면(약 10cm 이상) 반으로 잘라 사용하고 너무 짧으면(약 2~3cm) 폐기한다.");
        recipe_text4.setText("소고기 6~7cm 길이로 얇게 채 썰어준다.");
        recipe_text5.setText("채 썬 고기에 대파, 마늘, 간장 1/2t, 참기름 1/3t 넣고 양념한다.");
        recipe_text6.setText("밥을 짓는다.\n" +
                ": 불려둔 쌀 씻기 -> 냄비에 쌀 1C, 물 1C 계량하고 콩나물, 소고기 넣어 밥 앉히기 (소고기 최대한 한 서로 붙지 않게 넣기) -> 강불에 2~3분 끓이기 -> 김 올라오면 중불에 5~6분 두기 -> 타닥타닥 소리 나면 약불에 1~2분 뜸 들이기 -> 불 끄고 5분 뜸 들이기");
        recipe_text7.setText("플레이팅 후 제출한다.");}
    void recipe_33()
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
        number_text_10.setText("10. ");
        number_text_11.setText("11. ");
        number_text_12.setText("12. ");

        recipe_text1.setText("재료를 전처리한다.\n: 쌀 (물에 불려 보관) / 소고기 / 그 외 재료 등으로 구분");
        recipe_text2.setText("대파, 마늘을 다진다.");
        recipe_text3.setText("표고버섯 밑둥을 제거해 3cm 길이로 채 썰어준 후 간장 1/3t, 참기름 1/6t 넣고 간을 한다.");
        recipe_text4.setText("소고기 기름 부분을 제거하고 다져준 후 대파, 마늘, 간장 1t, 깨 (부숴서) 조금, 후추가루 조금, 참기름 1/3t 넣고 간을 한다.");
        recipe_text5.setText("불려둔 쌀을 씻은 후 쌀 1/2C 계량하고 면보에 감싸 밀대로 빻는다.");
        recipe_text6.setText("계량컵으로 물 3C (쌀 6배) 따로 계량한다.");
        recipe_text7.setText("냄비에 참기름 1/3t 넣고 표고버섯, 소고기를 볶는다.");
        recipe_text8.setText("소고기가 반 정도 익으면 쌀을 넣고 함께 볶는다.");
        recipe_text9.setText("물을 조금씩 넣어가며 볶고, 어느정도 죽의 형태가 잡히면 남은 물의 반을 넣고 중간중간 올라오는 거품을 제거해가며 끓인다.");
        recipe_text10.setText("다시 죽의 형태가 나올 정도로 졸아들면 남은 물을 모두 넣고 중약불로 끓인다.");
        recipe_text11.setText("쌀알이 잘 퍼졌을 때 국간장 1t 넣고 간을 한다.");
        recipe_text12.setText("표고버섯이 위에 잘 보이게 올려 플레이팅 후 제출한다.");}
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

        recipe_text1.setText(".");
        recipe_text2.setText(".");
        recipe_text3.setText(".");
        recipe_text4.setText(".");
        recipe_text5.setText(".");
        recipe_text6.setText(".");
        recipe_text7.setText(".");
        recipe_text8.setText(".");
        recipe_text9.setText(".");}
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

        recipe_text1.setText(".");
        recipe_text2.setText(".");
        recipe_text3.setText(".");
        recipe_text4.setText(".");
        recipe_text5.setText(".");
        recipe_text6.setText(".");
        recipe_text7.setText(".");
        recipe_text8.setText(".");
        recipe_text9.setText(".");}
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

        recipe_text1.setText(".");
        recipe_text2.setText(".");
        recipe_text3.setText(".");
        recipe_text4.setText(".");
        recipe_text5.setText(".");
        recipe_text6.setText(".");
        recipe_text7.setText(".");
        recipe_text8.setText(".");
        recipe_text9.setText(".");}
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

        recipe_text1.setText(".");
        recipe_text2.setText(".");
        recipe_text3.setText(".");
        recipe_text4.setText(".");
        recipe_text5.setText(".");
        recipe_text6.setText(".");
        recipe_text7.setText(".");
        recipe_text8.setText(".");
        recipe_text9.setText(".");}
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

        recipe_text1.setText(".");
        recipe_text2.setText(".");
        recipe_text3.setText(".");
        recipe_text4.setText(".");
        recipe_text5.setText(".");
        recipe_text6.setText(".");
        recipe_text7.setText(".");
        recipe_text8.setText(".");
        recipe_text9.setText(".");}
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

        recipe_text1.setText(".");
        recipe_text2.setText(".");
        recipe_text3.setText(".");
        recipe_text4.setText(".");
        recipe_text5.setText(".");
        recipe_text6.setText(".");
        recipe_text7.setText(".");
        recipe_text8.setText(".");
        recipe_text9.setText(".");}
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

        recipe_text1.setText(".");
        recipe_text2.setText(".");
        recipe_text3.setText(".");
        recipe_text4.setText(".");
        recipe_text5.setText(".");
        recipe_text6.setText(".");
        recipe_text7.setText(".");
        recipe_text8.setText(".");
        recipe_text9.setText(".");}

    //조주(동민)
    void recipe_41()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");

        recipe_text1.setText("잔에 그라나딘 시럽 1/2oz 따른다.");
        recipe_text2.setText("크림 드 민트 1/2oz 바스푼 이용해 그라나딘 시럽 위에 띄운다.");
        recipe_text3.setText(" 브랜디 1/2oz 바스푼 이용해 크림 드 민트 위에 띄운다.");
    }
    void recipe_42()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");

        recipe_text1.setText("잔에 얼음 가득 넣고 칠링한다.");
        recipe_text2.setText("믹싱글라스에 얼음 8~10개 넣는다.");
        recipe_text3.setText("믹싱글라스에 버번 위스키 1 1/2oz(1.5oz), 스윗 버무스 3/4oz, 앙고스투라 비터스 1dash 넣는다.");
        recipe_text4.setText("바스푼으로 8~10회 젓는다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 믹싱 글라스에 스트레이너를 끼워 칵테일을 따른다.");
        recipe_text6.setText("체리를 픽에 꽂아 넣는다.");
       }
    void recipe_43()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");

        recipe_text1.setText("잔에 얼음 가득 넣고 칠링한다.");
        recipe_text2.setText("믹싱글라스에 얼음 8~10개 넣는다.");
        recipe_text3.setText("믹싱글라스에 드라이 진 2oz, 드라이 버무스 1/3oz 넣는다.");
        recipe_text4.setText("바스푼으로 8~10회 젓는다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 믹싱 글라스에 스트레이너를 끼워 칵테일을 따른다.");
        recipe_text6.setText("그린 올리브를 픽에 꽂아 넣는다.");
       }
    void recipe_44()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");

        recipe_text1.setText("올드 패션드 글라스에 각설탕 1개를 넣는다.");
        recipe_text2.setText("잔에 앙고스투라 비터스 1dash, 탄산수 1/2oz 넣는다.");
        recipe_text3.setText("바스푼으로 각설탕을 으깨고 휘저어 녹인다.");
        recipe_text4.setText("잔에 얼음 80% 넣는다.");
        recipe_text5.setText("잔에 버번위스키 1 1/2oz(1.5oz) 넣는다.");
        recipe_text6.setText("바스푼으로 8~10회 젓는다.");
        recipe_text7.setText("오렌지 슬라이스와 체리를 픽에 꽂아 잔에 꽂는다.");}
    void recipe_45()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");


        recipe_text1.setText("잔에 얼음 가득 넣고 칠링한다.");
        recipe_text2.setText("쉐이커에 얼음을 8~10개 넣는다.");
        recipe_text3.setText("쉐이커에 브랜디 3/4oz, 크렘드 카카오 B 3/4oz, 우유 3/4oz 넣는다.");
        recipe_text4.setText("스트레이너, 캡 순으로 닫고 8~10회 흔든다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 칵테일을 따른다.");
        recipe_text6.setText("넛메그 파우더를 뿌려준다.");}

    void recipe_46()
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

        recipe_text1.setText("잔에 얼음 80% 넣는다.");
        recipe_text2.setText("쉐이커에 얼음을 8~10개 넣는다.");
        recipe_text3.setText("쉐이커에 드라이 진 1 1/2oz(1.5oz), 레몬주스 1/2oz, 설탕 1t 넣는다.");
        recipe_text4.setText("스트레이너, 캡 순으로 닫고 8~10회 흔든다.");
        recipe_text5.setText("잔에 칵테일을 따른다.");
        recipe_text6.setText("잔의 90%까지 탄산수로 채워준다.");
        recipe_text7.setText("바스푼으로 8~10회 젓는다.");
        recipe_text8.setText("체리 브랜디 1/2oz 바스푼 이용해 넣어준다.");
        recipe_text9.setText("오렌지 슬라이스와 체리를 픽에 꽂아 잔에 꽂는다.");}
    void recipe_47()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");

        recipe_text1.setText("잔에 얼음 80% 넣는다.");
        recipe_text2.setText("잔에 보드카 1oz, 커피리큐르(깔루아) 1/2oz 넣는다.");
        recipe_text3.setText("바스푼으로 8~10회 젓는다.");}
    void recipe_48()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");

        recipe_text1.setText("잔에 얼음 가득 넣고 칠링한다.");
        recipe_text2.setText("쉐이커에 얼음을 8~10개 넣는다.");
        recipe_text3.setText("쉐이커에 데킬라 1 1/2oz(1.5oz), 트리플 섹 1/2oz, 라임주스 1/2oz 넣는다.");
        recipe_text4.setText("스트레이너, 캡 순으로 닫고 8~10회 흔든다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 칵테일을 따른다.");
        recipe_text6.setText("잔 림에 레몬즙을 바르고 소금을 묻힌다.");
        recipe_text7.setText("잔에 칵테일을 따른다.");}
    void recipe_49()
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");

        recipe_text1.setText("잔에 얼음 80% 넣는다.");
        recipe_text2.setText("잔에 스카치 위스키 1oz, 드람뷰이 1/2oz 넣는다.");
        recipe_text3.setText("바스푼으로 8~10회 젓는다.");}
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

        recipe_text1.setText("잔에 얼음 가득 넣고 칠링한다.");
        recipe_text2.setText("쉐이커에 얼음을 8~10개 넣는다.");
        recipe_text3.setText("쉐이커에 버번 위스키 1 1/2oz(1.5oz), 레몬주스 1/2oz, 설탕 1t 넣는다.");
        recipe_text4.setText("스트레이너, 캡 순으로 닫고 8~10회 흔든다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 칵테일을 따른다.");
        recipe_text6.setText("탄산수 1oz 넣는다.");
        recipe_text7.setText("바스푼으로 8~10회 저어준다.");
        recipe_text8.setText("레몬 슬리이스와 체리를 픽에 꽂아 잔에 올린다.");}

}
