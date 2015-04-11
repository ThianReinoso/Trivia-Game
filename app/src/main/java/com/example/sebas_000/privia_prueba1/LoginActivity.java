package com.example.sebas_000.privia_prueba1;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class LoginActivity extends ActionBarActivity {

    Button btnBorrar, btnIngresar;
    EditText emailTxt,passwordTxt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        btnIngresar = (Button) findViewById(R.id.btnIngresar);
        btnBorrar = (Button) findViewById(R.id.btnBorrar);
        emailTxt = (EditText) findViewById(R.id.txtEmail);
        passwordTxt = (EditText) findViewById(R.id.txtPassword);

        btnIngresar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent activity = new Intent(getApplicationContext(),MainActivity2.class);
                startActivity(activity);
            }
        });

        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                passwordTxt.setText("");
                emailTxt.setText("");
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_login, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
