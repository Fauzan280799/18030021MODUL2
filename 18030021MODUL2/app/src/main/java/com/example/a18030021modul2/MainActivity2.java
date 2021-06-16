package com.example.a18030021modul2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    TextView I;
    TextView N;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Bundle bundle = getIntent().getExtras();//pembuatan obyek widget textview
        TextView I = (TextView) findViewById(R.id.I);
        TextView N = (TextView) findViewById(R.id.N);
        I.setText(bundle.getCharSequence("tima"));//menset nilai dari widget textview
        N.setText(bundle.getCharSequence("timb"));

    }
}