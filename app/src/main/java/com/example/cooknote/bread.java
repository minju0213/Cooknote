package com.example.cooknote;

import androidx.appcompat.widget.AppCompatButton;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import java.util.Random;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bread extends AppCompatActivity {

    TextView tv_original;
    int category, correct;
    AppCompatButton[] btn_option = new AppCompatButton[3];
    String[][] arrayOptions = new String[3][10];
    String[] arrayBreadQuestion = new String[10];


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bread);

        setOptions();
        setBreadQuestion();


    }

    void chooseOption(int choose) {
        if (choose == correct) { // 정답을 맞췄을 경우
            btn_option[choose].setText("o");
            btn_option[choose].setTextColor(Color.parseColor("#ffffff"));
            btn_option[choose].setBackgroundResource(R.drawable.study_correct);

            for (int i = 0; i < btn_option.length; i++) {
                btn_option[i].setClickable(false);
            }

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    setBreadQuestion();
                }
            }, 1500);
        } else {
            btn_option[choose].setText("x");
            btn_option[choose].setTextColor(Color.parseColor("#ffffff"));
            btn_option[choose].setBackgroundResource(R.drawable.study_wrong);
        }
    }

    void setBreadQuestion() {
        resetUi(); // ui 초기화

        Random random = new Random();
        int index = random.nextInt(10); // 일본어 index
        correct = random.nextInt(3); // 정답 자리 index

        tv_original.setText(arrayBreadQuestion[index]);
        btn_option[correct].setText(arrayOptions[index][index]);

        for (int i = 0; i < btn_option.length; i++) {
            if (i != correct) {
                btn_option[i].setText(arrayOptions[index][random.nextInt(10)]);
            }
        }
    }

    void resetUi() {
        for (int i = 0; i < btn_option.length; i++) {
            btn_option[i].setBackgroundResource(R.drawable.study_base);
            btn_option[i].setText("");
            btn_option[i].setTextColor(Color.parseColor("#B8E6E1"));
            btn_option[i].setClickable(true);

        }
    }

    void initActivity() {
        tv_original = (TextView) findViewById(R.id.tv_original);
        btn_option[0] = (AppCompatButton) findViewById(R.id.btn_option1);
        btn_option[1] = (AppCompatButton) findViewById(R.id.btn_option2);
        btn_option[2] = (AppCompatButton) findViewById(R.id.btn_option3);

        Intent intent = getIntent();
        category = intent.getIntExtra("category", 1);
        if (category == 1) {
            setOptions();
        } else {
            finish();
        }

        for (int i = 0; i < btn_option.length; i++) {
            int finalI = i;
            btn_option[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    chooseOption(finalI);
                }
            });
        }
    }




    void setArrayOptions() {
        arrayBreadQuestion[0] = "질문1";
        arrayBreadQuestion[1] = "질문2";
        arrayBreadQuestion[2] = "질문3";
        arrayBreadQuestion[3] = "질문4";
        arrayBreadQuestion[4] = "질문5";
        arrayBreadQuestion[5] = "질문6";
        arrayBreadQuestion[6] = "질문7";
        arrayBreadQuestion[7] = "질문8";
        arrayBreadQuestion[8] = "질문9";
        arrayBreadQuestion[9] = "질문10";


    }
    void setOptions() {
        arrayOptions[0][0] = "1-1 보기";
        arrayOptions[1][0] = "1-2 보기";
        arrayOptions[2][0] = "1-3 보기";

        arrayOptions[0][1] = "2-1 보기";
        arrayOptions[1][1] = "2-2 보기";
        arrayOptions[2][1] = "2-3 보기";

        arrayOptions[0][2] = "3-1 보기";
        arrayOptions[1][2] = "3-2 보기";
        arrayOptions[2][2] = "3-3 보기";

        arrayOptions[0][3] = "4-1 보기";
        arrayOptions[1][3] = "4-2 보기";
        arrayOptions[2][3] = "4-3 보기";

        arrayOptions[0][4] = "5-1 보기";
        arrayOptions[1][4] = "5-2 보기";
        arrayOptions[2][4] = "5-3 보기";

        arrayOptions[0][5] = "6-1 보기";
        arrayOptions[1][5] = "6-2 보기";
        arrayOptions[2][5] = "6-3 보기";

        arrayOptions[0][6] = "7-1 보기";
        arrayOptions[1][6] = "7-2 보기";
        arrayOptions[2][6] = "7-3 보기";

        arrayOptions[0][7] = "8-1 보기";
        arrayOptions[1][7] = "8-2 보기";
        arrayOptions[2][7] = "8-3 보기";

        arrayOptions[0][8] = "9-1 보기";
        arrayOptions[1][8] = "9-2 보기";
        arrayOptions[2][8] = "9-3 보기";

        arrayOptions[0][9] = "10-1 보기";
        arrayOptions[1][9] = "10-2 보기";
        arrayOptions[2][9] = "10-3 보기";

    }

}

