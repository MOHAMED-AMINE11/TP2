package com.example.pizzaapp.adapter;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.Group;

import com.example.pizzaapp.R;
import com.example.pizzaapp.classes.Produit;

import java.util.List;

public class PizzaAdapter extends ArrayAdapter<Produit> {

    public PizzaAdapter(Context context, List<Produit> produits) {
        super(context, 0, produits);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Produit produit = getItem(position);

        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_pizza, parent, false);
        }

        TextView nomTextView = convertView.findViewById(R.id.nom_pizza);
        ImageView imageView = convertView.findViewById(R.id.image_pizza);
        TextView duree = convertView.findViewById(R.id.temps_preparation);

        assert produit != null;
        nomTextView.setText(produit.getNom());
        imageView.setImageResource(produit.getPhoto());
        duree.setText(produit.getDuree());

        return convertView;
    }

}
