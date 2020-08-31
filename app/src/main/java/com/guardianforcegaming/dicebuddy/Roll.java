package com.guardianforcegaming.dicebuddy;

/**
 * Created by Jon on 4/8/2018.
 */

class Roll {
    private int result = 0;
    private int amount;
    private Dice dice;
    private int roll;
    private String rolls = " ";
    private boolean check = false;

    public Roll(Dice dice, int amount){
        this.dice = dice;
        this.amount = amount;

        if (amount > 0)
            check = true;
    }

    public int getResult(){
        for(int i = amount; i > 0; i--)
        {

            roll = dice.rollDice();
            result += roll;
            rolls += Integer.toString(roll);
            if(i > 1)
            {
                rolls += ", ";
            }
            else
            {
                rolls += " ";
            }
        }
        return result;
    }

    public String getRolls(){
        return rolls;
    }

    public boolean getCheck(){
        return check;
    }

}
