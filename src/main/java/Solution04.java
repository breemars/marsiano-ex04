/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Breanna Marsiano
 */

import java.util.Scanner;

public class Solution04 {
    /*
    Create a madlib based on user input:
    - ask user for a noun, verb, adj, and adverb
    - input words as strings
    - output the madlib by combining the words into a sentence
     */
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        //Input noun
        System.out.print("Enter a noun: ");
        String noun = input.next();

        //Input verb
        System.out.print("Enter a verb: ");
        String verb = input.next();

        //Input adj
        System.out.print("Enter an adjective: ");
        String adjective = input.next();

        //Input adverb
        System.out.print("Enter an adverb: ");
        String adverb = input.next();

        //OUT - prints out the madlib
        System.out.printf("What does the %s %s enjoy doing %s? %s!", adjective, noun, adverb, verb);

    }

}
