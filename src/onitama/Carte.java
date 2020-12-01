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
    String Nom;
    int[][] motif = new int[5][5];
    public Carte(String LeNom , int[][] tabCoupsValides){
        for (int i=0; i<5; i++) {
            for (int j=0; j<5; j++) {
                motif[i][j]=0;
            }
    } //s
}
        for (int i = 0; i<tabCoupsValides.length ; i++) {   
            int x = tabCoupsValides[i][0];
            int y = tabCoupsValides[i][1];
            motif[x][y] = 1;     
            System.out.println("ajout de motif" + x + ", " + y + " sur " + LeNom)
}
}   

