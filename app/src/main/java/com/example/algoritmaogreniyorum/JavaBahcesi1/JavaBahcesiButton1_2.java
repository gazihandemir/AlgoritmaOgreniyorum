package com.example.algoritmaogreniyorum.JavaBahcesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton1_2 extends AppCompatActivity {
        Button btnDevam;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button1_2);
        btnDevam = findViewById(R.id.btnDevam);

    }
    public void devam(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton1_3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }


}
