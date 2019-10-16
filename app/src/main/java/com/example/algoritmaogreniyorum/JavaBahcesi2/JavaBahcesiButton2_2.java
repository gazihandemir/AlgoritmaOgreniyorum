package com.example.algoritmaogreniyorum.JavaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton2_2 extends AppCompatActivity {
    Button btnDevam;
    EditText edCevap;
    static  String cevap;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button2_2);
        btnDevam = findViewById(R.id.btnDevam2_2);
        btnDevam.setVisibility(View.INVISIBLE);
        edCevap = findViewById(R.id.edCevap2_2);
        cevap = "10";
    }
    public void calistir2_2(View view){
        if (cevap.equals(edCevap.getText().toString())){
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Tebrikler ! ");
            text.setTextSize(24);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
            btnDevam.setVisibility(View.VISIBLE);
        }else {
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout2,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("Emin misin");
            text.setTextSize(24);

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.BOTTOM, 0, 0);
            toast.setDuration(Toast.LENGTH_SHORT);
            toast.setView(layout);
            toast.show();
        }

    }public void devam2_2(View view){
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton2_3.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
}
