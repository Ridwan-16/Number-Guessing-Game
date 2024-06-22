package com.company;

//Solution using do while loop;

import java.util.Random;
import java.util.Scanner;
class game{
    private int a,b,c=0;

    public game(int n1,int n2) {
        Random random= new Random();
        a= random.nextInt(n1,n2);
    }
    public void getUserInput() {
        do {
            Scanner sc= new Scanner(System.in);
            System.out.println("Guess the nubmer: ");
            b = sc.nextInt();
            if (a>b) {
                System.out.println("Think for a biger number");
            }
            else if (a<b) {
                System.out.println("Think for a smaller number");
            }
            c++;
        }while (a!=b);

    }
    public void correctNumber() {
        System.out.println("Correct Guess");
    }

    public void numOfGuess(){
        System.out.println("total number of guesses: " +c);
        if (c<=3) {
            System.out.println("Pro player");
        }
        else if (c>3 && c<7) {
            System.out.println("Good player");
        }
        else {
            System.out.println("nice try but can do better");
        }
    }
}
public class GuessNumber {
    public static void main(String[] args) {
        game player= new game(0,100);
        player.getUserInput();
        player.correctNumber();
        player.numOfGuess();

    }
}
