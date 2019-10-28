package com.example.myapp;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "Main";
    TextView out;
    EditText inp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = findViewById(R.id.out);
        out.setText("温度转换器");

        inp =findViewById(R.id.inp);
        //String str = inp.getText().toString();
        //inp.setText("33");
        //int i1 = getText(R.id.inp);

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                //out.setText("");
                //inp.setText(str/9*5+32);
            }
        });
    }
    public void onClick(View v){
        Log.i(TAG,"开始转换");
        out.setText("转换成功");
    }
}
