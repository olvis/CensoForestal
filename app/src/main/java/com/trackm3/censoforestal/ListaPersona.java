package com.trackm3.censoforestal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class ListaPersona extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_persona);

        Spinner spinner_tipo_persona = (Spinner) findViewById(R.id.tipo_persona);
        ArrayAdapter<CharSequence> adapter_tipo_persona= ArrayAdapter.createFromResource(this,
                R.array.lista_tipo_persona, android.R.layout.simple_list_item_activated_1);
        adapter_tipo_persona.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_tipo_persona.setAdapter(adapter_tipo_persona);


    }

    public void VincularFoto (View v) {
        Intent Foto = new Intent(this, Foto.class);
        startActivity(Foto);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lista_persona, menu);
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
