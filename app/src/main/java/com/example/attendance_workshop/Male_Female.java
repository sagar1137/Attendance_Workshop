package com.example.attendance_workshop;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Male_Female extends AppCompatActivity {
    ImageView imgv1;
    ImageView imgv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_male__female);
    imgv1=findViewById(R.id.imageView4);
    imgv2=findViewById(R.id.imageView5);

    imgv1.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Male_Female.this,Male_Activity.class);
            startActivity(intent);
        }
    });

    imgv2.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent intent=new Intent(Male_Female.this,Female_Activity.class);
            startActivity(intent);

        }
    });
    }
}
