package com.example.day03;

import static com.example.day03.MoveWithDataActivity.key_data;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMove = findViewById(R.id.btnMove);
        Button btnMoveWithData = findViewById(R.id.btnMoveWithData);
        Button btnMoveWithObj = findViewById(R.id.btnMoveWithObj);
        Button btnImplicit = findViewById(R.id.btnImplicit);

        btnMove.setOnClickListener(this);
        btnMoveWithData.setOnClickListener(this);
        btnMoveWithObj.setOnClickListener(this);
        btnImplicit.setOnClickListener(this);
    }
    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btnMove){
            Intent intent = new Intent(this, MoveActivity.class);
            startActivity(intent);
        } else if (v.getId() == R.id.btnMoveWithData) {
            Intent intent = new Intent(this, MoveWithDataActivity.class);
            intent.putExtra(key_data, "bjorwi");
            startActivity(intent);
        } else if (v.getId() == R.id.btnMoveWithObj) {
            Marvel marvel = new Marvel();
            marvel.setName("Iron Man");
            marvel.setType("Human");
            marvel.setAge(22);
            Intent intent = new Intent(this, MoveWithObjActivity.class);
            intent.putExtra(MoveWithObjActivity.key_data, marvel);
            startActivity(intent);
        } else if (v.getId() == R.id.btnImplicit) {
            String phone = "0812312121";
            Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:"+phone));
            startActivity(intent);
        }
    }
}



