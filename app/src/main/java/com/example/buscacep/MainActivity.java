package com.example.buscacep;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText etCep, etResult;
    private Button btConsultar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etCep.findViewById(R.id.etCep);
        etResult.findViewById(R.id.etResult);
        btConsultar.findViewById(R.id.btConsultar);
    }
}