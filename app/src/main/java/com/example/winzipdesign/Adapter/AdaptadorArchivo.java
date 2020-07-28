package com.example.winzipdesign.Adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.winzipdesign.Model.Archivo;
import com.example.winzipdesign.R;

import java.util.ArrayList;

public class AdaptadorArchivo extends RecyclerView.Adapter<AdaptadorArchivo.ViewHolderArchivo> {

    ArrayList<Archivo> listaArchivos;

    public AdaptadorArchivo(ArrayList<Archivo> listaArchivos) {
        this.listaArchivos = listaArchivos;
    }

    @Override
    public ViewHolderArchivo onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.ly_archivos,null,false);
        return new ViewHolderArchivo(view);
    }

    @Override
    public void onBindViewHolder(AdaptadorArchivo.ViewHolderArchivo holder, int position) {
        Archivo archivo = listaArchivos.get(position);
        holder.lblNombre.setText(listaArchivos.get(position).getNombre());
        holder.lblDescripcion.setText(listaArchivos.get(position).getDescripcion());
    }

    @Override
    public int getItemCount() {
        return listaArchivos.size();
    }

    public class ViewHolderArchivo extends RecyclerView.ViewHolder {

        TextView lblNombre, lblDescripcion;

        public ViewHolderArchivo(View itemView) {
            super(itemView);
            lblNombre = (TextView) itemView.findViewById(R.id.lblNombre);
            lblDescripcion = (TextView) itemView.findViewById(R.id.lblDescripcion);
        }
    }

}
