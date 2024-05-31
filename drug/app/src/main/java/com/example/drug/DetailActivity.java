package com.example.drug;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        TextView tvNutrient = findViewById(R.id.tv_nutrient);
        ListView lvSupplements = findViewById(R.id.lv_supplements);
        Button btnBack = findViewById(R.id.btn_back);

        String nutrient = getIntent().getStringExtra("nutrient");
        String[] supplementsArray = getIntent().getStringArrayExtra("supplements");

        tvNutrient.setText(nutrient);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, supplementsArray);
        lvSupplements.setAdapter(adapter);

        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish(); // 현재 액티비티를 종료하고 이전 액티비티로 돌아갑니다.
            }
        });

    }
}
