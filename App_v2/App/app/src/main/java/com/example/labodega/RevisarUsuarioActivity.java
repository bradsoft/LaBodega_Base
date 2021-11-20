package com.example.labodega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class RevisarUsuarioActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_revisar_usuario);
    }
    public void f_form_home(View v){
        Intent i = new Intent(getApplicationContext(),HomeActivity.class);
        startActivity(i);
    }
    public void f_form_direccion(View v){
        Intent i = new Intent(getApplicationContext(),DireccionActivity.class);
        startActivity(i);
    }
}