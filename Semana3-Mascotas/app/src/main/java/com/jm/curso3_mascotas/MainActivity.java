package com.jm.curso3_mascotas;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

import androidx.appcompat.widget.Toolbar;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerViewMascota;
    RecyclerViewAdapter adapterMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar myToolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);

        recyclerViewMascota = findViewById(R.id.rvMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

        adapterMascota = new RecyclerViewAdapter(obtenerMascota());
        recyclerViewMascota.setAdapter(adapterMascota);
    }

    public List<ModeloMascota> obtenerMascota(){
        List<ModeloMascota> mascota = new ArrayList<>();
        mascota.add(new ModeloMascota("Zeus", R.drawable.cat));
        mascota.add(new ModeloMascota("Maxi", R.drawable.dog));
        mascota.add(new ModeloMascota("Azabache", R.drawable.dog));
        return mascota;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.main_activity_menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_favorite:
                Intent siguiente = new Intent(this, MejoresMascotas.class);
                startActivity(siguiente);
            case R.id.action_settings:
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }
}