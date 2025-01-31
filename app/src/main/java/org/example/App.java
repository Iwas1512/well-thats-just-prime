//Author: @Anlil Iwas
//Instructor : Cyrys Vandrevala
//Date 01/30/25

package org.example;


public class App {
  public static void main(String[] args) {


    System.out.println("Hello! Welcome to my Prime Lab! We will find factors of numbers in this lab! ");
    System.out.println("we will utilize testing in this lab, using JUNIT");
    

    Factorizer factorizer = new Factorizer();

   
    System.out.println("For  Factors of 25: " + factorizer.primeFactors(25)); 
    System.out.println("For Factors of 1: " + factorizer.primeFactors(1)); //should return empty
    System.out.println("For Factors of -9: " + factorizer.primeFactors(-9)); //should return empty
    System.out.println("For Factors of 100: " + factorizer.primeFactors(100));
    
  }
}
