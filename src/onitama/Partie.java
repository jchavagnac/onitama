/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mathi
 */
public class Partie {
    Joueur []ListeJoueurs = new Joueur[2];//deux joueurs
    Echiquier GrilleDeJeu;
    Joueur JoueurCourant;
    
    public void attribuerCouleurAuxJoueurs(Joueur Joueur1, Joueur Joueur2){
        String Couleur1 = "\u001B[31m"+"O"+"\u001B[0m"; //Couleur rouge en unicode
        String Couleur2 = "\u001B[34m"+"O"+"\u001B[0m"; //Couleur bleu en unicode
        
        Random r = new Random(); // Permet un choix aléatoire des couleurs
        int attribution = r.nextInt(2);
        if (attribution == 0){
            Joueur1.affecterCouleur(Couleur1);
            Joueur2.affecterCouleur(Couleur2);
        }
        else{
            Joueur1.affecterCouleur(Couleur2);
            Joueur2.affecterCouleur(Couleur1);
                   
        }
    
    
    }
    
    public void initialiserPartie(){
        
        //Création ou réinitialisation de la grille de jeu
        
        //Création de la grille de jeu
        if (this.GrilleDeJeu == null){
            GrilleDeJeu = new Echiquier();
        }
        
        //Réinitialisation de la grille de jeu
        else{
            GrilleDeJeu.viderGrille();
        }
    
    //attribution des pièces
        for(int i = 0; i<6; i++){
            //rajoute une pièce
            
            ListeJoueurs[0].ajouter_pieces(new Pièces(ListeJoueurs[0].couleur));
            ListeJoueurs[1].ajouter_pieces(new Pièces(ListeJoueurs[1].couleur));
        }
}
    public void debuterPartie(){
        //Lancement de la boucle de jeu
        boolean cajouemec = true; //Variable permettant de mettre fin a la partie
        Scanner scan = new Scanner(System.in);//Permet de récupérer la ligne jouée
        int iJ1 = 5; //Permet de selectionner la bonne case du tableau de jeton de Joueur 1
        int iJ2 = 5; //Permet de selectionner la bonne case du tableau de jeton de Joueur 2
        
        HashMap player = new HashMap();//Permet d'agir differemment dans la boucle en fonction du joueur
        player.put(ListeJoueurs[0],iJ1);
        player.put(ListeJoueurs[1],iJ2);
        
        int colonneSelectionnee;//Utilisée dans la boucle de jeu pour savoir quelle est la colonne sélectionnée
        int ligneSélectionnée;//Utilisée dans la boucle de jeu pour savoir quelle est la ligne sélectionnée
        
        //Acceuil des joueurs
        System.out.println("Bienvenue à toi "+ListeJoueurs[0].nom+"!");        
        System.out.println("Bienvenue à toi "+ListeJoueurs[1].nom+"!");
        
        GrilleDeJeu.afficherEchiquierSurConsole();
        //Lancement de la boucle de jeu
        while (cajouemec){
            //Pour chaque occurence de la boucle while, on parcours le tableau
            //ListeJoueurs pour faire jouer les deux joueurs
            for (Joueur i : ListeJoueurs) {
            }
 }
 }
}
    