# Projet : Gestion de Pizza 🍕

## Description

Le projet **Gestion de Pizza** est une application Android permettant de gérer un catalogue de pizzas. Les utilisateurs peuvent visualiser la liste des pizzas disponibles et consulter leurs détails. L'application est développée en Java avec Android Studio.

## Fonctionnalités

- **Affichage de la liste des pizzas** : Chaque pizza affiche son nom, une image, et la durée de préparation.
- **Affichage des détails d'une pizza** : Détails sur la composition, la description et les étapes de préparation.
- **Splash Screen** : Un écran de démarrage avec un logo animé.

**Remarque :** La fonctionnalité de suppression des pizzas par appui long n'est pas implémentée dans cette version du projet.

## Organisation du Projet

Le projet est organisé en plusieurs répertoires pour une meilleure gestion du code. Chaque répertoire contient des fichiers Java ou XML associés aux différentes fonctionnalités de l'application.

### Structure des répertoires

- **Tp2/**
  - **activities/** : Contient les activités principales de l'application.
    - `java` : Les classes Java pour les différentes activités Android.
    - `res/layout` : Les fichiers XML de mise en page associés aux activités.
  - **adapter/** : Contient les classes d'adaptateurs utilisés pour afficher les données dans les listes (ListView).
    - `java` : Les adaptateurs Java pour les listes.
    - `res/layout` : Les fichiers XML associés aux éléments des listes.
  - **classes/** : Contient les modèles de données utilisés dans l'application.
    - `java` : Les classes Java représentant les données, comme `Produit` pour les pizzas.
    - `res/layout` : Fichiers XML associés aux modèles de données, s'il y en a.
  - **dao/** : Contient la gestion des données (Data Access Objects).
    - `java` : Les classes Java pour l'accès aux données (DAO).
    - `res/layout` : Layout XML, s'il y en a, associés à la gestion des données.
  - **service/** : Contient la logique métier et les services de l'application.
    - `java` : Les classes Java pour la gestion des services comme `ProduitService`.
    - `res/layout` : Layout XML pour la gestion des services, s'il y en a.

### Détails des Répertoires

- **activities/** : Ce répertoire contient les activités principales de l'application telles que `ListPizzaActivity`, `PizzaDetailActivity`, et `SplashActivity`. Chaque activité est liée à une interface utilisateur définie dans les fichiers XML du répertoire `res/layout`.

- **adapter/** : Les classes d'adaptateurs, comme `PizzaAdapter`, sont responsables de l'affichage des pizzas dans une `ListView`. Ces classes récupèrent les données des pizzas et les adaptent pour être affichées dans la liste.

- **classes/** : Contient les classes Java définissant les objets du modèle de données, comme `Produit`, qui représente une pizza avec ses attributs (nom, durée, image, description, etc.).

- **dao/** : Le répertoire `dao` contient les classes Java utilisées pour accéder et manipuler les données des pizzas. Le fichier `IDao.java` définit les interfaces pour les opérations CRUD (Create, Read, Update, Delete).

- **service/** : Ce répertoire contient la logique métier principale de l'application, notamment les services pour gérer les pizzas, comme `ProduitService`, qui gère l'ajout, la suppression, et la recherche des pizzas.

## Installation et Exécution

### Prérequis

- **Android Studio** : Assurez-vous d'avoir Android Studio installé sur votre machine.
- **SDK Android** : Les SDK nécessaires pour l'exécution d'une application Android.

### Étapes pour exécuter le projet

1. Clonez ce repository sur votre machine locale :

   ```bash
   git clone https://github.com/votre-nom-utilisateur/Tp2.git
