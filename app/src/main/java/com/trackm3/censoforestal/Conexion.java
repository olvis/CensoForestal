package com.trackm3.censoforestal;
//Comento esta linea
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;


public class Conexion extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_conexion);

        Spinner spinner_area_trabajo = (Spinner) findViewById(R.id.area_trabajo);
        ArrayAdapter<CharSequence> adapter_area_trabajo = ArrayAdapter.createFromResource(this,
                R.array.lista_area, android.R.layout.simple_list_item_activated_1);
        adapter_area_trabajo.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_area_trabajo.setAdapter(adapter_area_trabajo);

        Spinner spinner_bloque = (Spinner) findViewById(R.id.bloque);
        ArrayAdapter<CharSequence> adapter_bloque = ArrayAdapter.createFromResource(this,
                R.array.lista_bloque, android.R.layout.simple_list_item_activated_1);
        adapter_bloque.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_bloque.setAdapter(adapter_bloque);

        Spinner spinner_grupo = (Spinner) findViewById(R.id.grupo);
        ArrayAdapter<CharSequence> adapter_grupo = ArrayAdapter.createFromResource(this,
                R.array.lista_grupo, android.R.layout.simple_list_item_activated_1);
        adapter_grupo.setDropDownViewResource(android.R.layout.simple_list_item_activated_1);
        spinner_grupo.setAdapter(adapter_grupo);
        //comentario
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_conexion, menu);
        return true;
    }

    public void VincularPersonal (View v) {
        Intent Personal = new Intent(this, Personal.class);
        startActivity(Personal);
    }
    public void VincularEquipo (View v) {
        Intent Equipo = new Intent(this, Equipo.class);
        startActivity(Equipo);
    }

    public void VincularMapeo (View v) {
        Intent btn_mapeo = new Intent(this, ConexionTrack.class);
        startActivity(btn_mapeo);
    }

    public void VincularFotoGrupo (View v)
    {
        Intent foto_grupo = new Intent(this,Foto.class);
        startActivity(foto_grupo);
    }

    public void VincularFotoEquipo (View v)
    {
        Intent foto_equipo = new Intent(this,Foto.class);
        startActivity(foto_equipo);
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
