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
public class Pièces {
    String COULEUR;
    

public Pièces(String couleur) { //constructeur
    
    COULEUR = couleur;
    
}
public String lireCouleur(){ //retourne la couleur
        return COULEUR;
    }
@Override
    public String toString(){// les couleurs des joueurs 
        if("Rouge".equals(COULEUR))// rouge pour le joueur 2
            return "\u001B[31m O "; // jaune pour le j1
        return "\u001B[33m O ";
    }
}
