package com.example.algoritmaogreniyorum;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.algoritmaogreniyorum.AlgoritmaBahcesi1.AlgoritmaBahcesiButton1_1;
import com.example.algoritmaogreniyorum.AlgoritmaBahcesi2.AlgoritmaBahcesiButton2_1;
import com.example.algoritmaogreniyorum.AlgoritmaBahcesi3.AlgoritmaBahcesiButton3_1;

public class AlgoritmaBahcesiActivity extends AppCompatActivity {
    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

    static int buton1, buton2, buton3, buton4, buton5, buton6, buton7, buton8, buton9, buton10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_algoritma_bahcesi);
        btn1 = findViewById(R.id.btnAlgoBahcesi1);
        btn2 = findViewById(R.id.btnAlgoBahcesi2);
        btn3 = findViewById(R.id.btnAlgoBahcesi3);
        btn4 = findViewById(R.id.btnAlgoBahcesi4);
        btn5 = findViewById(R.id.btnAlgoBahcesi5);
        btn6 = findViewById(R.id.btnAlgoBahcesi6);
        btn7 = findViewById(R.id.btnAlgoBahcesi7);
        btn8 = findViewById(R.id.btnAlgoBahcesi8);
        btn9 = findViewById(R.id.btnAlgoBahcesi9);
        btn10 = findViewById(R.id.btnAlgoBahcesi10);
        /*
        if (buton2 == 1) {
            btn2.setVisibility(View.VISIBLE);
        } else {
            btn2.setVisibility(View.INVISIBLE);
        }
        if (buton3 == 1) {
            btn3.setVisibility(View.VISIBLE);
        } else {
            btn3.setVisibility(View.INVISIBLE);
        }
        if (buton4 == 1) {
            btn4.setVisibility(View.VISIBLE);
        } else {
            btn4.setVisibility(View.INVISIBLE);
        }
        if (buton5 == 1) {
            btn5.setVisibility(View.VISIBLE);
        }else{
            btn5.setVisibility(View.INVISIBLE);
        }
        if (buton6 == 1) {
            btn6.setVisibility(View.VISIBLE);
        }else{
            btn6.setVisibility(View.INVISIBLE);
        }
        if (buton7 == 1) {
            btn7.setVisibility(View.VISIBLE);
        }else{
            btn7.setVisibility(View.INVISIBLE);
        }
        if (buton8 == 1) {
            btn8.setVisibility(View.VISIBLE);
        }else{
            btn8.setVisibility(View.INVISIBLE);
        }
        if (buton9 == 1) {
            btn9.setVisibility(View.VISIBLE);
        }else{
            btn9.setVisibility(View.INVISIBLE);
        }
        if (buton10 == 1) {
            btn10.setVisibility(View.VISIBLE);
        }else{
            btn10.setVisibility(View.INVISIBLE);
        }


        */

    }

    public void btnAlgoBahceClick1(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton1_1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton2 = 1;
    }

    public void btnAlgoBahceClick2(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton2_1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton3 = 1;
    }

    public void btnAlgoBahceClick3(View view) {
        Intent intent = new Intent(getApplicationContext(), AlgoritmaBahcesiButton3_1.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton4 = 1;
    }

    public void btnAlgoBahceClick4(View view) {
    /*    Intent intent = new Intent(getApplicationContext(),.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton5 = 1;*/
    }

    public void btnAlgoBahceClick5(View view) {
      /*  Intent intent = new Intent(getApplicationContext(),.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton6 = 1;*/
    }

    public void btnAlgoBahceClick6(View view) {
       /* Intent intent = new Intent(getApplicationContext(),.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton7 = 1;*/
    }

    public void btnAlgoBahceClick7(View view) {
       /* Intent intent = new Intent(getApplicationContext(),.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton8 = 1;*/
    }

    public void btnAlgoBahceClick8(View view) {
       /* Intent intent = new Intent(getApplicationContext(),.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton9 = 1;*/
    }

    public void btnAlgoBahceClick9(View view) {
        /*Intent intent = new Intent(getApplicationContext(),.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);
        buton10 = 1;*/
    }

    public void btnAlgoBahceClick10(View view) {
      /*  Intent intent = new Intent(getApplicationContext(),.class);
        startActivity(intent);
        overridePendingTransition(R.anim.anim_in, R.anim.anim_out);*/

    }
}
