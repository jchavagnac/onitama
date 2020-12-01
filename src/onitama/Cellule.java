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
public class Cellule {
    Cellule cellules;
    Pièces pieceCourante;
    
    

    public Cellule(){
        pieceCourante=null;// on cree une cellule vide
    }


      public boolean affecterpiece(Pièces unepiece){
       if (pieceCourante!=null){
           System.out.println("Pièce déjà présente");// si il y a qqchose sur la case il ne peut pas en mettre
           return false;
       }
       else{
            pieceCourante=unepiece;// sinon la piece est placée dans la cellule
            return true;

       }
}
       public Pièces recupererPièce(){
        Pièces unepiece= pieceCourante; 
        pieceCourante=null;
        return unepiece;// renvoyé la piece qui a été ou non placer
    }
    public String lirecouleurpiece(){
        if(pieceCourante == null){
            return "vide";// pas de couleur envoyer nul sinon renvoyer la couleur
        }
        return pieceCourante.COULEUR;
 }     
    
}

