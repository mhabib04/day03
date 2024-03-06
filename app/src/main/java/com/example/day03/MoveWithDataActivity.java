package com.example.day03;

import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MoveWithDataActivity extends AppCompatActivity {

    public static final String key_data = "key_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_data);

        String  name = getIntent().getStringExtra("key_name");
        TextView tvData = findViewById(R.id.tvDataData);

        tvData.setText(name);
    }
}