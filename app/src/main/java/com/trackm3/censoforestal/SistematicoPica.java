package com.trackm3.censoforestal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Spinner;
import android.widget.ArrayAdapter;


public class SistematicoPica extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sistematico_pica);

        Spinner spinner_faja = (Spinner) findViewById(R.id.combo_faja);
        ArrayAdapter<CharSequence> adapter_faja = ArrayAdapter.createFromResource(this,
                R.array.lista_faja, android.R.layout.simple_list_item_activated_1);
        adapter_faja.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_faja.setAdapter(adapter_faja);

        Spinner spinner_pica = (Spinner) findViewById(R.id.combo_pica);
        ArrayAdapter<CharSequence> adapter_pica = ArrayAdapter.createFromResource(this,
                R.array.lista_pica, android.R.layout.simple_list_item_activated_1);
        adapter_pica.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_pica.setAdapter(adapter_pica);

        Spinner spinner_linea_inicio = (Spinner) findViewById(R.id.linea_inicio);
        ArrayAdapter<CharSequence> adapter_linea_inicio = ArrayAdapter.createFromResource(this,
                R.array.lista_linea, android.R.layout.simple_list_item_activated_1);
        adapter_linea_inicio.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_linea_inicio.setAdapter(adapter_linea_inicio);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sistematico_pica, menu);
        return true;
    }

    public void VincularMapeoArb (View v) {
        Intent mapeo = new Intent(this, SistematicoDasometrico.class);
        startActivity(mapeo);
    }

    public void VincularXYgpsInicio (View v) {
        Intent XYinicio = new Intent(this, GPSxy.class);
        startActivity(XYinicio);
    }

    public void VincularXYgpsFin (View v) {
        Intent XYfinal = new Intent(this, GPSxy.class);
        startActivity(XYfinal);
    }

    public void VincularPuntoReferencia (View v) {
        Intent punto_referencia = new Intent(this, ReferenciaXY.class);
        startActivity(punto_referencia);
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
