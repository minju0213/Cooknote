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

public class Drink extends AppCompatActivity {

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
        setContentView(R.layout.drink);
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
        arrayBreadQuestion[0] = "다음 중 ‘싱가폴 슬링’에 들어가지 않는 재료는 무엇인가?";
        arrayBreadQuestion[1] = "다음 중 기법이 다른 하나는 무엇인가?";
        arrayBreadQuestion[2] = "‘마가리타’의 가니쉬로 옳은 것은 무엇인가?";
        arrayBreadQuestion[3] = "다음 중 ‘프레쉬 레몬 스쿼시’에 들어가지 않는 재료는 무엇인가?";
        arrayBreadQuestion[4] = "다음 중 파인애플주스가 들어가지 않는 품목은 무엇인가?";
        arrayBreadQuestion[5] = "‘푸즈카페’의 기주는 무엇인가?";
        arrayBreadQuestion[6] = "다음 중 shake 기법으로 제조하지 않는 품목은 무엇인가?";
        arrayBreadQuestion[7] = "‘B-52’의 글라스로 옳은 것은 무엇인가?";
        arrayBreadQuestion[8] = "‘맨하탄’의 가니쉬로 옳은 것은 무엇인가?";
        arrayBreadQuestion[9] = "다음 중 blend 기법으로 제조하지 않는 품목은 무엇인가?";


    }
    void setOptions() {
        arrayOptions[0][0] = "체리 브랜디";
        arrayOptions[0][1] = "그래나딘 시럽";
        arrayOptions[0][2] = "레몬주스";

        arrayOptions[1][0] = "맨하탄";
        arrayOptions[1][1] = "러스티네일";
        arrayOptions[1][2] = "네그로니";

        arrayOptions[2][0] = "레몬 슬라이스";
        arrayOptions[2][1] = "레몬 웨지";
        arrayOptions[2][2] = "솔트 리밍";

        arrayOptions[3][0] = "라임주스";
        arrayOptions[3][1] = "레몬즙";
        arrayOptions[3][2] = "탄산수";

        arrayOptions[4][0] = "버진 푸르트 펀치";
        arrayOptions[4][1] = "사이드카";
        arrayOptions[4][2] = "마이타이";

        arrayOptions[5][0] = "보드카";
        arrayOptions[5][1] = "럼";
        arrayOptions[5][2] = "브랜디";

        arrayOptions[6][0] = "뉴욕";
        arrayOptions[6][1] = "롱아일랜드 아이스티";
        arrayOptions[6][2] = "바카디";

        arrayOptions[7][0] = "필스너 글라스";
        arrayOptions[7][1] = "셰리 글라스";
        arrayOptions[7][2] = "리큐르 글라스";

        arrayOptions[8][0] = "체리";
        arrayOptions[8][1] = "올리브";
        arrayOptions[8][2] = "레몬 슬라이스";

        arrayOptions[9][0] = "마이타이";
        arrayOptions[9][1] = "블루하와이안";
        arrayOptions[9][2] = "준벅";
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
