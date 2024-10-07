package com.example.pizzaapp.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log; // Import nécessaire pour utiliser Log
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import com.example.pizzaapp.R;
import com.example.pizzaapp.adapter.PizzaAdapter;
import com.example.pizzaapp.classes.Produit;
import com.example.pizzaapp.service.ProduitService;

import java.util.List;
public class ListPizzaActivity extends AppCompatActivity {

    private ProduitService produitService;
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_pizza);

        produitService = new ProduitService();

        produitService.create(new Produit("BARBECUED CHICKEN PIZZA", 3, R.drawable.pizza1, "35 min", "- 2 boneless skinless chicken breast halves...", "Description...", "STEP 1: ...\nSTEP 2: ...\nSTEP 3: ..."));
        produitService.create(new Produit("BRUSCHETTA PIZZA", 5, R.drawable.pizza2, "35 min", "- 1/2 pound reduced-fat bulk pork sausage...", "Description...", "STEP 1: ...\nSTEP 2: ...\nSTEP 3: ..."));
        produitService.create(new Produit("SPINACH PIZZA", 2, R.drawable.pizza3, "25 min", "- 1 package (6-1/2 ounces) pizza crust mix...", "Description...", "STEP 1: ...\nSTEP 2: ...\nSTEP 3: ..."));
        produitService.create(new Produit("DEEP-DISH SAUSAGE PIZZA", 8, R.drawable.pizza4, "45 min", "- 1 package (1/4 ounce) active dry yeast...", "Description...", "STEP 1: ...\nSTEP 2: ...\nSTEP 3: ..."));
        produitService.create(new Produit("HOMEMADE PIZZA", 4, R.drawable.pizza5, "50 min", "- 1 package (1/4 ounce) active dry yeast...", "Description...", "STEP 1: ...\nSTEP 2: ...\nSTEP 3: ..."));
        produitService.create(new Produit("PEPPERONI-SAUSAGE STUFFED PIZZA", 5, R.drawable.pizza10, "45 min", "- 1 package (1/4 ounce) active dry yeast...", "Description...", "STEP 1: ...\nSTEP 2: ...\nSTEP 3: ..."));

        listView = findViewById(R.id.liste);
        List<Produit> produits = produitService.findAll();
        PizzaAdapter pizzaAdapter = new PizzaAdapter(this, produits);
        listView.setAdapter(pizzaAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Produit selectedPizza = produits.get(position);

                // Créer un Intent pour démarrer PizzaDetailActivity
                Intent intent = new Intent(ListPizzaActivity.this, PizzaDetailActivity.class);

                // Passer les informations de la pizza via l'Intent
                intent.putExtra("nom", selectedPizza.getNom());
                intent.putExtra("description", selectedPizza.getDescription());
                intent.putExtra("duree", selectedPizza.getDuree());
                intent.putExtra("ingredients", selectedPizza.getDetaislngred());
                intent.putExtra("preparation", selectedPizza.getPreparation());
                intent.putExtra("image", selectedPizza.getPhoto());

                // Démarrer l'activité de détail
                startActivity(intent);
            }
        });
    }}
