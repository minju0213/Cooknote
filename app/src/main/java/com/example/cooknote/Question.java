package com.example.cooknote;

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

        //종목별 문제 풀기-제빵 버튼을 누를 시 엑티비티 전환
        ImageButton bread_bt = (ImageButton) findViewById(R.id.bread_bt);

        bread_bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), bread.class);
                startActivity(intent);
            }
        });
    }
}
