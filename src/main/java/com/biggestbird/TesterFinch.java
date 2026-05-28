package com.biggestbird;

public class TesterFinch{
    public static void main(String[] args){

        FinalFinch bird = new FinalFinch("A");

        bird.setMove("F", 60, 100);
        bird.setTurn("L", 90,50);
        bird.setMove("F", 20, 50);
        bird.setTurn("L", 90, 50);
        bird.setMove("F", 60, 100);
        bird.setTurn("R", 90, 60);
        bird.setMove("F", 20, 50);
        bird.setTurn("R", 90, 50);

    }


}