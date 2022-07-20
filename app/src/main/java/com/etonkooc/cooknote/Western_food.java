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

public class Western_food extends AppCompatActivity {

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
        setContentView(R.layout.western_food);
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
        arrayBreadQuestion[0] = "‘스파게티 까르보나라’의 농후제로 적절한 것은 무엇인가?";
        arrayBreadQuestion[1] = "‘포테이토 샐러드’ 공정에 대한 설명으로 옳지 않은 것은 무엇인가?";
        arrayBreadQuestion[2] = "다음 중 ‘바베큐 폭찹’의 지급 재료로 옳은 것은 무엇인가?";
        arrayBreadQuestion[3] = "다음 중 ‘살리스버리 스테이크’에 곁들여내는 당근 모양의 명칭은 무엇인가?";
        arrayBreadQuestion[4] = "‘프렌치 어니언 스프’에 사용되는 양파의 조리 형태로 옳은 것은 무엇인가?";
        arrayBreadQuestion[5] = "‘치킨커틀렛’ 조리 과정으로 옳지 않은 것은 무엇인가?";
        arrayBreadQuestion[6] = "‘홀렌다이즈 소스’의 재료로 옳지 않은 것은 무엇인가?";
        arrayBreadQuestion[7] = "다음 중 머랭의 청정 작용을 이용하여 맑게 끓여낸 스프는 무엇인가?";
        arrayBreadQuestion[8] = "다음 중 루를 이용하여 조리하는 품목은 무엇인가?";
        arrayBreadQuestion[9] = "다음 중 ‘치즈 오믈렛’ 조리 과정으로 옳은 것은 무엇인가?";


    }
    void setOptions() {
        arrayOptions[0][0] = "루";
        arrayOptions[0][1] = "노른자";
        arrayOptions[0][2] = "식용유";

        arrayOptions[1][0] = "마요네즈는 감자가 충분히 식었을 때 버무린다.";
        arrayOptions[1][1] = "감자는 사방 1cm 크기의 정육면체로 잘라 익힌다.";
        arrayOptions[1][2] = "양파는 채썰어 소금물에 담가 매운 맛을 제거한다.";

        arrayOptions[2][0] = "백설탕";
        arrayOptions[2][1] = "당근";
        arrayOptions[2][2] = "우스터소스";

        arrayOptions[3][0] = "vichy";
        arrayOptions[3][1] = "concase";
        arrayOptions[3][2] = "batonnet";

        arrayOptions[4][0] = "마리네이드";
        arrayOptions[4][1] = "브루리";
        arrayOptions[4][2] = "콩피";

        arrayOptions[5][0] = "닭고기를 일정한 두께로 저며 펴준 후에 칼등으로 두드려 준다.";
        arrayOptions[5][1] = "딥팻후라이로 조리한다.";
        arrayOptions[5][2] = "닭고기에 붙어있는 껍질은 제거한다.";

        arrayOptions[6][0] = "정제버터";
        arrayOptions[6][1] = "밀가루";
        arrayOptions[6][2] = "양파";

        arrayOptions[7][0] = "프렌치 어니언 스프";
        arrayOptions[7][1] = "비프콘소매";
        arrayOptions[7][2] = "미네스트로니 스프";

        arrayOptions[8][0] = "치킨 알라킹";
        arrayOptions[8][1] = "홀렌다이즈 소스";
        arrayOptions[8][2] = "포테이토 크림 스프";

        arrayOptions[9][0] = "달걀은 잘 풀어 체에 내려준 후 소금을 섞는다.";
        arrayOptions[9][1] = "내부가 완벽하게 익을 수 있도록 충분히 시간을 들인다.";
        arrayOptions[9][2] = "치즈는 반죽과 내부에 나눠 넣는다.";
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

