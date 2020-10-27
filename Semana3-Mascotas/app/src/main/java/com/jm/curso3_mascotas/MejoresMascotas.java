package com.jm.curso3_mascotas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;
import java.util.List;

public class MejoresMascotas extends AppCompatActivity {

    RecyclerView recyclerViewMascota;
    RecyclerViewAdapter adapterMascota;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.floatingAddButton);
        fab.hide();

        Toolbar myToolbar = findViewById(R.id.myToolbar);
        setSupportActionBar(myToolbar);

        //boton para ir a activity anterior
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        recyclerViewMascota = findViewById(R.id.rvMascota);
        recyclerViewMascota.setLayoutManager(new LinearLayoutManager(this));

        adapterMascota = new RecyclerViewAdapter(obtenerMascota());
        recyclerViewMascota.setAdapter(adapterMascota);
    }

    public List<ModeloMascota> obtenerMascota() {
        List<ModeloMascota> mascota = new ArrayList<>();
        mascota.add(new ModeloMascota("Thor", R.drawable.dog));
        mascota.add(new ModeloMascota("Zeus", R.drawable.cat));
        mascota.add(new ModeloMascota("Zeus", R.drawable.dog));
        mascota.add(new ModeloMascota("Maxi", R.drawable.cat));
        mascota.add(new ModeloMascota("Azabache", R.drawable.dog));
        mascota.add(new ModeloMascota("Barney", R.drawable.cat));
        return mascota;
    }
}