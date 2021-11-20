package com.example.labodega;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.DefaultRetryPolicy;
import com.android.volley.NetworkResponse;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.VolleyLog;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.UnsupportedEncodingException;

public class RevisarUsuarioActivity extends AppCompatActivity {

    public Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        context = this;
        setContentView(R.layout.activity_revisar_usuario);

        SharedPreferences prefs = this.getSharedPreferences("PREFERENCIAS", Context.MODE_PRIVATE);
        String usuario = prefs.getString("usuario", "");
        String correo = prefs.getString("email", "");
        String direccion = prefs.getString("direccion", "");
        String telefono = prefs.getString("telefono", "");
        String metodopago = prefs.getString("metodopago", "");

        EditText usuarioText = (EditText) findViewById(R.id.etUsuario);
        EditText correoText = (EditText) findViewById(R.id.etCorreo);
        EditText direccionText = (EditText) findViewById(R.id.etDireccion);
        EditText celularText = (EditText) findViewById(R.id.etCelular);
        EditText metodopagoText = (EditText) findViewById(R.id.etMetodoPago);

        usuarioText.setText(usuario);
        correoText.setText(correo);
        direccionText.setText(direccion);
        celularText.setText(telefono);
        metodopagoText.setText(metodopago);


    }

    public void f_actualizar_persona(View v){

        final TextView msgLogueo = findViewById(R.id.txtMsg);
        final EditText txtUsuario = (EditText) findViewById(R.id.etUsuario);
        final EditText txtCorreo = (EditText) findViewById(R.id.etCorreo);
        final EditText txtDireccion = (EditText) findViewById(R.id.etDireccion);
        final EditText txtCelular = (EditText) findViewById(R.id.etCelular);
        final EditText txtMetodoPago = (EditText) findViewById(R.id.etMetodoPago);

        msgLogueo.setText("Actualizando...");
        SharedPreferences prefs = this.getSharedPreferences("PREFERENCIAS", Context.MODE_PRIVATE);
        String apepat = prefs.getString("apepat", "");
        String nombres = prefs.getString("nombres", "");
        String idpersona = prefs.getString("idpersona", "");

        String usuario = txtUsuario.getText().toString();
        String correo = txtCorreo.getText().toString();
        String direccion = txtDireccion.getText().toString();
        String celular = txtCelular.getText().toString();
        String metodoPago = txtMetodoPago.getText().toString();

        try {
            String URL = "http://20.203.165.145:8909/customermanagement/updateClient";
            JSONObject jsonBody = new JSONObject();

            jsonBody.put("idpersona", idpersona);
            jsonBody.put("nombres", nombres);
            jsonBody.put("apepat", apepat);
            jsonBody.put("numdoc", " ");
            jsonBody.put("email", correo);
            jsonBody.put("direccion", direccion);
            jsonBody.put("metodopago", metodoPago);
            jsonBody.put("telefono", celular);

            final String mRequestBody = jsonBody.toString();
            Log.i("======>",mRequestBody);

            StringRequest stringRequest = new StringRequest(Request.Method.POST, URL, new Response.Listener<String>() {
                @Override
                public void onResponse(String response) {
                    Log.i("x======>",response);

                    if(Integer.parseInt(response) == 200 ){
                        SharedPreferences.Editor editor = prefs.edit();

                        editor.putString("email", correo);
                        editor.putString("usuario", usuario);

                        editor.commit();

                        msgLogueo.setText("Registro Actualizando...");
                        Log.i("x======>","Registro actualizado con exito");

                    }

                }
            }, new Response.ErrorListener() {
                @Override
                public void onErrorResponse(VolleyError error) {
                    msgLogueo.setText("Error al registrar..." + error.getMessage());
                }
            }) {
                @Override
                public String getBodyContentType() {
                    return "application/json; charset=utf-8";
                }

                @Override
                public byte[] getBody() throws AuthFailureError {
                    try {
                        return mRequestBody == null ? null : mRequestBody.getBytes("utf-8");
                    } catch (UnsupportedEncodingException uee) {
                        VolleyLog.wtf("Unsupported Encoding while trying to get the bytes of %s using %s", mRequestBody, "utf-8");
                        return null;
                    }
                }

                @Override
                protected Response<String> parseNetworkResponse(NetworkResponse response) {
                    String responseString = "";
                    if (response != null) {
                        responseString = String.valueOf(response.statusCode);
                    }
                    return Response.success(responseString, HttpHeaderParser.parseCacheHeaders(response));
                }
            };
            RequestQueue requestQueue = Volley.newRequestQueue(this.context);
            requestQueue.add(stringRequest);
            stringRequest.setRetryPolicy(new DefaultRetryPolicy(30 * 1000, 1, 1.0f));

        } catch (JSONException e) {
            e.printStackTrace();
        }

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