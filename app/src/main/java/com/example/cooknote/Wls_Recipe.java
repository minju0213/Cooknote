package com.example.cooknote;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

public class Wls_Recipe extends AppCompatActivity {

    String category;
    String tittle;
    TextView recipe_text1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wls_recipe);
        recipe_text1 = findViewById(R.id.recipe_text1);
        initActivity();

        recipe_text1.setText(tittle);


    }

    void initActivity() {
        Intent intent = getIntent();
        category = intent.getStringExtra("category");
        if (category.equals("빵도넛")) {
            bread_recipe_1();
        } else if (category.equals("제과")) {
            setCookieRecipe();
        } else {
            finish();
        }

    }

    void bread_recipe_1() {
        tittle = "빵도넛입니다";
    }

    void setCookieRecipe() { tittle = "초코머핀"; }


}
