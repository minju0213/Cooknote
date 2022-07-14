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
        } else if (category.equals("소프트롤 케이크")){
            recipe_14();
        } else if (category.equals("마드레느")) {
            recipe_15();
        } else if (category.equals("쇼트브레드 쿠키")){
            recipe_16();
        } else if (category.equals("슈")){
            recipe_17();
        } else if (category.equals("브라우니")) {
            recipe_18();
        } else if (category.equals("과일 케이크")){
            recipe_19();
        } else if (category.equals("파운드 케이크")){
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
    void recipe_11() //초코머핀
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

        recipe_text1.setText("버터를 부드럽게 풀어준다.");
        recipe_text2.setText("설탕, 소금을 넣어 크림상태로 만든다.");
        recipe_text3.setText("달걀을 한 알 또는 두 알씩 넣어 100% 용해 된 부드러운 크림을 만든다.");
        recipe_text4.setText("믹싱 도중 벽에 붙어 있는 반죽들도 잘 섞일 수 있도록 벽면을 자주 긁어주며(스크래핑) 매끄러운 크림 상태로 만든다.");
        recipe_text5.setText("채 친 가루를 넣어 고무주걱으로 위에서 아래로 털어내듯 혼합한다.");
        recipe_text6.setText("가루 80% 혼합 시, 물을 혼합한다.");
        recipe_text7.setText("초코칩을 혼합한다.");
        recipe_text8.setText("머핀컵 속에 속지를 깔고 깍지 없는 \n짤주머니에 반죽을 넣어 70% 팬닝한다.");
        recipe_text9.setText("윗불 180℃, 아랫불 160℃에서 25분 전후로 굽기를 한다. 손으로 두드려 봤을 때 탄력이 느껴지면 굽기 완료이다.");}
    void recipe_12() //버터 스펀지 케이크
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

        recipe_text1.setText("노른자를 거품기로 풀어준 후, 설탕A, 소금을 넣고 믹싱한다.");
        recipe_text2.setText("흰자는 믹서 볼에 넣어 60% 휘핑 후, \n설탕B를 3회 가량 나누어 투입하며 \n중간 피크상태의 머랭(80~90%)을 \n제조한다.");
        recipe_text3.setText("머랭 1/2~1/3을 노른자 반죽에 넣어 주걱으로 위 아래로 저어주며 80% 혼합한다.");
        recipe_text4.setText("체질한 가루 재료를 넣고, 고무주걱을 이용하여 위에서 아래로 털어주듯 혼합한다.");
        recipe_text5.setText("일부 반죽을 중탕한 버터에 넣어 혼합한 수, 다시 본반죽에 넣어 혼합한다.");
        recipe_text6.setText("나머지 머랭을 넣어 가볍게 혼합한다.");
        recipe_text7.setText("3호 원형팬 4개에 50~60% 팬닝한다.");
        recipe_text8.setText("고무주걱으로 윗면을 평평하게 정리한 후, 펀칭하여 일정한 기포를 형성하게 한다.");
        recipe_text9.setText("윗불 180℃, 아랫불 160℃에서 30분 전후로 굽기를 한다.");}
    void recipe_13() //젤리롤 케이크
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

        recipe_text1.setText("스텐볼에 달걀을 풀어준 후, 설탕과 \n소금을 넣고 거품기로 혼합하여 \n따뜻한 물을 받쳐 중탕으로 설탕을 녹인다.");
        recipe_text2.setText("믹서볼에 옮겨 고속으로 휘핑한다.");
        recipe_text3.setText("저속으로 30초 정도 돌려 기공을 안정화 시킨다.");
        recipe_text4.setText("작업대로 가져와 체질한 가루 재료를 \n넣고, 손 또는 스크래퍼 및 고무주걱을 이용하여 위에서 아래로 털어주듯 혼합한다.");
        recipe_text5.setText("우유를 가볍게 혼합한다.");
        recipe_text6.setText("비중 측정한 반죽은 작은 스텐볼에 옮겨 캐러멜 색소를 넣어 진한 갈색을 \n만든다.");
        recipe_text7.setText("비중을 맞춘 반죽은 평철판에 부어 고무주걱 및 스크래퍼로 윗면을 평평하게 정리한 후, 작업대 위에서 펀칭을 하여 일정한 기포를 형성하게 한다.");
        recipe_text8.setText("비닐 짤주머니 또는 위생지로 만든 짤주머니에 무늬 반죽을 담아 앞 부분을 0.5cm로 자른 후, 3cm 간격으로 짜준다.");
        recipe_text9.setText("젓가락레 또는 온도계 끝을 이용하여 \n4cm간격을 만든다.");
        recipe_text10.setText("윗불 180℃,아랫불 160℃에서 25분 \n전후로 굽기를 한다.");
        recipe_text11.setText("굽는 동안, 물에 적신 면포 또는 기름칠한 유산지, 긴 밀대, 잼과 스크래퍼, 분무기를 준비한다.");
        recipe_text12.setText("다 구워진 반죽은 펀칭하여 수분을 날린 후, 틀에서 즉시 제거하여 냉각팬으로 옮겨 살짝 식혀준다.");
        recipe_text13.setText("반죽을 뒤집어 물분무를 하여 유산지를 제거하고, 말기 시작하는 앞부분에 말기 편할 수 있도록 스크래퍼로 두 줄 정도 1cm간격으로 눌러준다.");
        recipe_text14.setText("잼을 올려 고무주걱 또는 스크래퍼 및 스패튤라로 스크래퍼 두 줄 낸 자리를 제외하고 골고루 바른다.");
        recipe_text15.setText("긴 밀대를 이용하여 앞부분을 살짝 \n눌러준 후 말기를 하고, 말기가 끝나면 잠시 동안 고정해 둔다.");
        recipe_text16.setText("면보 또는 유산지를 제거한다.");
        recipe_text17.setText("냉각팬에 위생지를 깔고, 제출한다.");}

    void recipe_14() //소프트롤 케이크
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


        recipe_text1.setText("노른자를 거품기로 풀어준 후, 설탕A, 소금, 물엿을 넣고 믹싱한다. 마지막으로 물을 혼합한다.");
        recipe_text2.setText("흰자는 믹서 볼에 넣어 60% 휘핑 후, \n설탕B를 3회 가량 나누어 투입하여 중간 피크 상태의 머랭(80~90%)을 제조한다.");
        recipe_text3.setText("머랭 1/2~1/3을 노른자 반죽에 넣어 주걱으로 위 아래로 저어주며 80% 혼합한다.");
        recipe_text4.setText("체질한 가루 재료를 넣고, 고무주걱을 이용하여 위에서 아래로 털어주듯 혼합한다.");
        recipe_text5.setText("일부 반죽을 식용유에 넣어 혼합한 후, 다시 본반죽에 넣어 혼합한다.");
        recipe_text6.setText("나머지 머랭을 넣어 가볍게 혼합한다.");
        recipe_text7.setText("비중 측정한 반죽은 작은 스텐볼에 옮겨 캐러멜 색소를 넣어 진한 갈색을 만든다.");
        recipe_text8.setText("비중을 맞춘 반죽은 평철판에 부어 고무주걱으로 윗면을 평평하게 정리한 후, 펀칭 하여 일정한 기포를 형성하게 \n한다.");
        recipe_text9.setText("비닐 짤주머니 또는 위생지로 만든 짤주머니에 무늬 반죽을 담아 앞 부분을 0.5cm로 자른 후, 3cm 간격으로 짜준다.");
        recipe_text10.setText("젓가락 또는 온도계 끝을 이용하여 4cm간격을 만든다.");
        recipe_text11.setText("윗불 180℃, 아랫불 160℃에서 25분 전후로 굽기를 한다.");
        recipe_text12.setText("굽는 동안, 물에 적신 면포 또는 기름칠한 유산지, 긴 밀대, 잼과 스크래퍼, 분무기를 준비한다.");
        recipe_text13.setText("다 구워진 반죽은 펀칭하여 수분을 날린 후, 틀에서 즉시 제거하여 냉각팬으로 옮겨 살짝 식혀준다.");
        recipe_text14.setText("반죽을 뒤집어 물분무를 하여 유산지를 제거하고, 말기 시작하는 앞부분에 말기 편할 수 있도록 스크래퍼로 두 줄 정도 1cm간격으로 눌러준다.");
        recipe_text15.setText("잼을 올려 고무주걱 또는 스크래퍼 및 스패튤라로 스크래퍼 두 줄 낸 자리를 제외하고 골고루 바른다.");
        recipe_text16.setText("긴 밀대를 이용하여 앞부분을 살짝 눌러준 후 말기를 하고, 말기가 끝나면 잠시 동안 고정해 둔다.");
        recipe_text17.setText("면보 또는 유산지를 제거한다 18.냉각팬에 위생지를 깔고, 제출한다.");}
    void recipe_15() //마드레느
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");


        recipe_text1.setText("체 친 가루재료에 설탕, 소금을 넣고 \n거품기로 혼합한다.");
        recipe_text2.setText("달걀은 거품이 생기지 않도록 풀어준 후, 가루재료에 투입하여 매끈해질 \n때까지 혼합한다.");
        recipe_text3.setText("다진 레몬껍질을 넣고 섞어준다.");
        recipe_text4.setText("미리 중탕한 버터를 넣는다.");
        recipe_text5.setText("반죽을 비닐 또는 랩을 씌워 실온에서 30분 전후로 휴지시킨다.");
        recipe_text6.setText("휴지시키는 동안, 마드레느 팬에 녹인 쇼트닝 또는 버터를 붓으로 바른다.");
        recipe_text7.setText("휴지가 다 된 반죽은 농도가 되직해지며, 주걱으로 한 번 저어준 후, 짤주머니에 담아 팬닝한다.");
        recipe_text8.setText("윗불 180℃, 아랫불 160℃ 15분 전후로 굽기를 한다 9.냉각팬에 위생지를 깔고 구운 제품을 털어 조개 모양이 앞으로 보이게 하여 제출한다.");}

    void recipe_16() //쇼트브레드 쿠키
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

        recipe_text1.setText("마가린과 쇼트닝을 부드럽게 풀어준다.");
        recipe_text2.setText("설탕, 소금, 물엿을 넣어 크림상태로 \n만든다.");
        recipe_text3.setText("달걀과 노른자는 합친 후, 풀어주고 일정한 양을 투입하고 믹싱하여 설탕 입자가 60% 용해된 부드러운 크림을 만든다.");
        recipe_text4.setText("믹싱 도중에 벽에 붙어있는 반죽들도 잘 섞일 수 있도록 벽면을 자주 긁어주며(스크래핑) 매끄러운 크림 상태로 \n만든다.");
        recipe_text5.setText("체 친 가루를 넣어 주걱으로 자르듯이 일자 혼합한다.");
        recipe_text6.setText("한 덩이가 된 반죽은 비닐에 감싸 납작하게 만들어 냉장고에서 20~30분 \n휴지시킨다.");
        recipe_text7.setText("덧가루 없이 치대어 밀어펴기 좋은 상태로 만든 후, 두께 0.7~0.8cm로 밀어펴고, 지급된 원형 커터로 자투리를 최소화하여 찍어낸 후, 일정한 간격에 \n맞추어 팬닝한다.");
        recipe_text8.setText("알끈을 제거한 노른자를 준비하여 붓으로 한 번 바르고, 살짝 마르면 한 번 더 발라 선명한 노란색을 만든다.");
        recipe_text9.setText("노른자가 너무 많으면 살짝 말린 후, \n포크 무늬를 낸다.");
        recipe_text10.setText("윗불 200℃, 아랫불 150℃에서 10분 전후로 굽기를 한다.");
        recipe_text11.setText("냉각팬 위에 위생지를 깔고, 제출한다.");}
    void recipe_17() //슈
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");

        recipe_text1.setText("스텐볼에 버터, 물, 소금을 넣고 팔팔 끓인다.");
        recipe_text2.setText("불을 끈 상태에서 체 친 중력분을 넣고 거품기로 저어 혼합한 후, 다시 불 위에서 호화시킨다.");
        recipe_text3.setText("처음엔 되직한 느낌이 들다가 물고구마처럼 살짝 부드러워진 느낌이 들면 호화는 끝난다.");
        recipe_text4.setText("달걀을 나누어 투입하여 농도를 \n조절한다.");
        recipe_text5.setText("1cm 원형 깍지를 끼운 짤주머니에 반죽을 담아 두께 1cm, 직경 3cm의 원형으로 간격을 잘 맞추어 팬닝한다.");
        recipe_text6.setText("분무기를 이용하여 물을 충분히 \n뿌려준다.");
        recipe_text7.setText("윗불 160℃, 아랫불 180℃에서 굽다가 8~12분쯤에 윗면에 수분이 날아가고, 촉촉한 느낌이 사라지면 윗불 180℃, 아랫불 160℃로 바꾸어 총 30분 전후로 굽기를 한다.");
        recipe_text8.setText("냉각 후, 슈의 아랫면에 나무젓가락으로 지금 0.5cm로 구멍을 낸다. 9.0.5cm 원형 깍지를 끼운 짤주머니에 커스터드 \n크림을 담아 구멍낸 부분으로 넣는다.");}
    void recipe_18() //브라우니
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

        recipe_text1.setText("호두분태는 평철판에 펼쳐 예열된 \n오븐에 8분 전후로 굽기를 한다.");
        recipe_text2.setText("버터와 다크초콜릿은 함께 \n중탕한다(50℃ 이하, 30~35℃까지 식히기).");
        recipe_text3.setText("달걀은 스텐볼에 넣고 풀어준 후, 설탕과 소금을 넣고 거품기로 혼합하여 중탕시키며 설탕을 녹여준다.");
        recipe_text4.setText("달걀 볼에 버터와 함께 용해한 초콜릿을 서서히 부으며 거품기로 혼합한다.");
        recipe_text5.setText("체 친 가루재료를 넣고 주걱 및 거품기로 가볍게 \n혼합한다.");
        recipe_text6.setText("미리 구워 놓은 호두 분태 1/2를 혼합한다.");
        recipe_text7.setText("원형 팬 2개에 일정하게 팬닝하여 고무주걱으로 윗면을 평평하게 만든 후, \n남은 호두 분태를 골고루 뿌려준다.");
        recipe_text8.setText("윗불 170℃, 아랫불 160℃에서 30분 전후로 굽기를 한다.");
        recipe_text9.setText("냉각팬 위에 위생지를 깔고 제출한다.");}
    void recipe_19() //과일 케이크
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

        recipe_text1.setText("마가린을 부드럽게 풀어준다.");
        recipe_text2.setText("설탕(50%), 소금을 넣어 크림상태로 \n만든다.");
        recipe_text3.setText("노른자를 2~3회 나누어 투입하여 \n100% 용해 된 부드러운 크림을 만든다.");
        recipe_text4.setText("흰자는 60% 휘핑 후, 설탕(50%)를 3회 가량 나누어 투입하여 중간피크(80~90%)상태의 머랭을 제조한다.");
        recipe_text5.setText("머랭 1/2~1/3을 노른자 반죽에 넣어 \n주걱으로 80% 혼합한다.");
        recipe_text6.setText("체 친 가루재료를 넣어 고무주걱으로 위아래로 저으며 혼합하고, 80% 혼합 \n되었을 때, 우유를 넣고 혼합한다.");
        recipe_text7.setText("전처리한 과일들과 럼주를 모두 넣어 혼합하고, 나머지 머랭을 다 넣고 \n혼합하여 마무리 한다.");
        recipe_text8.setText("틀에 70% 팬닝한다.");
        recipe_text9.setText("파운드 틀일 경우에는 고무주걱으로 \n가운데 U자모양을 만들어 준다.");
        recipe_text10.setText("윗불 180℃, 아랫불 160℃에서 35분 \n전후로 굽기를 한다.");}
    void recipe_20() //파운드 케이크
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


        recipe_text1.setText("버터를 부드럽게 풀어준다.");
        recipe_text2.setText("설탕, 소금, 유화제를 넣어 크림상태로 만든다.");
        recipe_text3.setText("달걀을 한 알 또는 두 알씩 넣어 \n100% 용해 된 부드러운 크림을 \n만든다.");
        recipe_text4.setText("믹싱 도중 벽에 붙어 있는 반죽들도 잘 섞일 수 있도록 벽면을 자주 긁어주며(스크래핑) 매끄러운 크림 상태로 \n만든다.");
        recipe_text5.setText("체 친 가루를 넣어 고무주걱으로 위에서 아래로 털어내듯 혼합한다.");
        recipe_text6.setText("주걱 두 개를 사용하여 팬닝하거나, 짤주머니에 반죽을 담아 70% 팬닝한다.");
        recipe_text7.setText("고무주걱을 이용하여 가운데 U자 모양을 만든다.");
        recipe_text8.setText("윗불 190℃, 아랫불 170℃에서 윗면이 연갈색이 날 때까지 구운 후, 조심스럽게 꺼내어 윗면에 스패튤라를 이용하여 가운데를 일자로 톱질하듯이 자르고, \n윗불 170℃, 아랫불 170℃로 바꾸어 총 35~40분간 굽는다.");
        recipe_text9.setText("펀칭하여 수분을 날린 후 틀에서 즉시 제거하고, 냉각팬 위에 유산지를 깔고 제출한다.");}

    // 양식
    void recipe_21() //쉬림프카나페
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

        recipe_text1.setText("냄비에 달걀과 달걀이 물에 잠길 정도의 물을 담아 소금 1t 넣고 강불에 15분 \n이상 삶는다.");
        recipe_text2.setText("달걀을 삶는 동안 재료를 전처리한다.\n식빵 / 새우 / 파슬리 (물에 담가서 보관) / 그 외 재료 등으로 구분");
        recipe_text3.setText("빵 모서리 잘라내고 지름 4cm 원형으로 다듬는다.");
        recipe_text4.setText("양파, 당근, 샐러리를 얇게 채 \n썰어준다.");
        recipe_text5.setText("레몬을 길게 반으로 잘라 반은 즙을 \n내고 반은 새우를 삶을 떄 사용한다.");
        recipe_text6.setText("케찹 1t, 레몬즙 1/3t, 소금 1/6t, 흰후추가루 1/6t 섞어 소스를 만들어 준다.");
        recipe_text7.setText("파슬리는 줄기와 잎을 분리해 잎은 \n장식용, 줄기는 4cm 크기로 잘라준다.");
        recipe_text8.setText("새우는 머리를 제거하고 안쪽의 내장을 제거해준다.");
        recipe_text9.setText("삶은 계란을 찬물에 담가 식혀준 후 껍질을 제거한다.");
        recipe_text10.setText("냄비에 물 3C 넣고 미르포아 재료와 \n레몬, 파슬리 줄기 넣고 강불에 \n끓인다.");
        recipe_text11.setText("파슬리 잎은 조금씩 떼어 장식용으로 \n4개 만든다.");
        recipe_text12.setText("달걀 반으로 잘라 0.5cm 두께로 포 떠준다. (4개 모두 노른자가 있어야 함)");
        recipe_text13.setText("새우는 크기에 따라 1분 30초~ 2분 정도 삶는다. (삶은 후 찬물에 헹구지 않음)");
        recipe_text14.setText("빵을 약불에 굽는다.");
        recipe_text15.setText("새우 껍질을 제거한다.");
        recipe_text16.setText("새우 양 끝 1cm씩 남기고 등쪽부터 칼집 넣어주고 양쪽으로 벌려 세울 수 있게 모양 잡아준다.");
        recipe_text17.setText("빵 한면에 버터를 발라주고, 그 위에 계란, 새우, 케찹, 파슬리 순으로 \n올려준다.");
        recipe_text18.setText("플레이팅 후 제출한다.");}
    void recipe_22() //스페니쉬오믈렛
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

        recipe_text1.setText("물을 끓이면서 재료를 전처리한다.\n달걀 / 베이컨 / 그 외 재료 등으로 구분");
        recipe_text2.setText("양파를 사방 0.5cm 크기로 자른다.");
        recipe_text3.setText("피망 두꺼운 심 제거 후 사방 0.5cm \n크기로 자른다.");
        recipe_text4.setText("양송이 밑단과 겉껍질 제거 후 사방 0.5cm 크기로 자른다.");
        recipe_text5.setText("물 끓기 시작하면 소금 1/3t 넣고 \n토마토 15초간 데쳐 찬물에 헹군 뒤 \n수분 제거한다.");
        recipe_text6.setText("데친 토마토 껍질, 꼭지, 씨를 제거하고 사방 0.5cm 크기로 자른다.");
        recipe_text7.setText("베이컨 사방 0.5cm 크기로 자른다.");
        recipe_text8.setText("달걀을 풀어 체에 내린다.");
        recipe_text9.setText("달걀에 소금 1t, 생크림 1T 넣고 잘 \n섞은 뒤 다시 체에 내린다.");
        recipe_text10.setText("팬에 식용유를 두르고 코팅한다.");
        recipe_text11.setText("베이컨, 양파, 피망, 양송이, 토마토 순으로 약 15초씩 볶는다.");
        recipe_text12.setText("재료들이 반투명하게 볶아지면 케찹 \n1T 넣고 약불에 볶는다.");
        recipe_text13.setText("소가 덩어리지면 소금, 후추 간을 하고 그릇에 담아둔다.");
        recipe_text14.setText("오믈렛 팬에 버터 1t, 식용유 1t 넣고 코팅한다.");
        recipe_text15.setText("달걀 넣고 약불에서 최대한 많이 \n스크램블 해준다.");
        recipe_text16.setText("스크램블이 완성되면 팬을 바닥에 \n쳐 기포를 제거한다.");
        recipe_text17.setText("오믈렛 소를 넣고 달걀 바닥을 충분히 익혀준다.");
        recipe_text18.setText("최대한 약불에서 팬을 기울여가며 타원형 모양의 오믈렛을 완성한다.");
        recipe_text19.setText("모양을 잡으면 뒤집고 달걀 아랫면을 익혀준다.");
        recipe_text20.setText("플레이팅 후 제출한다.");}
    void recipe_23() //치즈오믈렛
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

        recipe_text1.setText("재료를 전처리한다.\n달걀 / 치즈 / 그 외 재료 등으로 구분");
        recipe_text2.setText("치즈 포장지를 벗기지 않은 상태에서 \n사방 0.5cm 크기로 자른 후 포장지를 \n뜯어 치즈가 덩어리 지지 않게 뜯어준다.");
        recipe_text3.setText("달걀을 풀어 체에 내린다.");
        recipe_text4.setText("달걀에 소금 1t, 생크림 1T 넣고 잘 \n섞는다.");
        recipe_text5.setText("달걀에 치즈 1/3 정도 넣고 섞는다.");
        recipe_text6.setText("오믈렛 팬에 버터 1t, 식용유 1t 넣고 코팅한다.");
        recipe_text7.setText("달걀 넣고 약불에서 최대한 많이 \n스크램블 해준다.");
        recipe_text8.setText("스크램블이 완성되면 팬을 바닥에 쳐 \n기포를 제거한다.");
        recipe_text9.setText("남은 치즈를 올리고 달걀 바닥을 충분히 익혀준다.");
        recipe_text10.setText("최대한 약불에서 팬을 기울여가며 \n타원형 모양의 오믈렛을 완성한다.");
        recipe_text11.setText("모양을 잡으면 뒤집고 달걀 아랫면을 익혀준다.");
        recipe_text12.setText("플레이팅 후 제출한다.");}
    void recipe_24() //월도프샐러드
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

        recipe_text1.setText("재료를 전처리한다.\n양상추 (물에 담가서 보관) / 호두 (뜨거운 물에 담가서 보관) / 사과 (레몬물에 담가서 보관) / 그 외 재료 등으로 구분");
        recipe_text2.setText("레몬 즙을 짠다.");
        recipe_text3.setText("사과를 사방 1cm 크기로 자르고,레몬물을 만들어 갈변을 방지한다.");
        recipe_text4.setText("샐러리를 사방 1cm 크기로 자른다.");
        recipe_text5.setText("불린 호두는 수분을 제거한 후 속껍질을 제거한다.");
        recipe_text6.setText("호두를 사방 1cm 크기로 자르고 남은 \n호두는 다져준다.");
        recipe_text7.setText("사과 수분 제거한다.");
        recipe_text8.setText("마요네즈 2T, 소금 1/6t, 흰후추가루 \n조금, 레몬즙 1t 섞어 소스를 만든다.");
        recipe_text9.setText("볼에 사과, 샐러리, 호두알을 넣은 뒤 소스를 조금씩 넣어가며 버무린다.");
        recipe_text10.setText("양상추 수분 제거 후 완성 접시에 \n깔아준 뒤 샐러드를 담아준다.");
        recipe_text11.setText("완성 그릇에 월도프샐러드 담고 위에 다진 호두를 장식하여 플레이팅 후 \n제출한다.");}
    void recipe_25() //포테이토샐러드
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");
        number_text_8.setText("8. ");

        recipe_text1.setText("물을 끓이면서 재료를 전처리한다.\n감자 (물에 담가서 보관) / 파슬리 (뜨거운 물에 담가서 보관) / \n양파 (소금물에 담가서 보관) / 그 외 재료 등으로 구분");
        recipe_text2.setText("감자를 사방 1cm 크기로 자른다.");
        recipe_text3.setText("양파를 다진 후 소금물에 담가 매운맛을 제거한다.");
        recipe_text4.setText("파슬리 잎 부분을 다지고 면보에 감싸 물에 행군 뒤 수분을 제거한다.");
        recipe_text5.setText("물이 끓으면 소금을 넣고 감자를 3~4분 정도 삶는다.");
        recipe_text6.setText("감자가 익으면 체에 걸러 식혀준다.");
        recipe_text7.setText("양파를 면보에 감싸 물로 헹군 후 수분을 제거한다.");
        recipe_text8.setText("삶은 감자, 다진 양파, 파슬리 1/3t, 마요네즈 1T, 소금 1/6t, 흰후추가루 조금 넣고 버무려 플레이팅 후 제출한다.");}
    void recipe_26() //BLT샌드위치
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

        recipe_text1.setText("재료를 전처리한다.\n빵 / 베이컨 / 양배추 (물에 담가서 보관) / 그 외 재료 등으로 구분");
        recipe_text2.setText("토마토를 0.5cm 두께로 썰어주고, 1개는 1/2 조각 내준다.");
        recipe_text3.setText("토마토를 키친타올에 올려 소금 간 \n해준다.");
        recipe_text4.setText("베이컨을 반으로 잘라주고 후추 간 \n해준다.");
        recipe_text5.setText("빵을 약불에 굽고 바람이 잘 통하게 \n보관한다.");
        recipe_text6.setText("베이컨을 약불에 굽는다.");
        recipe_text7.setText("토마토, 베이컨, 양상추 수분을 제거한다.");
        recipe_text8.setText("식빵에 마요네즈를 바른다. (두 장은 \n한 면에, 한 장은 양면에 발라주기)");
        recipe_text9.setText("빵 - 양상추 - 베이컨 - 빵 - 양상추 - 토마토 - 빵 순으로 쌓는다.");
        recipe_text10.setText("빵 모서리를 잘라내고, 삼각형으로 \n4등분 낸다.");
        recipe_text11.setText("플레이팅 후 제출한다.");}
    void recipe_27() //햄버거샌드위치
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

        recipe_text1.setText("재료를 전처리한다.\n햄버거 번 / 소고기 / 달걀 / 양상추 (물에 담가서 보관) \n/ 그 외 재료 등으로 구분");
        recipe_text2.setText("햄버거 번에 버터를 발라 굽는다.");
        recipe_text3.setText("양파를 0.5cm 두께로 1개 썰어준 후 소금을 뿌려 수분을 제거하고, 남은 \n양파는 다져 수분을 제거한다.");
        recipe_text4.setText("토마토를 0.5cm 두께로 1개 썰어준 후 소금을 뿌려 수분을 제거한다.");
        recipe_text5.setText("샐러리를 섬유질 제거한 후 다져준다.");
        recipe_text6.setText("빵을 바람이 잘 통하게 보관한다.");
        recipe_text7.setText("소고기 기름 부분을 제거하고 다져준다.");
        recipe_text8.setText("중불에 양파, 샐러리를 각각 볶아 \n수분을 날려준다.");
        recipe_text9.setText("달걀을 풀어준다.");
        recipe_text10.setText("다진 소고기, 양파 2T, 샐러리 1T, 소금 1/6t, 후추가루 조금, 달걀물 1T, 빵가루 2T 넣고 섞어 패티를 반죽한다.");
        recipe_text11.setText("패티를 0.7cm 두께에 지름은 햄버거 번보다 0.7cm정도 더 큰 원형모양으로 성형한다. \n(패티 반죽 전량 사용하지 않아도 됨)");
        recipe_text12.setText("팬을 강불에 달군 뒤 중불에 양파 한 면당 15~20초간 굽는다.");
        recipe_text13.setText("팬에 기름을 두르고 중불에 달군 뒤 \n패티 한 면당 1분~1분 20초간 굽는다.");
        recipe_text14.setText("양상추 수분을 제거한다.");
        recipe_text15.setText("햄버거 번에 남은 버터를 발라준다.");
        recipe_text16.setText("양상추 수분을 제거한 후 햄버거 번 \n크기에 맞춰 손으로 뜯어준다.");
        recipe_text17.setText("빵 - 양상추 - 패티 - 양파 - 토마토 - 빵 순으로 쌓는다.");
        recipe_text18.setText("플레이팅 후 제출한다.");}
    void recipe_28() //브라운스톡
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

        recipe_text1.setText("물을 끓이면서 재료를 전처리한다.\n소뼈 (물에 담가서 보관) / 건재료 \n/ 그 외 재료 등으로 구분");
        recipe_text2.setText("양파, 당근, 샐러리를 채 썰어준다.");
        recipe_text3.setText("토마토에 + 칼집을 내주고 끓는 물에 \n15초 정도 데쳐준 후 찬물에 헹구며 \n껍질을 벗겨준다.");
        recipe_text4.setText("소뼈를 끓는 물에 2~3분 정도 데쳐준다.");
        recipe_text5.setText("토마토 꼭지와 씨를 제거하고 다져준다.");
        recipe_text6.setText("소뼈 핏물, 기름 등을 제거하며 찬물에 씻겨준다.");
        recipe_text7.setText("소뼈에 최대한 뼈만 남을 수 있게 뼈에 붙어있는 두꺼운 기름과 살코기를 제거한다.");
        recipe_text8.setText("다시백에 타임, 파슬리 줄기, 월계수잎, 정향, 통후추 넣는다.");
        recipe_text9.setText("팬에 식용유 1t 두르고 소뼈를 굽는다.");
        recipe_text10.setText("구워진 소뼈 기름을 제거한다.");
        recipe_text11.setText("팬에 버터 소량을 넣고 녹인다.");
        recipe_text12.setText("양파를 갈색이 나도록 볶아준다.");
        recipe_text13.setText("바닥에 갈색이 나면 물을 1T씩 \n부어가며 볶는다.");
        recipe_text14.setText("양파가 진한 갈색이 나면 샐러리와 \n당근을 넣고 볶는다.");
        recipe_text15.setText("충분히 볶아지면 소뼈를 넣고 살짝 \n볶아준다.");
        recipe_text16.setText("물 2.5~3C, 토마토, 세사데피스 넣고 강불에서 \n끓인다.");
        recipe_text17.setText("스톡이 끓으면 중간중간 올라오는 거품을 제거해가며 약불에서 5분 정도 끓인다.");
        recipe_text18.setText("다 끓인 스톡을 체와 면보에 걸러준다.");
        recipe_text19.setText("200ml 이상 계량하여 플레이팅 후 제출한다.");}
    void recipe_29() //이탈리안미트소스
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

        recipe_text1.setText("재료를 전처리한다.\n소고기 / 파슬리 (물에 담가서 보관) \n/ 건재료 / 그 외 재료 등으로 구분");
        recipe_text2.setText("마늘, 양파, 샐러리(섬유질 제거)를 \n다진다.");
        recipe_text3.setText("홀 토마토 꼭지 제거 후 다진다.");
        recipe_text4.setText("파슬리 잎 부분을 다지고 면보에 감싸 물에 행군 뒤 수분을 제거한다.");
        recipe_text5.setText("소고기를 다진다. (시간 부족하면 생략 가능)");
        recipe_text6.setText("냄비에 버터 1t 넣고 녹인다.");
        recipe_text7.setText("약불에서 마늘을 10초 정도 \n볶는다.");
        recipe_text8.setText("마늘 향이 올라오면 소고기를 넣고 볶는다.");
        recipe_text9.setText("소고기가 반정도 익으면 양파, 샐러리를 넣고 강불에 약 30초 정도 볶는다.");
        recipe_text10.setText("다진 토마토를 넣고 볶는다.");
        recipe_text11.setText("토마토페이스트를 크게 1T 정도 넣고 볶는다.");
        recipe_text12.setText("물 300ml, 월계수잎 넣고 강불에 끓인다.");
        recipe_text13.setText("소스가 끓으면 중간중간 올라오는 거품을 제거해가며 중약불에서 4~5분간 \n끓인다.");
        recipe_text14.setText("소금, 후추 간을 한다.");
        recipe_text15.setText("월계수잎을 제거하고 150ml 이상 계량하여 플레이팅 후 제출한다.");}
    void recipe_30() //홀렌다이즈소스
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

        recipe_text1.setText("물을 끓이면서 재료를 전처리한다.\n달걀 / 건재료 / 그 외 재료 등으로 구분");
        recipe_text2.setText("버터를 중탕한다. (중탕 후 중탕물 버리지 말고 나중에 다시 사용하기)");
        recipe_text3.setText("양파를 채 썰어준다.");
        recipe_text4.setText("파슬리 줄기 부분만 잘라 준비한다.");
        recipe_text5.setText("레몬 즙을 짠다.");
        recipe_text6.setText("양파, 파슬리 줄기, 월계수잎, 통후추, 식초 20ml, 물 50ml, 레몬즙을 넣고 \n끓여 허브에센스를 만든다.");
        recipe_text7.setText("허브에센스를 면보에 걸러준다.");
        recipe_text8.setText("달걀 노른자 2개를 분리하고 알끈을 \n제거한다.");
        recipe_text9.setText("허브에센스 2t 넣고 따뜻한 물(버터 중탕물 사용) 위에서 휘핑기로 섞는다.");
        recipe_text10.setText("중탕버터를 조금씩 넣으며 섞는다.");
        recipe_text11.setText("농도가 되직해지면 허브에센스를 조금씩 넣어가며 농도를 풀어준다.");
        recipe_text12.setText("소금, 흰후추가루로 간을 한다.");
        recipe_text13.setText("100ml 이상 계량하여 플레이팅 후 제출한다.");}

    // 한식
    void recipe_31() //비빔밥
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

        recipe_text1.setText("재료를 전처리한다.\n쌀 (물에 불려 보관) / 소고기 / 달걀 / 건다시마 / 그 외 재료 등으로 \n구분");
        recipe_text2.setText("물을 끓인다.");
        recipe_text3.setText("대파, 마늘을 다진다.");
        recipe_text4.setText("청포묵 껍질을 제거하고 5 X 0.5 X 0.5cm 크기로 잘라준다.");
        recipe_text5.setText("끓는 물에 소금을 넣고 청포묵이 투명해질 때까지 데치고 찬물에 헹군 후 소금 1/6t, 참기름 1/3t 넣고 간을 한다.");
        recipe_text6.setText("밥을 짓는다.\n불려둔 쌀 씻기 -> 냄비에 쌀 1C, 물 1C 계량해 밥 앉히기 -> 강불에 2~3분 끓이기 -> 끓으면 중불에 5~6분 두기 -> 타닥타닥 소리 나면 약불에 1~2분 \n뜸 들이기 -> 불 끄고 5분 뜸 들이기");
        recipe_text7.setText("애호박을 돌려깎아 5 X 0.3 X 0.3cm \n크기로 채 썰고 소금에 절인다.");
        recipe_text8.setText("도라지를 5cm 길이로 자르고 두꺼운 \n부분은 2~3등분 하여 소금에 절인다.");
        recipe_text9.setText("고사리를 5cm 길이로 자른다.");
        recipe_text10.setText("간장 2t, 설탕 1t, 대파, 마늘, 깨 \n(부숴서) 조금, 후추가루 조금, 참기름 1/3t 섞어 양념을 만든다.");
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
    void recipe_32() //콩나물밥
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
    void recipe_33() //장국죽
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
        recipe_text4.setText("소고기 기름 부분을 제거하고 다져준 후 대파, 마늘, 간장 1t, 깨 (부숴서) \n조금, 후추가루 조금, 참기름 1/3t 넣고 간을 한다.");
        recipe_text5.setText("불려둔 쌀을 씻은 후 쌀 1/2C 계량하고 면보에 감싸 밀대로 빻는다.");
        recipe_text6.setText("계량컵으로 물 3C (쌀 6배) 따로 \n계량한다.");
        recipe_text7.setText("냄비에 참기름 1/3t 넣고 표고버섯, \n소고기를 볶는다.");
        recipe_text8.setText("소고기가 반 정도 익으면 쌀을 넣고 \n함께 볶는다.");
        recipe_text9.setText("물을 조금씩 넣어가며 볶고, 어느정도 죽의 형태가 잡히면 남은 물의 반을 넣고 중간중간 올라오는 거품을 제거해가며 끓인다.");
        recipe_text10.setText("다시 죽의 형태가 나올 정도로 졸아들면 남은 물을 모두 넣고 중약불로 끓인다.");
        recipe_text11.setText("쌀알이 잘 퍼졌을 때 국간장 1t 넣고 간을 한다.");
        recipe_text12.setText("표고버섯이 위에 잘 보이게 올려 \n플레이팅 후 제출한다.");}
    void recipe_34() //완자탕
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

        recipe_text1.setText("재료를 전처리한다.\n: 소고기 (살코기, 사태부위) / 달걀 / 그 외 재료 등으로 구분");
        recipe_text2.setText("물 4C, 소고기 사태부위, 마늘 1개, 대파 심 넣고 육수를 끓인다.");
        recipe_text3.setText("대파, 마늘을 다진다.");
        recipe_text4.setText("두부 껍질을 제거한 후 면포에 짜 수분을 제거하고 칼로 눌러 으깬다.");
        recipe_text5.setText("육수를 면포에 거른 후 소금 1/3t, \n국간장 1t 넣고 간을 한다.");
        recipe_text6.setText("소고기 기름 부분을 제거하고 최대한 \n곱게 다져준다.");
        recipe_text7.setText("달걀 황/백을 분리하고 각각 소금 간을 한다.");
        recipe_text8.setText("팬에 식용유 1t 두르고 코팅한 후 황/백 지단을 작게 부친다.");
        recipe_text9.setText("남은 달걀 노른자에 흰자 1T 넣고 \n섞는다.");
        recipe_text10.setText("소고기3 : 두부1 비율에 대파, 마늘, 소금 1/3t, 설탕 1/2t, 후추가루 조금, 깨 (부숴서) 조금, 참기름 1/3t 넣고 완자 반죽을 만든다.");
        recipe_text11.setText("완자 반죽을 지름 3cm 원형으로 6개 \n만든다.");
        recipe_text12.setText("완자에 밀가루를 묻히고 체에 받쳐 \n털어준다.");
        recipe_text13.setText("완자에 달걀물 얇게 입혀 팬에 \n초벌구이 한다.");
        recipe_text14.setText("완자가 충분히 익으면 키친타올에 올려 기름을 제거한다.");
        recipe_text15.setText("냄비에 육수를 넣고 다시 끓인다.");
        recipe_text16.setText("지단은 마름모로 2개씩 자른다.");
        recipe_text17.setText("육수가 끓으면 완자를 넣고 완자가 \n떠오를 때까지 끓인다.");
        recipe_text18.setText("중간중간 올라오는 거품을 제거한다.");
        recipe_text19.setText("200ml 이상 계량하고 황/백 지단을 넣어 플레이팅 후 제출한다.");}
    void recipe_35() //생선찌개
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

        recipe_text1.setText("재료를 전처리한다.\n: 생선 / 쑥갓 (찬물에 담가서 보관) / 그 외 재료 등으로 구분");
        recipe_text2.setText("마늘, 생강을 다진다.");
        recipe_text3.setText("무, 두부를 2.5 X 3.5 X 0.8cm 크기로 자른다.");
        recipe_text4.setText("애호박을 반달모양 0.5cm 두께로 \n썰어준다.");
        recipe_text5.setText("실파, 쑥갓 줄기를 4cm 길이로 자른다.");
        recipe_text6.setText("청고추, 홍고추를 3 X 0.5cm 크기로 \n어슷 썰고 씨를 제거한다.");
        recipe_text7.setText("생선을 손질한다.\n: 칼등으로 비늘 제거 -> 가위로 지느러미 제거 -> 아가미 손으로 뜯어 제거 -> 세척 후 주둥이, 머리 자르기 -> 세척 및 내장, 검은 막, 핏덩어리 제거 -> 몸통 4~5cm 길이로 토막내기 ->  세척 및 검은 막, 핏덩이 제거 -> 찬 물에 담가 보관");
        recipe_text8.setText("냄비에 물 4C 넣고 끓인다.");
        recipe_text9.setText("체에 고추장 2T, 고춧가루 1T 넣고 풀어준 후 무, 마늘, 소금 1t 넣고 끓인다.");
        recipe_text10.setText("끓으면 생선을 넣는다. (알(곤이), 정소(이리)는 상태 좋은 경우만 사용, \n내장이 터져있던 생선의 경우 폐기)");
        recipe_text11.setText("생선 살이 살짝 익으면 생강, 두부, 애호박을 넣는다.");
        recipe_text12.setText("중간중간 올라오는 거품을 제거한다.");
        recipe_text13.setText("약 5분 정도 끓인 후 청고추, 홍고추, 실파, 쑥갓 줄기를 넣고 15초 정도 \n끓인다.");
        recipe_text14.setText("완성 그릇에 담고 쑥갓 잎을 국물에 살짝 적셔 가운데 꽂아 플레이팅 후 제출한다. (쑥갓 잎 생략 가능)");}
    void recipe_36() //두부젓국찌개
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

        recipe_text1.setText("재료를 전처리한다.\n: 생굴 / 그 외 재료 등으로 구분");
        recipe_text2.setText("굴에 소금을 넣고 가볍게 2~3회 씻어 해감한 후 소금물에 담가서 보관한다.");
        recipe_text3.setText("마늘을 다진다.");
        recipe_text4.setText("두부를 3 X 2 X 1cm 크기로 자른다.");
        recipe_text5.setText("실파를 3cm 길이로 자른다.");
        recipe_text6.setText("홍고추를 반 갈라 씨를 제거하고 3 X 0.3cm 크기로 썰어준다.");
        recipe_text7.setText("새우젓을 다지고 면포에 걸러 즙만 준비한다. (지급받은 새우젓에 즙이 많으면 생략 가능)");
        recipe_text8.setText("해감한 굴을 세척후 체에 받쳐 수분을 제거한다.");
        recipe_text9.setText("냄비에 물 2C, 소금 1/3t, 새우젓 1t, 마늘 넣고 끓인다.");
        recipe_text10.setText("물이 끓으면 두부 - 굴 - 홍고추, 실파를 1분 간격으로 넣고, 중간중간 올라오는 거품을 제거한다.");
        recipe_text11.setText("모든 재료 넣고 약 10초 뒤 불을 끄고 참기름 1/6t 넣는다.");
        recipe_text12.setText("200ml 이상 계량하여 플레이팅 후 제출한다.");}
    void recipe_37() //제육구이
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

        recipe_text1.setText("재료를 전처리한다.\n" +
                ": 소고기 / 그 외 재료 등으로 구분");
        recipe_text2.setText("대파, 마늘, 생강을 다진다.");
        recipe_text3.setText("그릇에 물 1T를 담고 다진 생강을 면보에 감싼 후 물에 묻히고 짜서 즙을 낸다. (생략 가능)");
        recipe_text4.setText("생강즙 1t, 고추장 3T, 대파, 마늘, 설탕 1/2T, 간장 1t, 깨 (부숴서) 조금, 후추가루 조금, 참기름 1/3t (다진생강 넣을 경우 1t) 넣고 양념장을 만든다.");
        recipe_text5.setText("돼지고기를 6 X 5 X 0.3cm 크기로 포 \n뜨고 칼등으로 두들겨 연육작업 해준다.");
        recipe_text6.setText("돼지고기에 양념장을 바르고 5분 이상 재워준다.");
        recipe_text7.setText("석쇠를 강불에 살짝 달구고 식용유로 \n코팅한다.");
        recipe_text8.setText("석쇠에 돼지고기를 올려 주먹 하나 들어갈 정도 높이에서 석쇠를 돌려가며 강불에 앞뒤로 구워준다.");
        recipe_text9.setText("양념장을 덧발라 1분 정도 2차 구이를 한다. (생략 가능)");
        recipe_text10.setText("플레이팅 후 제출한다.");}
    void recipe_38() //너비아니구이
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

        recipe_text1.setText("재료를 전처리한다.\n: 소고기 / 잣 / 배 (설탕물에 담가서 보관) / 그 외 재료 등으로 구분");
        recipe_text2.setText("대파, 마늘을 다진다.");
        recipe_text3.setText("배를 갈아서 면포에 걸러 즙을 만든다.");
        recipe_text4.setText("잣을 키친타올로 감싸서 밀대로 밀어 가루로 만든다.");
        recipe_text5.setText("소고기를 6 X 5 X 0.3cm로 포 뜨고 칼등으로 두들겨 연육작업 해준다.");
        recipe_text6.setText("배즙 1T, 간장 2T, 설탕 1T, 깨 (부숴서) 조금, 참기름 1/3t, 대파, 마늘 \n넣고 양념장을 만든다.");
        recipe_text7.setText("소고기에 양념장을 바르고 5분 이상 \n재워준다.");
        recipe_text8.setText("석쇠를 강불 살짝 달구고 식용유로 코팅한다.");
        recipe_text9.setText("석쇠에 소고기를 올려 주먹 하나 들어갈 정도 높이에서 석쇠를 돌려가며 강불에 앞뒤로 구워준다.");
        recipe_text10.setText("양념장을 덧발라 1분 정도 2차 구이를 한다. (생략 가능)");
        recipe_text11.setText("완성 접시에 담고 잣가루를 뿌려 \n플레이팅 후 제출한다.");}
    void recipe_39() //더덕구이
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

        recipe_text1.setText("재료를 전처리한다.\n: 더덕 (소금물에 담가서 보관) / 그 외 재료 등으로 구분");
        recipe_text2.setText("더덕 껍질을 제거하고 길이 5~7cm, 두께 2~3등분 하여 일정하게 맞춰 자른 후 더덕이 잠길 정도의 물과 소금 1T 넣고 \n절인다.");
        recipe_text3.setText("대파, 마늘을 다진다.");
        recipe_text4.setText("참기름 1t, 간장 1/3t 넣고 유장 양념을 만든다. (참기름3 : 간장1 비율)");
        recipe_text5.setText("대파, 마늘, 고추장 1T, 설탕 1T, 소금 1/6t, 깨 (부숴서) 조금, 간장 1t, 참기름 1t 넣고 고추장 양념을 만든다.");
        recipe_text6.setText("더덕이 잘 절여지면 찬물로 헹구고 밀대로 밀어준다.");
        recipe_text7.setText("더덕에 유장 양념을 바른다.");
        recipe_text8.setText("석쇠를 강불에 살짝 달구고 식용유로 \n코팅한다.");
        recipe_text9.setText("석쇠에 더덕을 올려 주먹 하나 들어갈 정도 높이에서 석쇠를 돌려가며 \n중약불에 2~3분 초벌구이 한다.");
        recipe_text10.setText("초벌한 더덕에 고추장양념을 발라 약불에서 1분 정도 더 구워준다.");
        recipe_text11.setText("껍질 쪽이 위로 향하게 하여 플레이팅 후 제출한다.");}
    void recipe_40() //생선양념구이
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

        recipe_text1.setText("재료를 전처리한다.\n: 생선 / 그 외 재료 등으로 구분");
        recipe_text2.setText("대파, 마늘을 다진다.");
        recipe_text3.setText("참기름 2/3t, 간장 1/6t 넣고 유장 양념을 만든다.");
        recipe_text4.setText("대파, 마늘, 고추장 2T, 간장 1t, 설탕 1t, 깨 (부숴서) 조금, 후추가루 조금, 참기름 1/3t 넣고 양념장을 만든다.");
        recipe_text5.setText("생선을 손질한다.\n" +
                ": 칼등으로 비늘 제거 -> 가위로 지느러미 제거 -> 아가미 손으로 뜯어 제거 -> 세척 및 내장 제거 -> 꼬리 지느러미 V자로 손질 -> 일정한 간격으로 3~4번 어슷하게 칼집 넣기 -> 소금 1t 뿌려 \n절이기");
        recipe_text6.setText("절인 생선을 물로 헹구고 수분을 제거한 후 유장 양념을 바른다.");
        recipe_text7.setText("석쇠를 강불에 살짝 달구고 식용유로 \n코팅한다.");
        recipe_text8.setText("석쇠에 생선을 올려 주먹 하나 들어갈 정도 높이에서 석쇠를 돌려가며 강불에 90% 익을 때까지 초벌구이 한다.");
        recipe_text9.setText("초벌한 생선에 고추장 양념을 발라 약불에서 1분 정도 더 구워준다.");
        recipe_text10.setText("머리가 왼쪽으로 가게 하여 플레이팅 후 제출한다.");}

    //조주(동민)
    void recipe_41() //Pousse Cafe (푸스 카페)
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");

        recipe_text1.setText("잔에 그라나딘 시럽 1/2oz 따른다.");
        recipe_text2.setText("크림 드 민트 1/2oz 바스푼 이용해 \n그라나딘 시럽 위에 띄운다.");
        recipe_text3.setText(" 브랜디 1/2oz 바스푼 이용해 크림 \n드 민트 위에 띄운다.");
    }
    void recipe_42() //Manhattan (맨하탄)
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");

        recipe_text1.setText("잔에 얼음 가득 넣고 칠링한다.");
        recipe_text2.setText("믹싱글라스에 얼음 8~10개 넣는다.");
        recipe_text3.setText("믹싱글라스에 버번 위스키 1 1/2oz(1.5oz), 스윗 버무스 3/4oz, \n앙고스투라 비터스 1dash 넣는다.");
        recipe_text4.setText("바스푼으로 8~10회 젓는다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 믹싱 글라스에 스트레이너를 끼워 칵테일을 따른다.");
        recipe_text6.setText("체리를 픽에 꽂아 넣는다.");
       }
    void recipe_43() //Dry Martini (드라이 마티니)
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");

        recipe_text1.setText("잔에 얼음 가득 넣고 칠링한다.");
        recipe_text2.setText("믹싱글라스에 얼음 8~10개 넣는다.");
        recipe_text3.setText("믹싱글라스에 드라이 진 2oz, 드라이 \n버무스 1/3oz 넣는다.");
        recipe_text4.setText("바스푼으로 8~10회 젓는다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 믹싱 글라스에 스트레이너를 끼워 칵테일을 따른다.");
        recipe_text6.setText("그린 올리브를 픽에 꽂아 넣는다.");
       }
    void recipe_44() //Old Fashioned (올드 패션드)
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");
        number_text_4.setText("4. ");
        number_text_5.setText("5. ");
        number_text_6.setText("6. ");
        number_text_7.setText("7. ");

        recipe_text1.setText("올드 패션드 글라스에 각설탕 1개를 \n넣는다.");
        recipe_text2.setText("잔에 앙고스투라 비터스 1dash, 탄산수 1/2oz 넣는다.");
        recipe_text3.setText("바스푼으로 각설탕을 으깨고 휘저어 \n녹인다.");
        recipe_text4.setText("잔에 얼음 80% 넣는다.");
        recipe_text5.setText("잔에 버번위스키 1 1/2oz(1.5oz) \n넣는다.");
        recipe_text6.setText("바스푼으로 8~10회 젓는다.");
        recipe_text7.setText("오렌지 슬라이스와 체리를 픽에 꽂아 \n잔에 꽂는다.");}
    void recipe_45() //Brandy Alexander (브랜디 알렉산더)
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
        recipe_text4.setText("스트레이너, 캡 순으로 닫고 8~10회 \n흔든다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 \n칵테일을 따른다.");
        recipe_text6.setText("넛메그 파우더를 뿌려준다.");}

    void recipe_46() //Singapore Sling (싱가폴 슬링)
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
        recipe_text3.setText("쉐이커에 드라이 진 1 1/2oz(1.5oz), \n레몬주스 1/2oz, 설탕 1t 넣는다.");
        recipe_text4.setText("스트레이너, 캡 순으로 닫고 8~10회 \n흔든다.");
        recipe_text5.setText("잔에 칵테일을 따른다.");
        recipe_text6.setText("잔의 90%까지 탄산수로 채워준다.");
        recipe_text7.setText("바스푼으로 8~10회 젓는다.");
        recipe_text8.setText("체리 브랜디 1/2oz 바스푼 이용해 넣어준다.");
        recipe_text9.setText("오렌지 슬라이스와 체리를 픽에 꽂아 \n잔에 꽂는다.");}
    void recipe_47() //Black Russian (블랙 러시안)
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");

        recipe_text1.setText("잔에 얼음 80% 넣는다.");
        recipe_text2.setText("잔에 보드카 1oz, 커피리큐르(깔루아) 1/2oz 넣는다.");
        recipe_text3.setText("바스푼으로 8~10회 젓는다.");}
    void recipe_48() //Margarita (마가리타)
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
        recipe_text4.setText("스트레이너, 캡 순으로 닫고 8~10회 \n흔든다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 칵테일을 따른다.");
        recipe_text6.setText("잔 림에 레몬즙을 바르고 소금을 \n묻힌다.");
        recipe_text7.setText("잔에 칵테일을 따른다.");}
    void recipe_49() //Rusty Nail (러스티 네일)
    {
        number_text_1.setText("1. ");
        number_text_2.setText("2. ");
        number_text_3.setText("3. ");

        recipe_text1.setText("잔에 얼음 80% 넣는다.");
        recipe_text2.setText("잔에 스카치 위스키 1oz, 드람뷰이 1/2oz 넣는다.");
        recipe_text3.setText("바스푼으로 8~10회 젓는다.");}
    void recipe_50() //Whiskey Sour (위스키 사워)
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
        recipe_text4.setText("스트레이너, 캡 순으로 닫고 8~10회 \n흔든다.");
        recipe_text5.setText("잔에 있는 칠링용 얼음을 버리고 \n칵테일을 따른다.");
        recipe_text6.setText("탄산수 1oz 넣는다.");
        recipe_text7.setText("바스푼으로 8~10회 저어준다.");
        recipe_text8.setText("레몬 슬리이스와 체리를 픽에 꽂아 \n잔에 올린다.");}

}
