package com.example.pizzaapp.classes;

public class Produit {

    private int id;
    private String nom;
    private int nbrIngredients;
    private int photo;
    private String duree;
    private String detaislngred;
    private String description;
    private String preparation;
    private int comp;

    public Produit(String nom, int nbrIngredients, int photo,String duree, String detaislngred, String description, String preparation) {
        this.nom = nom;
        this.nbrIngredients = nbrIngredients;
        this.photo = photo;
        this.duree = duree;
        this.detaislngred = detaislngred;
        this.description = description;
        this.preparation = preparation;

    }
<
    public Produit() {
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getNbrIngredients() {
        return nbrIngredients;
    }

    public void setNbrIngredients(int nbrIngredients) {
        this.nbrIngredients = nbrIngredients;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }

    public String getDetaislngred() {
        return detaislngred;
    }

    public String getDuree() {
        return duree;
    }

    public void setDuree(String duree) {
        this.duree = duree;
    }


    public void setDetaislngred(String detaislngred) {
        this.detaislngred = detaislngred;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPreparation() {
        return preparation;
    }

    public void setPreparation(String preparation) {
        this.preparation = preparation;
    }

    public int getComp() {
        return comp;
    }

    public void setComp(int comp) {
        this.comp = comp;
    }

    @Override
    public String toString() {
        return "Produit{" +
                "nom='" + nom + '\'' +
                ", nbrIngredients=" + nbrIngredients +
                ", photo=" + photo +
                ", duree=" + duree +
                ", detaislngred='" + detaislngred + '\'' +
                ", description='" + description + '\'' +
                ", preparation='" + preparation + '\'' +
                ", comp=" + comp +
                '}';
    }
}
