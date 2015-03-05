package com.trackm3.censoforestal;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class Portada extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_portada);

       }

    public void VincularSistem (View v)
    {
        Intent btn_img_sistematico = new Intent(this,Sistematico.class);
        startActivity(btn_img_sistematico);
    }

    public void VincularConexion (View v)
    {
        Intent btn_img_conexion = new Intent(this,Conexion.class);
        startActivity(btn_img_conexion);
    }

    public void VincularDirect (View v)
    {
        Intent btn_img_directo = new Intent(this,Directo.class);
        startActivity(btn_img_directo);
    }
//ESTE VINCULO ES TEMPORAL, UNICAMENTE PARA PROBAR LOS FORMULARIOS NO PRINCIPALES
    public void VincularOtros (View v)
    {
        Intent temporal= new Intent(this,Otros.class);
        startActivity(temporal);
    }



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_portada, menu);
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
