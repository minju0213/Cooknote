package com.example.cooknote;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import java.util.Random;

public class Korean_food extends AppCompatActivity {

    TextView tv_original;
    int category, correct;
    AppCompatButton[] btn_option = new AppCompatButton[3];
    //    String[][] arrayOptions = new String[3][10];
    String[][] arrayOptions = new String[10][4];
    // 10개의 문제의 3개의 보기라서 10개의 방을 가진 3개의 배열이 아닌 3개의 방을 가진 10개의 배열로 선언
    String[] arrayBreadQuestion = new String[10];
    int[] arrayCorrectIndex = new int[10];

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.korean_food);
        initActivity();
        setOptions();
        setBreadQuestion();
        setCorrectIndex();
        setNewQuestion();
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
                    setNewQuestion();
                    // setBreadQuestion();은 배열에 값 넣어주는 메소드라 새로운 문제 내주는 코드로 수정
                }
            }, 1500);
        } else {
            btn_option[choose].setText("x");
            btn_option[choose].setTextColor(Color.parseColor("#ffffff"));
            btn_option[choose].setBackgroundResource(R.drawable.study_wrong);
        }
    }

    void setNewQuestion() {
        resetUi(); // ui 초기화

        Random random = new Random();
        int index = random.nextInt(10); // 문제 index
        correct = arrayCorrectIndex[index]; // 정답 자리 index

        tv_original.setText(arrayBreadQuestion[index]);
        btn_option[correct].setText(arrayOptions[index][correct]);
        // 정답 보기 버튼을 index번 문제의 correct번 보기로 표시

        for (int i = 0; i < btn_option.length; i++) {
            if (i != correct) {
                btn_option[i].setText(arrayOptions[index][i]);
                // index번 문제의 1~3번 보기중 랜덤하게 표시되도록 변경
            }
        }
    }

    void resetUi() {
        for (int i = 0; i < btn_option.length; i++) {
            btn_option[i].setBackgroundResource(R.drawable.study_base);
            btn_option[i].setText("");
            btn_option[i].setTextColor(Color.parseColor("#FD9F28"));
            btn_option[i].setClickable(true);

        }
    }

    void initActivity() {
        tv_original = (TextView) findViewById(R.id.tv_original);
        btn_option[0] = (AppCompatButton) findViewById(R.id.btn_option1);
        btn_option[1] = (AppCompatButton) findViewById(R.id.btn_option2);
        btn_option[2] = (AppCompatButton) findViewById(R.id.btn_option3);



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




    void setBreadQuestion() {
        arrayBreadQuestion[0] = "초코쿠기의 반죽은?";
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
        arrayOptions[0][0] = "양진선 바보";
        arrayOptions[0][1] = "토마토 주스";
        arrayOptions[0][2] = "밀가루";

        arrayOptions[1][0] = "ㅎㅎ";
        arrayOptions[1][1] = "2-2 보기";
        arrayOptions[1][2] = "2-3 보기";

        arrayOptions[2][0] = "3-1 보기";
        arrayOptions[2][1] = "3-2 보기";
        arrayOptions[2][2] = "3-3 보기";

        arrayOptions[3][0] = "4-1 보기";
        arrayOptions[3][1] = "4-2 보기";
        arrayOptions[3][2] = "4-3 보기";

        arrayOptions[4][0] = "5-1 보기";
        arrayOptions[4][1] = "5-2 보기";
        arrayOptions[4][2] = "5-3 보기";

        arrayOptions[5][0] = "6-1 보기";
        arrayOptions[5][1] = "6-2 보기";
        arrayOptions[5][2] = "6-3 보기";

        arrayOptions[6][0] = "7-1 보기";
        arrayOptions[6][1] = "7-2 보기";
        arrayOptions[6][2] = "7-3 보기";

        arrayOptions[7][0] = "8-1 보기";
        arrayOptions[7][1] = "8-2 보기";
        arrayOptions[7][2] = "8-3 보기";

        arrayOptions[8][0] = "9-1 보기";
        arrayOptions[8][1] = "9-2 보기";
        arrayOptions[8][2] = "9-3 보기";

        arrayOptions[9][0] = "10-1 보기";
        arrayOptions[9][1] = "10-2 보기";
        arrayOptions[9][2] = "10-3 보기";
        // [~2][~10] -> [~10][~2] 로 변경
    }

    void setCorrectIndex() {
        arrayCorrectIndex[0] = 1;
        arrayCorrectIndex[1] = 0;
        arrayCorrectIndex[2] = 2;
        arrayCorrectIndex[3] = 0;
        arrayCorrectIndex[4] = 1;
        arrayCorrectIndex[5] = 2;
        arrayCorrectIndex[6] = 1;
        arrayCorrectIndex[7] = 1;
        arrayCorrectIndex[8] = 0;
        arrayCorrectIndex[9] = 2;

    }

}
