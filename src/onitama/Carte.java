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
public class Carte {
    int[][] tabDeplacement;
    String nom;
    // chaque carte possede un motif propre en fonction du type de carte ( dragon,ours etc...)
        public void Motifcarte(Carte laCarte, int[][] deplacementjoueur){        
        for (int i=0; i< deplacementjoueur.length; i++){
             int x = deplacementjoueur[i][0];
             int y = deplacementjoueur[i][1];
             laCarte.tabDeplacement[x][y]=1;       
            }
        } 
    public Carte(int[][] deplacement, String Nom){   
        
        int x = deplacement.length;
        
        deplacement = new int[x][2];
        for (int i = 0; i< deplacement.length; i++){
            for (int j = 0; j<2; j++){
                tabDeplacement[i][j] = deplacement[i][j];
            }
        }
        nom = Nom;
    }
    
   
    
}   
