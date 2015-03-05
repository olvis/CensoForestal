package com.trackm3.censoforestal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class ConexionTrack extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conexion_track);

        Spinner spinner_autotrack = (Spinner) findViewById(R.id.auto_track);
        ArrayAdapter<CharSequence> adapter_autotrack = ArrayAdapter.createFromResource(this,
                R.array.lista_autotrack, android.R.layout.simple_list_item_activated_1);
        adapter_autotrack.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_autotrack.setAdapter(adapter_autotrack);

        Spinner spinner_gpstrack = (Spinner) findViewById(R.id.track_gps);
        ArrayAdapter<CharSequence> adapter_gpstrack = ArrayAdapter.createFromResource(this,
                R.array.lista_gpstrack, android.R.layout.simple_list_item_activated_1);
        adapter_gpstrack.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_gpstrack.setAdapter(adapter_gpstrack);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_conexion_track, menu);
        return true;
    }

    public void VincularMapeoArb (View v) {
        Intent mapeo = new Intent(this, Dasometrico.class);
        startActivity(mapeo);
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
