package com.example.labodega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class PrincipalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
    }

    public void f_form_registrar(View v){
        Intent i = new Intent(getApplicationContext(),RegistrarUsuarioActivity.class);
        startActivity(i);
    }
    public void f_form_ingresar(View v){
        Intent i = new Intent(getApplicationContext(),IngresarUsuarioActivity.class);
        startActivity(i);
    }


}