 package com;
import java.util.Scanner;
import java.util.Random;
class Game{
    int noOfGuess=0,input,genNum,flag=0;
    public void takeUserInput(){
        System.out.println("Enter the num between 0 to 100");
        Scanner sc =new Scanner(System.in);
         input = sc.nextInt();
    }
        public Game(){
            System.out.println("Welcome to Game");
         Random rand = new Random();
        genNum = rand.nextInt(101);
        }
         public void isCorrectNumber(){
        while (flag == 0) {
                if (input < genNum) {
                    System.out.println("Your number is smaller than genNum");
                    takeUserInput();
                    noOfGuess++;
                }
               else if (input > genNum) {
                    System.out.println("Your number is greater than genNum");
                    takeUserInput();
                    noOfGuess++;
               }
                   else{
                        flag=1;
                        noOfGuess++;
                        System.out.println("Winner");
                        System.out.println("The no. of guess"+noOfGuess);
                    }
                }
            }

        }

public class GuessNum {
    public static void main(String[] args) {
        /*
        create a class Game which allows a user to play "Guess the number"
        game once. Game should have the following methods
        1.Constructor to generate the random number
        2. takeUserInput() to take a user input of number
        3. isCorrectNumber() to detect whether the number entered by the user is true
        4. getter and setter for noOfGuess
        Use properties such as noOfGuess(int),etc to get this task done.
         */
        Game g = new Game();
        g.takeUserInput();
        g.isCorrectNumber();

    }
}