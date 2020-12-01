/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;

import java.util.Random;

/**
 *
 * @author mathi
 */
public class Partie {
    Joueur []ListeJoueurs = new Joueur[2];
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
    }