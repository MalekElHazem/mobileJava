package com.example.tp2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.maincolor), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        EditText txt1, txt2;
        RadioButton r1, r2, r3, r4;
        Button btn;
        TextView res;


        txt1 = findViewById(R.id.texte1);
        txt2 = findViewById(R.id.texte2);
        r1 = findViewById(R.id.r1);
        r2 = findViewById(R.id.r2);
        r3 = findViewById(R.id.r3);
        r4 = findViewById(R.id.r4);
        btn = findViewById(R.id.btn);
        res = findViewById(R.id.res);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int num1 = Integer.parseInt(txt1.getText().toString());
                int num2 = Integer.parseInt(txt2.getText().toString());
                float reslt = 0;

                if (num1 == 0 || num2 == 0 ){
                    Toast.makeText(MainActivity2.this,"You can not choose 0",Toast.LENGTH_SHORT).show();
                }else{
                    if (r1.isChecked()){
                        reslt = num1 + num2;
                    } else if (r2.isChecked()){
                        reslt = num1 - num2;
                    } else if (r3.isChecked()){
                        reslt = num1 * num2;
                    } else if (r4.isChecked()){
                        reslt = num1 / num2;
                    } else {
                        Toast.makeText(MainActivity2.this,"Check a box",Toast.LENGTH_SHORT).show();
                    }
                }

                res.setText(reslt + "");

            }
        });

    }

    Boolean isEmpty(){
        return true;
    }
}