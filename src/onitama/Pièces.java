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
    String TYPE;

    Pièces(String couleur, String type) {
        this.couleur = couleur;
        this.type = type;
    }
    
      
    public void Couleur(String uneCouleur){
        COULEUR=uneCouleur;
    }
}

