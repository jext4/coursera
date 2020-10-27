package com.jm.curso3_mascotas_s4;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link PetListFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import com.jm.curso3_mascotas_s4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PetListFragment extends Fragment {

    private List<Pet> pets;
    private RecyclerView listPets;

    public PetListFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_pet_list, container, false);

        listPets = (RecyclerView) view.findViewById(R.id.recyclerFragmentPetList);
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getActivity());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        listPets.setLayoutManager(linearLayoutManager);

        initializePetList();
        initializeAdapter();

        return view;
    }

    public void initializeAdapter(){
        PetAdapter adapter = new PetAdapter(pets, getActivity());
        listPets.setAdapter(adapter);
    }

    public void initializePetList(){
        pets = new ArrayList<>();
        pets.add(new Pet(R.drawable.dog, "Max"));
        pets.add(new Pet(R.drawable.dog2, "Charlie"));
        pets.add(new Pet(R.drawable.dog3, "Bailey"));
        pets.add(new Pet(R.drawable.cat, "Luna"));
        pets.add(new Pet(R.drawable.cat2, "Jack"));
        pets.add(new Pet(R.drawable.cat3, "Milo"));
    }

}