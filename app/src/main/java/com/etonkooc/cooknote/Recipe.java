package com.etonkooc.cooknote;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Recipe extends AppCompatActivity {

    Button btn[] = new Button[51];
    Button btn_bread,btn_cookie,btn_western_food,btn_drink,btn_korean_food;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.recipe);
        init();
        set_make_bread();
        setBtn1();
        setBtn2();
        setBtn3();
        setBtn4();
        setBtn5();
        setBtn6();
        setBtn7();
        setBtn8();
        setBtn9();
        setBtn10();

        setBtn11();
        setBtn12();
        setBtn13();
        setBtn14();
        setBtn15();
        setBtn16();
        setBtn17();
        setBtn18();
        setBtn19();
        setBtn20();

        setBtn21();
        setBtn22();
        setBtn23();
        setBtn24();
        setBtn25();
        setBtn26();
        setBtn27();
        setBtn28();
        setBtn29();
        setBtn30();

        setBtn31();
        setBtn32();
        setBtn33();
        setBtn34();
        setBtn35();
        setBtn36();
        setBtn37();
        setBtn38();
        setBtn39();
        setBtn40();

        setBtn41();
        setBtn42();
        setBtn43();
        setBtn44();
        setBtn45();
        setBtn46();
        setBtn47();
        setBtn48();
        setBtn49();
        setBtn50();


// Bread
        btn_bread.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_make_bread();



            }
        });

// Cookie
        btn_cookie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               set_make_cookie();


            }
        });
// Western_food
        btn_western_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               set_make_western_food();


            }
        });
// Korean_food
        btn_korean_food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               set_make_korean_food();


            }
        });
// Drink
       btn_drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                set_make_drink();


            }
        });


    }
    void setBtn1() {
        btn[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("빵도넛");
            }
        });
    }

    void setBtn2() {
        btn[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("소세지빵");
            }
        });
    }

    void setBtn3() {
        btn[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("식빵");
            }
        });
    }

    void setBtn4() {
        btn[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("단팥빵");
            }
        });
    }

    void setBtn5() {
        btn[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("그리시니");
            }
        });
    }

    void setBtn6() {
        btn[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("밤식빵");
            }
        });
    }

    void setBtn7() {
        btn[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("베이글");
            }
        });
    }

    void setBtn8() {
        btn[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("스위트롤");
            }
        });
    }

    void setBtn9() {
        btn[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("우유식빵");
            }
        });
    }

    void setBtn10() {
        btn[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("크림빵");
            }
        });
    }


    //제과
    void setBtn11() {
        btn[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("초코머핀");
            }
        });
    }

    void setBtn12() {
        btn[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("버터스펀지 케이크");
            }
        });
    }

    void setBtn13() {
        btn[12].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("젤리롤 케이크");
            }
        });
    }

    void setBtn14() {
        btn[13].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("소프트롤 케이크");
            }
        });
    }

    void setBtn15() {
        btn[14].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("마드레느");
            }
        });
    }

    void setBtn16() {
        btn[15].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("쇼트브레드 쿠키");
            }
        });
    }

    void setBtn17() {
        btn[16].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("슈");
            }
        });
    }

    void setBtn18() {
        btn[17].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("브라우니");
            }
        });
    }

    void setBtn19() {
        btn[18].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("과일 케이크");
            }
        });
    }

    void setBtn20() {
        btn[19].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("파운드 케이크");
            }
        });
    }

    // 양식
    void setBtn21() {
        btn[20].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("쉬림프 카나페");
            }
        });
    }

    void setBtn22() {
        btn[21].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("스페니쉬 오믈렛");
            }
        });
    }

    void setBtn23() {
        btn[22].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("치즈 오믈렛");
            }
        });
    }

    void setBtn24() {
        btn[23].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("월도프샐러드");
            }
        });
    }

    void setBtn25() {
        btn[24].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("포테이토샐러드");
            }
        });
    }

    void setBtn26() {
        btn[25].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("BLT샌드위치");
            }
        });
    }

    void setBtn27() {
        btn[26].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("햄버거샌드위치");
            }
        });
    }

    void setBtn28() {
        btn[27].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("브라운스톡");
            }
        });
    }

    void setBtn29() {
        btn[28].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("이탈리안미트소스");
            }
        });
    }

    void setBtn30() {
        btn[29].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("홀렌다이즈소스");
            }
        });
    }

    //한식
    void setBtn31() {
        btn[30].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("비빔밥");
            }
        });
    }

    void setBtn32() {
        btn[31].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("콩나물밥");
            }
        });
    }

    void setBtn33() {
        btn[32].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("장국죽");
            }
        });
    }

    void setBtn34() {
        btn[33].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("완자탕");
            }
        });
    }

    void setBtn35() {
        btn[34].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("생선찌개");
            }
        });
    }

    void setBtn36() {
        btn[35].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("두부젓국찌개");
            }
        });
    }

    void setBtn37() {
        btn[36].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("제육구이");
            }
        });
    }

    void setBtn38() {
        btn[37].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("너비아니구이");
            }
        });
    }

    void setBtn39() {
        btn[38].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("더덕구이");
            }
        });
    }

    void setBtn40() {
        btn[39].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("생선양념구이");
            }
        });
    }


    //조주
    void setBtn41() {
        btn[40].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("푸스카페");
            }
        });
    }

    void setBtn42() {
        btn[41].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("맨하탄");
            }
        });
    }

    void setBtn43() {
        btn[42].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("드라이 마티니");
            }
        });
    }

    void setBtn44() {
        btn[43].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("올드 패션드");
            }
        });
    }

    void setBtn45() {
        btn[44].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("브랜디 알렉산더");
            }
        });
    }

    void setBtn46() {
        btn[45].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("싱가폴 슬링");
            }
        });
    }

    void setBtn47() {
        btn[46].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("블랙 러시안");
            }
        });
    }

    void setBtn48() {
        btn[47].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("마가리타");
            }
        });
    }

    void setBtn49() {
        btn[48].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("러스티 네일");
            }
        });
    }

    void setBtn50() {
        btn[49].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Wls_Recipe("위스키 사워");
            }
        });
    }

    void init () {
        btn_bread = findViewById(R.id.btn1);
        btn_cookie = findViewById(R.id.btn2);
        btn_western_food = findViewById(R.id.btn3);
        btn_korean_food = findViewById(R.id.btn4);
        btn_drink = findViewById(R.id.btn5);
        btn[0] = findViewById(R.id.bread_recipe_btn1);
        btn[1] = findViewById(R.id.bread_recipe_btn2);
        btn[2] = findViewById(R.id.bread_recipe_btn3);
        btn[3] = findViewById(R.id.bread_recipe_btn4);
        btn[4] = findViewById(R.id.bread_recipe_btn5);
        btn[5] = findViewById(R.id.bread_recipe_btn6);
        btn[6] = findViewById(R.id.bread_recipe_btn7);
        btn[7] = findViewById(R.id.bread_recipe_btn8);
        btn[8] = findViewById(R.id.bread_recipe_btn9);
        btn[9] = findViewById(R.id.bread_recipe_btn10);

        btn[10] = findViewById(R.id.cookie_recipe_btn1);
        btn[11] = findViewById(R.id.cookie_recipe_btn2);
        btn[12] = findViewById(R.id.cookie_recipe_btn3);
        btn[13] = findViewById(R.id.cookie_recipe_btn4);
        btn[14] = findViewById(R.id.cookie_recipe_btn5);
        btn[15] = findViewById(R.id.cookie_recipe_btn6);
        btn[16] = findViewById(R.id.cookie_recipe_btn7);
        btn[17] = findViewById(R.id.cookie_recipe_btn8);
        btn[18] = findViewById(R.id.cookie_recipe_btn9);
        btn[19] = findViewById(R.id.cookie_recipe_btn10);

        btn[20] = findViewById(R.id.western_food_recipe_btn1);
        btn[21] = findViewById(R.id.western_food_recipe_btn2);
        btn[22] = findViewById(R.id.western_food_recipe_btn3);
        btn[23] = findViewById(R.id.western_food_recipe_btn4);
        btn[24] = findViewById(R.id.western_food_recipe_btn5);
        btn[25] = findViewById(R.id.western_food_recipe_btn6);
        btn[26] = findViewById(R.id.western_food_recipe_btn7);
        btn[27] = findViewById(R.id.western_food_recipe_btn8);
        btn[28] = findViewById(R.id.western_food_recipe_btn9);
        btn[29] = findViewById(R.id.western_food_recipe_btn10);

        btn[30] = findViewById(R.id.korean_food_recipe_btn1);
        btn[31] = findViewById(R.id.korean_food_recipe_btn2);
        btn[32] = findViewById(R.id.korean_food_recipe_btn3);
        btn[33] = findViewById(R.id.korean_food_recipe_btn4);
        btn[34] = findViewById(R.id.korean_food_recipe_btn5);
        btn[35] = findViewById(R.id.korean_food_recipe_btn6);
        btn[36] = findViewById(R.id.korean_food_recipe_btn7);
        btn[37] = findViewById(R.id.korean_food_recipe_btn8);
        btn[38] = findViewById(R.id.korean_food_recipe_btn9);
        btn[39] = findViewById(R.id.korean_food_recipe_btn10);

        btn[40] = findViewById(R.id.drink_food_recipe_btn1);
        btn[41] = findViewById(R.id.drink_food_recipe_btn2);
        btn[42] = findViewById(R.id.drink_food_recipe_btn3);
        btn[43] = findViewById(R.id.drink_food_recipe_btn4);
        btn[44] = findViewById(R.id.drink_food_recipe_btn5);
        btn[45] = findViewById(R.id.drink_food_recipe_btn6);
        btn[46] = findViewById(R.id.drink_food_recipe_btn7);
        btn[47] = findViewById(R.id.drink_food_recipe_btn8);
        btn[48] = findViewById(R.id.drink_food_recipe_btn9);
        btn[49] = findViewById(R.id.drink_food_recipe_btn10);
    }
    void set_make_bread () {
        for (int i = 0; i < 50; i++){
            if (i >= 0 && i <= 9){
                btn[i].setVisibility(View.VISIBLE);


            } else {
                btn[i].setVisibility(View.GONE);
            }

        }

    }


    void set_make_cookie () {
        for (int i = 0; i < 50; i++){
            if (i >= 10 && i <= 19){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }

        }

    }


    void set_make_western_food () {
        for (int i = 0; i < 50; i++){
            if (i >= 20 && i <= 29){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }


    void set_make_korean_food () {
        for (int i = 0; i < 50; i++){
            if (i >= 30 && i <= 39){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }


    void set_make_drink () {
        for (int i = 0; i < 50; i++){
            if (i >= 40 && i <= 49){
                btn[i].setVisibility(View.VISIBLE);

            } else {
                btn[i].setVisibility(View.GONE);
            }
        }

    }

    void Wls_Recipe(String category) {
        Intent intent = new Intent(Recipe.this, Wls_Recipe.class);
        intent.putExtra("category",category);
        startActivity(intent);
    }
}


