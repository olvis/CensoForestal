package com.trackm3.censoforestal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Otros extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otros);
    }


    public void VincularTrack (View v)
    {
        Intent track = new Intent(this,Track.class);
        startActivity(track);
    }

    public void VincularEspecie(View v)
    {
        Intent lista_especie = new Intent(this,ListaEspecie.class);
        startActivity(lista_especie);
    }

    public void VincularFuncion (View v)
    {
        Intent lista_funcion = new Intent(this,ListaFuncion.class);
        startActivity(lista_funcion);
    }

    public void VincularPersona (View v)
    {
        Intent lista_persona = new Intent(this,ListaPersona.class);
        startActivity(lista_persona);
    }

    public void VincularGrupo (View v)
    {
        Intent lista_grupo = new Intent(this,ListaGrupo.class);
        startActivity(lista_grupo);
    }

    public void VincularListaEquipo(View v)
    {
        Intent lista_equipo = new Intent(this,ListaEquipo.class);
        startActivity(lista_equipo);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_otros, menu);
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
