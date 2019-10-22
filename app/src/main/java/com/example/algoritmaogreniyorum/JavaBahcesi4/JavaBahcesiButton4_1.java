package com.example.algoritmaogreniyorum.JavaBahcesi4;

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

public class JavaBahcesiButton4_1 extends AppCompatActivity {
    EditText edCevap;
    Button btnDevam;
    static  String cevap = "1";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button4_1);

        edCevap = findViewById(R.id.edCevap4_1);
        btnDevam = findViewById(R.id.btnDevam4_1);
        btnDevam.setVisibility(View.INVISIBLE);
    }

    public void calistir4_1(View view){
        if (cevap.equals(edCevap.getText().toString())){
            btnDevam.setVisibility(View.VISIBLE);
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

        }else{
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
    }
    public void devam4_1(View view) {
        Intent intent = new Intent(getApplicationContext(),JavaBahcesiButton4_2.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);

    }
}
