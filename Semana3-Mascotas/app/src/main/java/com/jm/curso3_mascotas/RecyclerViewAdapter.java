package com.jm.curso3_mascotas;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder>{

    public static class ViewHolder extends RecyclerView.ViewHolder{
        TextView mascota;
        ImageView imagenMascota;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            mascota = itemView.findViewById(R.id.tvNombreMascota);
            imagenMascota = itemView.findViewById(R.id.ivFotoMascota);
        }
    }

    public List<ModeloMascota> mascotaLista;

    public RecyclerViewAdapter(List<ModeloMascota> mascotaLista) {
        this.mascotaLista = mascotaLista;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardview_mascotas,parent,false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.mascota.setText(mascotaLista.get(position).getNombre());
        holder.imagenMascota.setImageResource(mascotaLista.get(position).getImagenMascota());
    }

    @Override
    public int getItemCount() {
        return mascotaLista.size();
    }
}
