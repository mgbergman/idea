package com.company;

public class Main {

    public static void main(String[] args) {

        int position = calculateHighScorePosition(1000);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(900);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(400);
        displayHighScorePosition("Tim", position);

        position = calculateHighScorePosition(50);
        displayHighScorePosition("Tim", position);

    }

        public static void displayHighScorePosition (String name,int position){
            System.out.println(name + " managed to get into position " + position + " on the high score table");
        }
        public static int calculateHighScorePosition ( int score){
            int position;
            if (score >= 1000) {
                return 1;
            }
            if (score > 500 ); {
                return 2;
            }
            if (score > 100) {
                return 3;
            } else{
                return 4;
            }

        }
    }

