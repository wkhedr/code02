package edu.fci;

import java.util.Random;

public class Die {
    private int value;
    private int sides;

    public Die(int sides) {
        this.sides = sides;
    }
    public void Roll(){
        Random rnd = new Random();
        value = rnd.nextInt(sides)+1;
    }

    public int getValue() {
        return value;
    }

    public int getSides() {
        return sides;
    }

    public void setSides(int sides) {
        this.sides = sides;
    }
}
