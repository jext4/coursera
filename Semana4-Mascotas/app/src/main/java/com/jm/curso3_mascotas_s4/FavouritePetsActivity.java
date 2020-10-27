package com.jm.curso3_mascotas_s4;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import com.jm.curso3_mascotas_s4.R;

public class FavouritePetsActivity extends AppCompatActivity {

    private List<Pet> petsFAV;
    private RecyclerView petListFAV;
    private Toolbar myActionbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourite_pets);

        myActionbar = (Toolbar) findViewById(R.id.actionbar);
        setSupportActionBar(myActionbar);
        getSupportActionBar().setDisplayShowTitleEnabled(false);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        petListFAV = (RecyclerView) findViewById(R.id.rvPetList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        petListFAV.setLayoutManager(linearLayoutManager);

        initializePetList();
        initializeAdapter();
    }

    public void initializeAdapter(){
        PetAdapter adapter = new PetAdapter(petsFAV, this);
        petListFAV.setAdapter(adapter);
    }

    public void initializePetList(){
        petsFAV = new ArrayList<>();
        petsFAV.add(new Pet(R.drawable.dog, "Max"));
        petsFAV.add(new Pet(R.drawable.dog2, "Charlie"));
        petsFAV.add(new Pet(R.drawable.cat, "Luna"));
        petsFAV.add(new Pet(R.drawable.cat3, "Jack"));
        petsFAV.add(new Pet(R.drawable.cat2, "Milo"));
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        Intent intent = null;
        switch (item.getItemId()) {
            case R.id.menuAbout:
                intent = new Intent(this, DeveloperBioActivity.class);
                break;
            case R.id.menuContact:
                intent = new Intent(this, ContactActivity.class);
                break;
        }
        if(intent != null){
            startActivity(intent);
        }
        return super.onOptionsItemSelected(item);
    }

}
