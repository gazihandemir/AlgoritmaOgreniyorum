package com.example.algoritmaogreniyorum.AlgoritmaBahcesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton1_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button1_1);
    }

    public void btnDevamAlgoClick1_1(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton1_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);

    }
}
