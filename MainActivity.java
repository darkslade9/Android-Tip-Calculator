package com.example.urk19cs10563;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.*;

public class MainActivity extends AppCompatActivity {

    EditText e1;
    Button b1;
    Switch s1;
    RadioGroup r1;
    TextView t1;
    Double answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        e1=findViewById(R.id.GetNumber);
        r1=findViewById(R.id.gg);
        b1=findViewById(R.id.calc);
        s1=findViewById(R.id.switchto);
        t1=findViewById(R.id.results);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (r1.getCheckedRadioButtonId())
                {
                    case R.id.good:
                        answer=Double.parseDouble(e1.getText().toString());
                        answer=(answer*20)/100;
                        break;
                    case R.id.decent:
                        answer=Double.parseDouble(e1.getText().toString());
                        answer=(answer*18)/100;
                        break;
                    case R.id.ok:
                        answer=Double.parseDouble(e1.getText().toString());
                        answer=(answer*15)/100;
                }
                if(s1.isChecked())
                {
                    t1.setText(Math.round(answer)+"");
                }
                else
                {
                    t1.setText(answer+"");
                }
            }
        });

    }
}
