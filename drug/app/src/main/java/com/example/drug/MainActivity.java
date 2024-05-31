package com.example.drug;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private String[] symptoms = {
            "안구건조증", "만성피로 및 식욕부진", "골다공증 방지", "면역력 강화"
    };

    private String[] nutrients = {
            "비타민 A", "비타민 B1", "마그네슘", "비타민 D"
    };

    private String[][] supplements = {
            {
                    "Nutricost, 비타민 A, 10,000IU, 소프트젤 500정",
                    "Nature's Truth, 고효능 비타민A, 3,000mcg(10,000IU), 빠른 방출 소프트젤 100정",
                    "Nature's Way, 비타민 A, 10,000 IU, 100 소프트젤"
            },
            {
                    "NOW Foods, B-1, 100 ㎎, 100 정",
                    "Nutricost, 비타민B1, 500mcg, 캡슐 120정",
                    "Swanson, B1, 티아민, 100mg, 캡슐 250정"
            },
            {
                    "NOW Foods, 마그네슘 캡슐, 400mg, 베지 캡슐 180정",
                    "Doctor's Best, 고흡수 마그네슘, 100mg, 120정",
                    "Nutricost, 마그네슘 복합체, 레귤러 강도, 250mg, 캡슐 240정"
            },
            {
                    "NOW Foods, 채식주의자용, 건조 비타민D, 1,000IU, 베지 캡슐 120정",
                    "영롱 비건 효모 비타민D",
                    "Nutricost, 비타민D3, 10,000IU, 소프트젤 240정"
            }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_symptom1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity(0);
            }
        });

        findViewById(R.id.btn_symptom2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity(1);
            }
        });

        findViewById(R.id.btn_symptom3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity(2);
            }
        });

        findViewById(R.id.btn_symptom4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openDetailActivity(3);
            }
        });
    }

    private void openDetailActivity(int index) {
        Intent intent = new Intent(this, DetailActivity.class);
        intent.putExtra("nutrient", nutrients[index]);
        intent.putExtra("supplements", supplements[index]);
        startActivity(intent);
    }
}