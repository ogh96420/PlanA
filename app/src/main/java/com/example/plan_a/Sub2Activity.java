package com.example.plan_a;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

public class Sub2Activity extends AppCompatActivity {

    private ImageView 밥;
    private ImageView 면;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sub2);

        면 = findViewById(R.id.면);
        면.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sub2Activity.this , THR4.class);
                startActivity(intent);
            }
        });

        밥 = findViewById(R.id.밥);
        밥.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sub2Activity.this , THR3.class);
                startActivity(intent);
            }
        });
    }
}