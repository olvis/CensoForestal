package com.trackm3.censoforestal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class SistematicoDasometrico extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistematico_dasometrico);

        Spinner spinner_especie = (Spinner) findViewById(R.id.combo_especie);
        ArrayAdapter<CharSequence> adapter_especie = ArrayAdapter.createFromResource(this,
                R.array.lista_especie, android.R.layout.simple_list_item_activated_1);
        adapter_especie.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_especie.setAdapter(adapter_especie);

        Spinner spinner_calidad_fuste = (Spinner) findViewById(R.id.combo_cal_fuste);
        ArrayAdapter<CharSequence> adapter_calidad_fuste = ArrayAdapter.createFromResource(this,
                R.array.lista_calidad_fuste, android.R.layout.simple_list_item_activated_1);
        adapter_calidad_fuste.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_calidad_fuste.setAdapter(adapter_calidad_fuste);

        Spinner spinner_conservacion = (Spinner) findViewById(R.id.combo_conserv);
        ArrayAdapter<CharSequence> adapter_conservacion = ArrayAdapter.createFromResource(this,
                R.array.lista_conservacion, android.R.layout.simple_list_item_activated_1);
        adapter_conservacion.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_conservacion.setAdapter(adapter_conservacion);

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sistematico_dasometrico, menu);
        return true;
    }
    public void VincularXYgps (View v) {
        Intent XY_arbol = new Intent(this, GPSxy.class);
        startActivity(XY_arbol);
    }

    public void VincularFoto (View v) {
        Intent Foto = new Intent(this, Foto.class);
        startActivity(Foto);
    }

    public void VincularListaEspecie (View v) {
        Intent especie = new Intent(this, ListaEspecie.class);
        startActivity(especie);
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
