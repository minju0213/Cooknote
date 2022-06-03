package com.example.cooknote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

public class bread extends AppCompatActivity {


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.bread);
        setOptions();
        setBreadQuestion();

    }



        String[][] arrayOptions = new String[3][10], arrayBreadQuestion = new String[3][10];

        void setBreadQuestion() {
            arrayBreadQuestion[0][0] = "질문1";
            arrayBreadQuestion[0][1] = "질문2";
            arrayBreadQuestion[0][2] = "질문3";
            arrayBreadQuestion[0][3] = "질문4";
            arrayBreadQuestion[0][4] = "질문5";
            arrayBreadQuestion[0][5] = "질문6";
            arrayBreadQuestion[0][6] = "질문7";
            arrayBreadQuestion[0][7] = "질문8";
            arrayBreadQuestion[0][8] = "질문9";
            arrayBreadQuestion[0][9] = "질문10";


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

