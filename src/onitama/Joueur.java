/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;

/**
 *
 * @author mathi
 */
public class Joueur {
   
   String nom;
   String couleur;
   Pièces []ListePièces = new Pièces[5];
   Carte[] listeCartes = new Carte[2];
   int nombrePiècesrestant;
   Joueur[] ListeJoueurs;
   ;
   
public Joueur(String Nom){
       this.nom = Nom;
     
   }
public void affecterCouleur(String Couleur){
       this.couleur = Couleur;
   }
    public void ajouterpieces(Pièces jeton){ // chaque joueurs possede 5 pions dont 1 roi
        for (int i=0; i<4; i++){            
            this.ListePièces[i] = new Pièces();
            this.ListePièces[i].TYPE = "Pion";
        }
        this.ListePièces[5] = new Pièces();
        this.ListePièces[5].TYPE = "Roi";
    }
}
