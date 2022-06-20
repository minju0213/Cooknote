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

public class Bread extends AppCompatActivity {

    /*
    * 내꺼 코드 베이스로 문제 개수랑 보기개수에 맞게 잘 다듬었네 굿굿
    * 2차원 배열 작은 실수 제외하면 논리적으로는 문제 없게 잘 고쳤어
    * */

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
        setContentView(R.layout.bread);
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
        arrayBreadQuestion[0] = "다음 중 굽기 전 물을 분무해야 하는 품목은 무엇인가?";
        arrayBreadQuestion[1] = "빵도넛의 튀김 기름 온도는 몇 도가 적절한가?";
        arrayBreadQuestion[2] = "다음 중 토핑물 제조에서 크림법 거품 정도의 순서로 알맞은 것은 무엇인가?";
        arrayBreadQuestion[3] = "호밀빵의 반죽 혼합 완료 단계로 알맞은 것은?";
        arrayBreadQuestion[4] = "단팥빵 제조 공정에서 위생상 주의해야 할 부분은 무엇인가?";
        arrayBreadQuestion[5] = "다음 식빵 품목 중 틀 밑에서 2차 발효를 완료해야 하는 품목이 아닌 것은 무엇인가?";
        arrayBreadQuestion[6] = "다음 품목 중 최종 단계 후기에서 반죽 제조를 마무리하는 제품은 무엇인가?";
        arrayBreadQuestion[7] = "그리시니 성형 길이로 올바른 것은 무엇인가?";
        arrayBreadQuestion[8] = "다음 중 1차 발효 완료점을 확인하는 방법으로 올바르지 않은 것은?";
        arrayBreadQuestion[9] = "다음 품목 중 2차 발효 후 물에 데치는 공정을 진행해야 하는 품목은 무엇인가?";


    }
    void setOptions() {
        arrayOptions[0][0] = "호밀빵";
        arrayOptions[0][1] = "풀먼식빵";
        arrayOptions[0][2] = "단팥빵";

        arrayOptions[1][0] = "160~175℃";
        arrayOptions[1][1] = "175~185℃";
        arrayOptions[1][2] = "185~195℃";

        arrayOptions[2][0] = "소보루 < 밤식빵 < 모카빵";
        arrayOptions[2][1] = "모카빵 < 밤식빵 < 소보루";
        arrayOptions[2][2] = "소보루 < 모카빵 < 밤식빵";

        arrayOptions[3][0] = "발전 단계";
        arrayOptions[3][1] = "최종 단계";
        arrayOptions[3][2] = "렛다운 단계";

        arrayOptions[4][0] = "앙금을 분할 후 맨손으로 둥글리기 해선 안된다.";
        arrayOptions[4][1] = "팽이 사용 후 물로 설거지해야 한다.";
        arrayOptions[4][2] = "앙금이 묻은 헤라를 작업대에 내려놓으면 안 된다.";

        arrayOptions[5][0] = "풀먼식빵";
        arrayOptions[5][1] = "밤식빵";
        arrayOptions[5][2] = "우유식빵";

        arrayOptions[6][0] = "비상식빵";
        arrayOptions[6][1] = "스위트롤";
        arrayOptions[6][2] = "그리시니";

        arrayOptions[7][0] = "25-30cm";
        arrayOptions[7][1] = "35-40cm";
        arrayOptions[7][2] = "45-50cm";

        arrayOptions[8][0] = "반죽의 부피가 약 2배 정도 늘어나고 망사 그물 구조(거미줄)가 생겼는지 확인한다.";
        arrayOptions[8][1] = "핑거 테스트를 진행한다.";
        arrayOptions[8][2] = "반죽의 향과 색감을 보고 확인한다.";

        arrayOptions[9][0] = "빵도넛";
        arrayOptions[9][1] = "베이글";
        arrayOptions[9][2] = "더치빵";
        // [~2][~10] -> [~10][~2] 로 변경
    }

    void setCorrectIndex() {
        arrayCorrectIndex[0] = 0;
        arrayCorrectIndex[1] = 1;
        arrayCorrectIndex[2] = 2;
        arrayCorrectIndex[3] = 0;
        arrayCorrectIndex[4] = 2;
        arrayCorrectIndex[5] = 2;
        arrayCorrectIndex[6] = 0;
        arrayCorrectIndex[7] = 1;
        arrayCorrectIndex[8] = 2;
        arrayCorrectIndex[9] = 1;

    }

}

