package com.example.plan_a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class SubActivity extends AppCompatActivity {

    private ImageView 해장;
    private ImageView 식사;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub);

        식사 = findViewById(R.id.식사);
        식사.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity.this, THR1.class);
                startActivity(intent);
            }
        });

        해장 = findViewById(R.id.해장);
        해장.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubActivity.this , THR1.class);
                startActivity(intent);
            }
        });
    }
}