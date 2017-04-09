package com.company;

import java.util.Random;
import java.io.*;
import java.*;
public class Main {

    public static void main(String[] args) {
	// write your code here
         final int digNumber = 4;
         boolean guessed = false;
         int guessedNumber, cowsAm, bullsAm;
        Random randNumber = new Random();
        guessedNumber = randNumber.nextInt(999) + 1;
         while ( guessed!= true){
             try {
                 BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                 String age = reader.readLine();
                 int inputNum = Integer.parseInt(age);
                 if (inputNum == guessedNumber) {
                     guessed = true;
                 }
             }
             catch (IOException e) {

             }

         }

    }
}
