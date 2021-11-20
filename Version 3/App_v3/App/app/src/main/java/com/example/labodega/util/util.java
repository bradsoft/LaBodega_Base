package com.example.labodega.util;

import android.content.SharedPreferences;

import com.example.labodega.bean.PersonaBean;

public class util {
    public static void guardarSesion(SharedPreferences prefs, String idPersona){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("idpersona", idPersona);
        editor.commit();
    }

    public static void guardarInformacionPersona(SharedPreferences prefs, PersonaBean info){
        SharedPreferences.Editor editor = prefs.edit();
        editor.putString("idpersona", info.getIdpersona());
        editor.putString("usuario", info.getUsuario());
        editor.putString("nombres", info.getNombres());
        editor.putString("apepat", info.getApepat());
        editor.putString("email",info.getEmail());
        editor.putString("numdoc",info.getNumdoc());
        editor.putString("direccion",info.getDireccion());
        editor.putString("telefono",info.getTelefono());
        editor.putString("metodopago", info.getMetodopago());
        editor.commit();
    }
}
