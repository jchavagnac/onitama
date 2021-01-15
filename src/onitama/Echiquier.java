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
  
    public void afficherEchiquierSurConsole(){
            for (int i=0; i <5; i++) { 
                for (int j=0;j < 5; j++){
                    if (Cellules[i][j].pieceCourante != null) {                   
                        if (Cellules[i][j].pieceCourante.TYPE.equals("King"))
                            System.out.print("\u001B[0m K ");
                        else{
                           System.out.print("\u001B[0m P "); 
                        }
                    }else if(Cellules[i][j].templeRouge==true){
                        System.out.print("\u001B[0m R ");
                    }
                    else if(Cellules[i][j].templeBleu==true){
                        System.out.print("\u001B[0m B ");
                    }
                    
                    else{
                        System.out.print("\u001B[0m X ");
                }  
            }System.out.println();
        }
    }
    public void viderGrille(){ //Cette méthode vide la grille de son contenu
        for (int i=1; i<6;i++){
            for (int j=1;j<7;j++){
                   Cellules[i][j]=null;
            }
    }
}

    void deplacerpiece(int ligneA, int colA, Pièces piece) { 
        Cellules[ligneA][colA].affecterpiece(piece);
    }

    void casenull(int ligneA, int colA) { 
        Cellule cvide = new Cellule();
        Cellules[ligneA][colA]=cvide; //remplace la cellule avec une cellule vide nouvellement crée
    }

    public String[] lirepiece(int ligneA, int colA) {
        String[] tab = new String[2];
        tab[0]=Cellules[ligneA][colA].lirecouleurpiece();
        tab[1]=Cellules[ligneA][colA].liretypepiece();
        return tab; // Lirepiece Renvoie un tableau contenant en [0] la couleur et en [1] le type de la pièce. ["vide","vide"] si case vide.
    }
}