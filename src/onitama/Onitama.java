/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;

import java.util.Scanner;

/**
 *
 * @author Jules
 */
public class Onitama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Création de l'objet scanner pour récupérer le nom des joueurs
        Scanner sc = new Scanner(System.in);
        
        //Premier joueur
        System.out.println("Saisir le nom du premier joueur");
        Joueur Joueur1 = new Joueur(sc.nextLine());
        
        //Deuxième joueur
        System.out.println("saisir le nom du second joueur");
        Joueur Joueur2 = new Joueur(sc.nextLine());
        
        //Création de la partie
        Partie game = new Partie();
        game.ListeJoueurs[0] = Joueur1;
        game.ListeJoueurs[1] = Joueur2;
        
    
}
}