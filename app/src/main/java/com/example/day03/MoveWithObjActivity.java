package com.example.day03;

import android.os.Build;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MoveWithObjActivity extends AppCompatActivity {

    public static final String key_data = "key_name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_move_with_obj);

        TextView tvName = findViewById(R.id.tvName);
        TextView tvType = findViewById(R.id.tvType);
        TextView tvAge = findViewById(R.id.tvAge);

        Marvel marvel;
        if (Build.VERSION.SDK_INT >= 33){
            marvel = getIntent().getParcelableExtra(key_data, Marvel.class);
        } else {
            marvel = getIntent().getParcelableExtra(key_data);
        }

        String nama = marvel.getName();
        String tipe = marvel.getType();
        int umur = marvel.getAge();
        String umurr = Integer.toString(umur);
        tvName.setText(nama);
        tvType.setText(tipe);
        tvAge.setText(umurr);

    }
}