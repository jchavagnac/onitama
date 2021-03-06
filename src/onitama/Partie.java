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
    pioche piochePartie = new pioche();
    Pièces []Listepièce = new Pièces[5];
    Pièces roi = (rouge, roi);
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
    public void placerPieces(){
        if (listeJoueurs[0].couleur.equals("Bleu")){
            
            GrilleDeJeu.Cellules[0][2].pieceCourante = ListeJoueurs[0].Listepièce[0];
            GrilleDeJeu.Cellules[0][0].pieceCourante = ListeJoueurs[0].listePieces[1];
            GrilleDeJeu.Cellules[0][1].pieceCourante = ListeJoueurs[0].listePieces[2];
            GrilleDeJeu.Cellules[0][3].pieceCourante = ListeJoueurs[0].listePieces[3];
            GrilleDeJeu.Cellules[0][4].pieceCourante = ListeJoueurs[0].listePieces[4];

            GrilleDeJeu.Cellules[4][2].pieceCourante = ListeJoueurs[1].listePieces[0];
            GrilleDeJeu.Cellules[4][0].pieceCourante = ListeJoueurs[1].listePieces[1];
            GrilleDeJeu.Cellules[4][1].pieceCourante = ListeJoueurs[1].listePieces[2];
            GrilleDeJeu.Cellules[4][3].pieceCourante = ListeJoueurs[1].listePieces[3];
            GrilleDeJeu.Cellules[4][4].pieceCourante = ListeJoueurs[1].listePieces[4];
        }
        else{
            GrilleDeJeu.Cellules[0][2].pieceCourante = ListeJoueurs[1].listePieces[0];
            GrilleDeJeu.Cellules[0][0].pieceCourante = ListeJoueurs[1].listePieces[1];
            GrilleDeJeu.Cellules[0][1].pieceCourante = ListeJoueurs[1].listePieces[2];
            GrilleDeJeu.Cellules[0][3].pieceCourante = ListeJoueurs[1].listePieces[3];
            GrilleDeJeu.Cellules[0][4].pieceCourante = ListeJoueurs[1].listePieces[4];

            GrilleDeJeu.Cellules[4][2].pieceCourante = ListeJoueurs[0].listePieces[0];
            GrilleDeJeu.Cellules[4][0].pieceCourante = ListeJoueurs[0].listePieces[1];
            GrilleDeJeu.Cellules[4][1].pieceCourante = ListeJoueurs[0].listePieces[2];
            GrilleDeJeu.Cellules[4][3].pieceCourante = ListeJoueurs[0].listePieces[3];
            GrilleDeJeu.Cellules[4][4].pieceCourante = ListeJoueurs[0].listePieces[4];
        }
}
    public void afficherCartesJoueur(Joueur unJoueur){
        for (int i=0; i<2; i++){
            System.out.println(unJoueur.listeCartes[i].nom);
            for (int j = 0; j < unJoueur.listeCartes[i].tabDeplacement.length; j++){
                for (int k = 0; k < unJoueur.listeCartes[i].tabDeplacement[j].length; k++){
                    System.out.print(unJoueur.listeCartes[i].tabDeplacement[j][k]);
                }System.out.println();            
            }
        } System.out.println();
        System.out.println();
    }
    
    public void echangerCarte(Joueur joueurCourant, int numeroCarte ){        
        Carte temp = joueurCourant.listeCartes[numeroCarte-1];
        joueurCourant.listeCartes[numeroCarte-1] = GrilleDeJeu.Echiquier;
        GrilleDeJeu.Echiquier = temp;               
    }
    public void tasserPioche(){
        
        for (int i=0; i < piochePartie.Pioche.length-1; i++){
            piochePartie.Pioche[i] = piochePartie.Pioche[i+1];            
        }
        piochePartie.Pioche[piochePartie.Pioche.length-1] = null;
    }
    public void piocherCarte(Joueur unJoueur){        
        for (int i=0; i < unJoueur.listeCartes.length; i++){
            unJoueur.listeCartes[i] = piochePartie.Pioche[0];
            tasserPioche();
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
            
            ListeJoueurs[0].ajouterpieces(new Pièces());
            ListeJoueurs[1].ajouterpieces(new Pièces());
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
                
                JoueurCourant = i;
                
                boolean valide = false;
                
                while ( valide != true){
                
                    System.out.println("C'est au tour de " + JoueurCourant.nom + " de jouer.\n"
                            + JoueurCourant.nom+" possède 5 pions et un roi"
                            + " \n-Pour jouer, rentre la ligne,enter, puis la colonne de la pièce que tu souhaites déplacer"
                            + " \n-dans un second temps, enter, rentre la ligne, enter, puis la colonne de ou tu souhaites déplacer la pièce");
                
                    //Tour de jeu du joueur
                
                
                    int ligneA = scan.nextInt()-1;
                    int colA = scan.nextInt()-1;
                    int ligneB = scan.nextInt()-1;
                    int colB = scan.nextInt()-1;
                
                    if ((ligneA<6 && 0<ligneA) && (ligneB<6 && 0<ligneB)&& (colA<6 && 0<colA)&& (colB<6 && 0<colB)){ // Pour l'instant ca mais idéalement pour col A et ligne A,
                    //vérifier que la position choisie correspond bien à une pièce du joueur.
                    
                        valide=true;
                    }else {
                        System.out.println("Veuillez choisir des colonnes et lignes entre 1 et 5");
                    }
                // DEPLACEMENT DU PION
                
                //CAS 1 : la case est vide
                if (GrilleDeJeu.Cellules[ligneB][colB].pieceCourante == null) { // Ce qu'on fait ici est que l'on prend la case ou l'on souhaite deplacer la piece,
                    String[] piece=GrilleDeJeu.lirepiece(ligneA,colA);          //on copie la piece sur cette case puis on supprime la pièce sur l'ancienne.
                    String couleur=piece[0];
                    String type=piece[1];
                     = new Pièces(couleur,type);
                    GrilleDeJeu.deplacerpiece(ligneB,colB,type);
                    GrilleDeJeu.casenull(ligneA, colA);
                
                }
                else{
                    if ( {//pièce appartient au adverse joueur){
                            
                        //CAS 2 : il y a un pion sur la case
                        // sous CAS 1 : c'est un pion
                        // sous CAS 2 : c'est un roi (Winning time)
                        // sous CAS 3 : c'est une pièce appartenant au joueur courant
                
                //CAS 3 : le roi bouge sur la case du temple (Winning time)
                
                if (GrilleDeJeu.Cellules[ligneB][colB] == GrilleDeJeu.Cellules[4][2]) {
                //victoire pour le joueur mais depend de quel joueur
                        }
                if (GrilleDeJeu.Cellules[ligneB][colB] == GrilleDeJeu.Cellules[0][2]) {
                //victoire pour le joueur mais depend de quel joueur 
                        }
                    }
                    else{
                        
                    }
                }
}  
            }
        }
    }
}
