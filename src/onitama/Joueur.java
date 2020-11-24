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
   int nombrePiècesrestant;
   
public Joueur(String Nom){
       nom = Nom;
       
   }
public void affecterCouleur(String Couleur){
       this.couleur = Couleur;
   }
   
}
