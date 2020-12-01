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
    caze [][]Cellules = new caze[5][5];
    
    
    public Echiquier(){
        
        for (int i = 1; i<5; i++){
            for (int j = 0; j<6; j++){
                Cellules[i][j]=new caze(null,false,false);
            }
        }
    }
    public void temple(){
        Cellules[0][2]=templebleu;
        Cellules[4][2]=templerouge;
    }
}
