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
public class Echiquier {
    Pièces pieceCourante;
    Cellule [][]Cellules = new Cellule[5][5];
    
    
     public Echiquier(){// constructeur grille qui crée les cellules
        for (int i=0;i<6;i++){
            for (int j=0;j<7;j++){
                Cellules[i][j]=new Cellule();
            }
        }
    }
    public void afficherGrilleSurConsole(){// affichage
        for (int i=0; i <6; i++) { 
            for (int j =0;j < 7; j++){
                if (Cellules[i][j].pieceCourante != null) {                   
                    System.out.print(Cellules[i][j].pieceCourante);
                }
                
            }  
        }System.out.println();// afficher le tout
    }
    
    public void viderGrille(){ //Cette méthode vide la grille de son contenu
        for (int i=1; i<6;i++){
            for (int j=1;j<7;j++){
                   Cellules[i][j]=null;
            }
    }
}
}
