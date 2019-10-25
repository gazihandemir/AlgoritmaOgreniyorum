package com.example.algoritmaogreniyorum.JavaBahcesi6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.example.algoritmaogreniyorum.JavaBahcesiActivity;
import com.example.algoritmaogreniyorum.R;

public class JavaBahcesiButton6_3 extends AppCompatActivity {
    EditText edCevap1, edCevap2, edCevap3;
    TextView tvCevap;
    Button btnDevam;
    static  int stfu = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_java_bahcesi_button6_3);
        edCevap1 = findViewById(R.id.edCevap6_3_1);
        edCevap2 = findViewById(R.id.edCevap6_3_2);
        edCevap3 = findViewById(R.id.edCevap6_3_3);
        tvCevap = findViewById(R.id.tvCevap6_3);
        btnDevam = findViewById(R.id.btnDevam6_3);
        tvCevap.setVisibility(View.INVISIBLE);
    }

    public void calistir6_3(View view) {
        String strCevap1 = "Scanner veriGirisi";
        String strCevap2 = "String veri";
        String strCevap3 = "Lütfen bir kelime giriniz";
        String cevap1 = edCevap1.getText().toString();
        String cevap2 = edCevap2.getText().toString();
        String cevap3 = edCevap3.getText().toString();

        if (strCevap1.equals(cevap1) && strCevap2.equals(cevap2) && strCevap3.equals(cevap3)) {
            tvCevap.setText("Java ögreniyorum");
            tvCevap.setVisibility(View.VISIBLE);
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
            btnDevam.setText("DEVAM");

        } else {
            Toast.makeText(this, "Yanlis cevap ip ucuna bakabilirsiniz ! ", Toast.LENGTH_LONG).show();
        }


    }

    public void devam6_3(View view) {

        String devam = "DEVAM";

        if (devam.equals(btnDevam.getText().toString())){
            LayoutInflater inflater = getLayoutInflater();
            View layout = inflater.inflate(R.layout.toast_layout,
                    (ViewGroup) findViewById(R.id.custom_toast_container));

            TextView text = layout.findViewById(R.id.text);
            text.setText("TEBRİKLER 7. ADIMA GEÇTİNİZ!");
            text.setTextSize(36);
            text.setTextColor(Color.parseColor("#ffffff"));

            Toast toast = new Toast(getApplicationContext());
            toast.setGravity(Gravity.CENTER, 0, 0);
            toast.setDuration(Toast.LENGTH_LONG);
            toast.setView(layout);
            toast.show();
            Intent intent = new Intent(getApplicationContext(),JavaBahcesiActivity.class);
            startActivity(intent);
            overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        }else {
            stfu++;
            if (stfu >= 4){
                btnDevam.setText("CEVAP");
                if (stfu > 4){
                    Toast.makeText(this, "1. Cevap : Scanner veriGirisi , 2. Cevap : String veri , 3. Cevap : Lütfen bir kelime giriniz", Toast.LENGTH_LONG).show();

                }
            }else{
                Toast.makeText(this, "1. boşluğu doldururken 2. boşluğun devamındaki yerden yardım alabilirsiniz ", Toast.LENGTH_LONG).show();
                Toast.makeText(this, "2. boşluğu doldururken String olduğunu unutmayın ve değişkeninizi veri olarak tanımlayın ", Toast.LENGTH_LONG).show();
                Toast.makeText(this, "3. boşluğu doldururken System.out.println fonksiyonu içine dikkatli bakın", Toast.LENGTH_LONG).show();
            }


        }
    }
}
