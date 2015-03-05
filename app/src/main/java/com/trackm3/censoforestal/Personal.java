package com.trackm3.censoforestal;


import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Personal extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personal);

        Spinner spinner_trabajador = (Spinner) findViewById(R.id.nombre_trabajador);
        ArrayAdapter<CharSequence> adapter_trabajador = ArrayAdapter.createFromResource(this,
                R.array.lista_trabajador, android.R.layout.simple_list_item_activated_1);
        adapter_trabajador.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_trabajador.setAdapter(adapter_trabajador);

        Spinner spinner_funcion = (Spinner) findViewById(R.id.funcion_trabajador);
        ArrayAdapter<CharSequence> adapter_funcion = ArrayAdapter.createFromResource(this,
                R.array.lista_funcion, android.R.layout.simple_list_item_activated_1);
        adapter_funcion.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_funcion.setAdapter(adapter_funcion);
    }

    public void VincularListaTrabajador (View v) {
        Intent trabajador = new Intent(this, ListaPersona.class);
        startActivity(trabajador);
    }
    public void VincularListaFuncion (View v) {
        Intent funcion = new Intent(this, ListaFuncion.class);
        startActivity(funcion);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_personal, menu);
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
