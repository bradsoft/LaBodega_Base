package com.example.labodega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }

    public void f_form_perfil(View v){
        Intent i = new Intent(getApplicationContext(),RevisarUsuarioActivity.class);
        startActivity(i);
    }

    public void f_exit(View v){
        Intent i = new Intent(getApplicationContext(),PrincipalActivity.class);
        startActivity(i);
    }

}