package com.example.algoritmaogreniyorum.JavaBahcesi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.algoritmaogreniyorum.JavaBahcesiActivity;
import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton1_7 extends AppCompatActivity {
    Button btnDevam;
    TextView tvCevap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button1_7);
        btnDevam = findViewById(R.id.btnDevam1_7);
        btnDevam.setVisibility(View.INVISIBLE);
        tvCevap = findViewById(R.id.tvCevap1_7);
        tvCevap.setVisibility(View.INVISIBLE);

    }

    public void calistir1_7(View view) {
        tvCevap.setText("Efsane biziz");
        btnDevam.setVisibility(View.VISIBLE);
        tvCevap.setVisibility(View.VISIBLE);
    }

    public void devam1_7(View view) {
        Intent intent = new Intent(getApplicationContext(), JavaBahcesiActivity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        LayoutInflater inflater = getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast_layout,
                (ViewGroup) findViewById(R.id.custom_toast_container));

        TextView text = layout.findViewById(R.id.text);
        text.setText("TEBRİKLER 2. ADIMA GEÇTİNİZ!");
        text.setTextSize(36);
        text.setTextColor(Color.parseColor("#ffffff"));

        Toast toast = new Toast(getApplicationContext());
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(layout);
        toast.show();
    }
}
