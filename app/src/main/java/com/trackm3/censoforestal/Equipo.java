package com.trackm3.censoforestal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Equipo extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_equipo);

        Spinner spinner_equipo = (Spinner) findViewById(R.id.nombre_equipo);
        ArrayAdapter<CharSequence> adapter_equipo = ArrayAdapter.createFromResource(this,
                R.array.lista_equipo, android.R.layout.simple_list_item_activated_1);
        adapter_equipo.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_equipo.setAdapter(adapter_equipo);

            }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_equipo, menu);
        return true;
    }

    public void VincularListaEquipo (View v)
    {
        Intent equipo = new Intent(this,ListaEquipo.class);
        startActivity(equipo);
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
