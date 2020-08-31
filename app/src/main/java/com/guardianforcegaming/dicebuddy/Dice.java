package com.guardianforcegaming.dicebuddy;

import java.util.Random;

public class Dice {
    private Random rand;
    private int faces;

    public Dice(int faces){
       this.faces = faces;
       rand = new Random();
    }
    public int rollDice(){
        int num;
        num = rand.nextInt(faces) + 1;
       return num;
    }


}
