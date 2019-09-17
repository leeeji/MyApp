package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static String TAG = "Main";
    TextView out;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        out = findViewById(R.id.out);
        out.setText("hello kkkk");

        EditText inp =findViewById(R.id.inp);
        String str = inp.getText().toString();
        inp.setText("4561613");

        Button btn = findViewById(R.id.btn);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {
                out.setText("SSSSSSSSSSSSSSSSSS");
            }
        });
    }
    public void onClick(View v){
        Log.i(TAG,"onClick:.............");
        out.setText("click2");
    }
}
