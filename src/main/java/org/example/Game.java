package org.example;

public class Game {

    int rolled[]=new int[22];
    int currentball=0;
    public void roll(int pins) {

        rolled[currentball]=pins;
        currentball++;
    }
    int thisball=0;

    public int score() {
        int score=0;
        for (int i=0;i<10;i++){
            if(rolled[thisball]==10){
                score+=10+rolled[thisball+1]+rolled[thisball+2];
                thisball+=1;
            }
            else if(rolled[thisball]+rolled[thisball+1]==10){


                score+=10+rolled[thisball+2];
                thisball+=2;
            }
            else {
                score += rolled[thisball] + rolled[thisball+ 1];
                thisball+=2;
            }
        }
        return score;
    }
}
