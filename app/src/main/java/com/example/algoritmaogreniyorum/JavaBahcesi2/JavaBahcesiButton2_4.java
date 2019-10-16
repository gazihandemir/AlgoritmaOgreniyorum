package com.example.algoritmaogreniyorum.JavaBahcesi2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.algoritmaogreniyorum.R;
public class JavaBahcesiButton2_4 extends AppCompatActivity {
        Button btnCevap1;
        Button btnCevap2;
        Button btnCevap3;
        Button btnCevap4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button2_4);
        btnCevap1 = findViewById(R.id.btnCevap2_4_1);
        btnCevap2 = findViewById(R.id.btnCevap2_4_2);
        btnCevap3 = findViewById(R.id.btnCevap2_4_3);
        btnCevap4 = findViewById(R.id.btnCevap2_4_4);
    }
    public void btn2_4_1(View view){
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
    public void btn2_4_2(View view){
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
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton2_5.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
    }
    public void btn2_4_3(View view){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout2,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.text);
        text.setText("Yanlış cevap");
        text.setTextSize(24);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
    public void btn2_4_4(View view){
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout2,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.text);
        text.setText("Tekrar deneyiniz");
        text.setTextSize(24);

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setView(layout);
        toast.show();
    }
}
