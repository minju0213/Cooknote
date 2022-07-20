package com.etonkooc.cooknote;

import androidx.appcompat.widget.AppCompatButton;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class Cookie extends AppCompatActivity {

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
        setContentView(R.layout.cookie);
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
        arrayBreadQuestion[0] = "‘마들렌’ 제조 반죽법은 무엇인가?";
        arrayBreadQuestion[1] = "롤케이크 중 바깥면이 안 쪽으로 오게 하여 말기를 하는 품목은 무엇인가?";
        arrayBreadQuestion[2] = "다음 중 비중이 가장 높은 품목은 무엇인가?";
        arrayBreadQuestion[3] = "블렌딩법이 아닌 품목은 무엇인가?";
        arrayBreadQuestion[4] = "‘슈‘를 만들 때 주의해야 하는 사항으로 옳지 않은 것은 무엇인가?";
        arrayBreadQuestion[5] = "‘치즈케이크’의 적정 비중치는?";
        arrayBreadQuestion[6] = "다음 품목 중 비중을 측정하지 않는 제품은 무엇인가?";
        arrayBreadQuestion[7] = "다음 중 ‘파운드케이크’ 제조 공정 중 옳지 않은 것은?";
        arrayBreadQuestion[8] = "다음 중 ‘초코롤케이크’ 제조 공정 중 옳지 않은 것은?";
        arrayBreadQuestion[9] = "‘타르트‘ 제조 시 포크로 바닥에 구멍을 내는 이유로 알맞은 것은?";


    }
    void setOptions() {
        arrayOptions[0][0] = "크림법";
        arrayOptions[0][1] = "1단계법(변형)";
        arrayOptions[0][2] = "공립법";

        arrayOptions[1][0] = "초코롤케이크 ";
        arrayOptions[1][1] = "젤리롤케이크 ";
        arrayOptions[1][2] = "소프트롤케이크 ";

        arrayOptions[2][0] = "시퐁케이크";
        arrayOptions[2][1] = "치즈케이크";
        arrayOptions[2][2] = "파운드케이크 ";

        arrayOptions[3][0] = "타르트";
        arrayOptions[3][1] = "사과파이";
        arrayOptions[3][2] = "호두파이";

        arrayOptions[4][0] = "물을 충분히 분무해 주거나 침지 시켜야 한다.";
        arrayOptions[4][1] = "호화작업은 재료가 섞이고 나면 끝낸다.";
        arrayOptions[4][2] = "약 15분 정도 지나기 전까진 오븐을 열면 안 된다.";

        arrayOptions[5][0] = "0.4~0.5";
        arrayOptions[5][1] = "0.6~0.7";
        arrayOptions[5][2] = "0.7~0.8";

        arrayOptions[6][0] = "과일케이크";
        arrayOptions[6][1] = "초코롤케이크";
        arrayOptions[6][2] = "시퐁케이크";

        arrayOptions[7][0] = "크림법으로 제조하며 달걀과 버터가 분리되지 않도록 한다.";
        arrayOptions[7][1] = "반죽 팬닝 후 평평하게 만들어 굽는다.";
        arrayOptions[7][2] = "비중은 0.8~0.9로 맞춘다.";

        arrayOptions[8][0] = "다 구워진 반죽은 틀에서 즉시 제거 후 바로 가나슈를 바르고 말아준다.";
        arrayOptions[8][1] = "공립법으로 제조한다.";
        arrayOptions[8][2] = "말기가 끝난 후 잠시 고정해 둔다.";

        arrayOptions[9][0] = "아몬드 반죽이 평평해지도록 한다.";
        arrayOptions[9][1] = "밑면에 색이 더 잘 나도록 한다.";
        arrayOptions[9][2] = "공기 층이 모여 바닥이 파이지 않도록 한다.";
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

