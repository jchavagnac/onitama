/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package onitama;
import java.util.Random;
/**
 *
 * @author Jules
 */
public class pioche {
    Carte[] Pioche = new Carte[16];
    
    public pioche()  {
    
        int[][] tabCobra = {{1,1},{1,-1},{-1,0}};
        Carte carteCobra = new Carte (tabCobra, "carte Cobra");
        Pioche[0] = carteCobra;
        
        int[][] tabBoar = {{1,0},{-1,0},{0,1}};
        Carte carteBoar = new Carte (tabBoar, "carte Boar");
        Pioche[1] = carteBoar;
        
        int[][] tabCrab = {{2,0},{-2,0},{0,1}};
        Carte carteCrab = new Carte (tabCrab, "carte Crab");
        Pioche[2] = carteCrab; 
        
        int[][] tabFrog = {{1,-1},{-1,1},{-2,0}};
        Carte carteFrog = new Carte (tabFrog, "carte Frog");
        Pioche[3] = carteFrog;
        
        int[][] tabCarteCrane = {{1,-1},{-1,-1},{0,1}};
        Carte carteCrane = new Carte (tabCarteCrane, "carteCrane");
        Pioche[4] = carteCrane;
    
        int[][] tabCarteDragon = {{-1,-1},{1,-1},{2,1},{-2,1}};
        Carte carteDragon = new Carte (tabCarteDragon, "carte Dragon");
        Pioche[5] = carteDragon;

        int[][] tabFox = {{1,0},{0,-1},{0,1}};
        Carte carteFox = new Carte (tabFox, "carteFox");
        Pioche[6] = carteFox;

        int[][] tabElephant = {{1,0},{1,1},{-1,0},{-1,1}};
        Carte carteElephant = new Carte (tabElephant, "carte Elephant");
        Pioche[7] = carteElephant;
        
        int[][] tabEel = {{1,0},{-1,1},{-1,-1}};
        Carte carteEel = new Carte (tabEel, "carte Eel");
        Pioche[8] = carteEel;
        
        int[][] tabCarteHorse = {{0,1},{0,-1},{-1,0}};
        Carte carteHorse = new Carte (tabCarteHorse, "carte Horse");
        Pioche[9] = carteHorse;
        
        int[][] tabTiger = {{0,1},{0,2}};
        Carte carteTiger = new Carte (tabTiger, "carte Tiger");    
        Pioche[10] = carteTiger;

        int[][] tabGoose = {{1,0},{1,-1},{-1,0},{-1,1}};
        Carte carteGoose = new Carte (tabGoose, "carte Goose");
        Pioche[11] = carteGoose;
        int[][] tabMonkey = {{1,1},{1,-1},{-1,1},{-1,-1}};
        Carte carteMonkey = new Carte (tabMonkey, "carte Monkey");
        Pioche[12] = carteMonkey;
        int[][] tabMantis = {{1,1},{-1,1},{0,-1}};
        Carte carteMantis = new Carte (tabMantis, "carte Mantis");
        Pioche[13] = carteMantis;

        

        int[][] tabRabbit = {{1,1},{2,0},{-1,-1}};
        Carte carteRabbit = new Carte (tabRabbit, "carte Rabbit");
        Pioche[14] = carteRabbit;

        int[][] tabRooster = {{1,1},{1,0},{-1,0},{-1,-1}};
        Carte carteRooster = new Carte (tabRooster, "carte Rooster");
        Pioche[15] = carteRooster;

        
    }
    public void melangerlaPioche(Carte [] Pioche) {
        for (int i=0; i<25;i++){ 
// on melange la pioche en changeant de place dans le "tableau" 25 fois 2 cartes choisies au hasard
            Random R = new Random();
            int A = R.nextInt(15);
            Random R1 = new Random();
            int A1 = R1.nextInt(15);
            Carte temp;
            temp = Pioche[A1];
            Pioche[A] = Pioche[A1];
            Pioche[A1] = temp;        
        }
    }
}