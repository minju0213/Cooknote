package com.example.cooknote;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //기능사 시험 날짜 보러가기 버튼 클릭시 액티비티 전환
        ImageButton DateGo_bt = (ImageButton) findViewById(R.id.DateGO_bt);
        //종목별 문제 풀기 버튼 클릭시 액티비티 전환
        ImageButton Question_bt = (ImageButton) findViewById(R.id.Question_bt);
        //종목별 레시피 보기 버튼 클릭시 액티비티 전환
        ImageButton Recipe_bt = (ImageButton) findViewById(R.id.Recipe_bt);

        //종목별 레시피 보기 버튼 클릭시 액티비티 전환
        Recipe_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Recipe.class);
                startActivity(intent);
            }
        });

        //종목별 문제 풀기 버튼 클릭시 액티비티 전환
        Question_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Question.class);
                startActivity(intent);
            }
        });

        //기능사 시험 날짜 보러가기 버튼 클릭시 액티비티 전환
        DateGo_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), Date_go.class);
                startActivity(intent);
            }
        });



    }
    // id:onButton 눌렀을 때 자격증 사이트로 연결
    public void onButton(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.q-net.or.kr/man001.do?imYn=Y&gSite=Q"));
        startActivity(intent);
    }




}
