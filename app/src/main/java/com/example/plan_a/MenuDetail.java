package com.example.plan_a;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MenuDetail extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu_detail);

        TextView textView = findViewById(R.id.tv_detail);
        Intent intent = getIntent();
        textView.setText(intent.getStringExtra("menu"));

    }
}
