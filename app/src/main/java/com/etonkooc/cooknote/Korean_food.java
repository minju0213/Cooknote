package com.etonkooc.cooknote;

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
        arrayBreadQuestion[0] = "‘장국죽’ 계량 시 쌀과 물의 비율은 무엇인가?";
        arrayBreadQuestion[1] = "‘풋고추전’ 조리 시 주의해야할 점으로 틀린 것은 무엇인가?";
        arrayBreadQuestion[2] = "‘무생채’ 조리 시 주의해야할 점으로 옳은 것은 무엇인가?";
        arrayBreadQuestion[3] = "‘두부젓국찌개’ 조리 방법으로 옳은 것은 무엇인가?";
        arrayBreadQuestion[4] = "다음 중 ‘생선양념구이’의 생선 손질법으로 틀린 것은 무엇인가?";
        arrayBreadQuestion[5] = "‘무생채’ 양념장 재료로 옳지 않은 것은 무엇인가?";
        arrayBreadQuestion[6] = "‘콩나물밥’ 조리 과정으로 옳지 않은 것은 무엇인가?";
        arrayBreadQuestion[7] = "‘오징어볶음’ 조리 과정으로 옳은 것은?";
        arrayBreadQuestion[8] = "완자탕 조리 시 부위별 소고기 사용 용도로 옳은 것은 무엇인가?";
        arrayBreadQuestion[9] = "재료썰기 시 당근 골패썰기 길이로 알맞은 것은 무엇인가?";


    }
    void setOptions() {
        arrayOptions[0][0] = "쌀 1 : 물 2";
        arrayOptions[0][1] = "쌀 1 : 물 6";
        arrayOptions[0][2] = "쌀 1 : 물 3";

        arrayOptions[1][0] = "고추 안에 밀가루 -> 고기 -> 달걀물 -> 밀가루 순으로 성형 후 굽는다.";
        arrayOptions[1][1] = "고추의 머리부분과 꼬리부분이 잘려선 안 된다.";
        arrayOptions[1][2] = "고추 길이는 5cm로 맞춘다.";

        arrayOptions[2][0] = "색은 고추장으로 조절한다.";
        arrayOptions[2][1] = "진한 빨간색이 나오게 해야한다.";
        arrayOptions[2][2] = "버무리고 나면 삼투압 작용으로 물이 생기므로 버무리기 전 무에 있는 물기를 제거한 후 버무려야 한다.";

        arrayOptions[3][0] = "두부 크기는 3 X 2 X 1cm 이다.";
        arrayOptions[3][1] = "굴을 설탕물에 넣고 해감 한다.";
        arrayOptions[3][2] = "새우젓을 다져 그대로 사용한다.";

        arrayOptions[4][0] = "지느러미와 아가미를 제거한다.";
        arrayOptions[4][1] = "칼 팁으로 비늘을 제거한다.";
        arrayOptions[4][2] = "일정한 간격으로 3~4번 어슷하게 칼집을 넣는다.";

        arrayOptions[5][0] = "생강";
        arrayOptions[5][1] = "깨소금";
        arrayOptions[5][2] = "고추장";

        arrayOptions[6][0] = "고기는 얇게 채썬다.";
        arrayOptions[6][1] = "콩나물은 거두절미한다.";
        arrayOptions[6][2] = "불린 쌀과 동량의 물을 부어 익힌다.";

        arrayOptions[7][0] = "오징어는 손질 후 몸통에 세로로 칼집을 넣어준다.";
        arrayOptions[7][1] = "양념장은 미리 제조한다.";
        arrayOptions[7][2] = "오징어는 부위별로 6cm로 잘라준다.";

        arrayOptions[8][0] = "사태 – 육수용 / 살코기 – 완자용";
        arrayOptions[8][1] = "사태 – 완자용 / 살코기 – 육수용";
        arrayOptions[8][2] = "사태 – 고명용 / 살코기 – 육수, 완자용";

        arrayOptions[9][0] = "5 X 1 X 0.2cm";
        arrayOptions[9][1] = "5 X 1.5 X 0.5cm";
        arrayOptions[9][2] = "5 X 1.5 X 0.2cm";
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
