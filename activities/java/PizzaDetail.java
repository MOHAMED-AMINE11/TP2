package com.example.pizzaapp.activities;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzaapp.R;
import com.example.pizzaapp.classes.Produit;
import com.example.pizzaapp.service.ProduitService;

public class PizzaDetailActivity extends AppCompatActivity {

    private ProduitService produitService;
    private ImageView imageView;
    private TextView nomTextView, tempsPreparationTextView, ingredientsTextView, descriptionTextView, etapesTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_detail);

        imageView = findViewById(R.id.image_pizza_detail);
        nomTextView = findViewById(R.id.nom_pizza_detail);
        tempsPreparationTextView = findViewById(R.id.temps_preparation_detail);
        ingredientsTextView = findViewById(R.id.ingredients_detail);
        descriptionTextView = findViewById(R.id.description_detail);
        etapesTextView = findViewById(R.id.etapes_detail);

        String nom = getIntent().getStringExtra("nom");
        String description = getIntent().getStringExtra("description");
        String duree = getIntent().getStringExtra("duree");
        String ingredients = getIntent().getStringExtra("ingredients");
        String preparation = getIntent().getStringExtra("preparation");
        int image = getIntent().getIntExtra("image", 0);

        if (nom != null) {
            nomTextView.setText(nom);
        }
        if (image != 0) {
            imageView.setImageResource(image);
        }
        if (description != null) {
            descriptionTextView.setText(description);
        }
        if (duree != null) {
            tempsPreparationTextView.setText(duree);
        }
        if (ingredients != null) {
            ingredientsTextView.setText(ingredients);
        }
        if (preparation != null) {
            etapesTextView.setText(preparation);
        }
    }
}
