package com.jm.curso3_mascotas_s4;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

import com.jm.curso3_mascotas_s4.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class PetProfileFragment extends Fragment {

    private List<Pet> myPets;
    private RecyclerView myPetPictures;

    public PetProfileFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_pet_profile, container, false);

        myPetPictures = (RecyclerView) view.findViewById(R.id.recyclerFragmentMyPet);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(getActivity(), 2);
        myPetPictures.setLayoutManager(gridLayoutManager);

        initializeMyPetList();
        initializeAdapter();

        // Inflate the layout for this fragment
        return view;
    }

    public void initializeMyPetList(){
        String myPetName = getResources().getString(R.string.text_cardViewMyPet);
        myPets = new ArrayList<>();
        myPets.add(new Pet(R.drawable.dog, myPetName));
        myPets.add(new Pet(R.drawable.dog, myPetName));
        myPets.add(new Pet(R.drawable.dog, myPetName));
        myPets.add(new Pet(R.drawable.dog, myPetName));
        myPets.add(new Pet(R.drawable.dog, myPetName));

    }

    public void initializeAdapter(){
        PetAdapter adapter = new PetAdapter(myPets, getActivity());
        myPetPictures.setAdapter(adapter);
    }

}