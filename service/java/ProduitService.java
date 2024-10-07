package com.example.pizzaapp.service;

import com.example.pizzaapp.classes.Produit;
import com.example.pizzaapp.dao.IDao;

import java.util.ArrayList;
import java.util.List;

public class ProduitService implements IDao<Produit> {
    private List<Produit> pizzas = new ArrayList<>();

    @Override
    public void create(Produit produit) {
        pizzas.add(produit);  
    }

    @Override
    public void delete(Produit produit) {
        pizzas.remove(produit);  
    }

    @Override
    public void update(Produit produit) {
        Produit p = findById(produit.getId());
        if (p != null) {
            p.setNom(produit.getNom());
            p.setComp(produit.getComp());
            p.setDescription(produit.getDescription());
            p.setDuree(produit.getDuree());
        }
    }

    @Override
    public Produit findById(int id) {
        for (Produit p : pizzas) {
            if (p.getId() == id) {
                return p; 
            }
        }
        return null;  
    }

    @Override
    public List<Produit> findAll() {
        return pizzas;  
    }
}
