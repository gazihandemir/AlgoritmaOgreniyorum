package com.example.algoritmaogreniyorum.AlgoritmaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.algoritmaogreniyorum.R;

public class AlgoritmaBahcesiButton2_6 extends AppCompatActivity {
    EditText edCevap;
    Button btnDevam;
    static String cevap = "21";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi_button2_6);
            edCevap = findViewById(R.id.edCevapAlgo2_6);
            btnDevam = findViewById(R.id.btnDevamAlgo2_6);
            btnDevam.setVisibility(View.INVISIBLE);

    }

    public void calistirAlgo2_6(View view){
        if (cevap.contentEquals(edCevap.getText())){
            btnDevam.setVisibility(View.VISIBLE);
        }
    }
    public void devamAlgo2_6(View view){
        Intent intent = new Intent(getApplicationContext(),AlgoritmaBahcesiButton2_7.class);
        startActivity(intent);
    }
}
