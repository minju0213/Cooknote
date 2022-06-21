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
    TextView test;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wls_recipe);
        test = findViewById(R.id.testasd);
        initActivity();

        test.setText(tittle);



    }

    void initActivity() {
        Intent intent = getIntent();
        category =intent.getStringExtra("category");
        Log.d("TAG",category);
        if (category.equals("호밀빵") ) {
            set_rye_bread();
        } else if(category.equals("제과")) {
            setCookieRecipe();
        } else {
            finish();
        }

    }

    void set_rye_bread() {
       tittle = "호밀빵";
    }

    void setCookieRecipe() {

    }



}
