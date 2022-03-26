package com.example.cooknote;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.net.Uri;





public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


    }
    // id:onButton 눌렀을 때 자격증 사이트로 연결
    public void onButton(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("http://www.q-net.or.kr/man001.do?imYn=Y&gSite=Q"));
        startActivity(intent);
    }


}
