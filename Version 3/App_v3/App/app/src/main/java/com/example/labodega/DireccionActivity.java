package com.example.labodega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class DireccionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_direccion);
    }
    public  void f_form_perfil(View v){
        Intent i = new Intent(getApplicationContext(),RevisarUsuarioActivity.class);
        startActivity(i);
    }
}