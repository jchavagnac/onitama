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
    
    
    public Carte(String Nom){        
        for (int i = 0; i<5; i++){
            for (int j = 0; j<5; j++){
                tabDeplacement[i][j] = 0;
            }
        }
    }
    
    public void Motifcarte(Carte laCarte){        
        for (int i=0; i< tabDeplacement.length; i++){
             int x = tabDeplacement[i][0];
             int y = tabDeplacement[i][1];
             laCarte.tabDeplacement[x][y]=1;       
            }
        }    
    
}   
