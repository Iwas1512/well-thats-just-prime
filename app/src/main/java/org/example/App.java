//Author: @Anlil Iwas
//Instructor : Cyrys Vandrevala
//Date 01/30/25
//Add-Ons 03/06/25

package org.example;


public class App {
  public static void main(String[] args) {
    System.out.println("Hello! Welcome to my Prime Lab! We will find factors of numbers in this lab! ");
    System.out.println("We will utilize testing in this lab, using JUNIT");
    
    Factorizer factorizer = new Factorizer();
    
    System.out.println("For Factors of 25: " + factorizer.primeFactors(25));
    System.out.println("For Factors of 1: " + factorizer.primeFactors(1)); 
    System.out.println("For Factors of -9: " + factorizer.primeFactors(-9)); 
    System.out.println("For Factors of 100: " + factorizer.primeFactors(100));
    
  
    System.out.println("\n--- Composite Number Check ---");
    System.out.println("Is 36 composite? " + factorizer.isComposite(36));
    System.out.println("Is 12 composite? " + factorizer.isComposite(12));
    System.out.println("Is 17 composite? " + factorizer.isComposite(17));
    System.out.println("Is 1 composite? " + factorizer.isComposite(1));
    System.out.println("Is 0 composite? " + factorizer.isComposite(0));
   
    System.out.println("\n--- Fraction Reduction ---");
    System.out.println("36/12 reduces to: " + factorizer.reduce(36, 12));
    System.out.println("12/12 reduces to: " + factorizer.reduce(12, 12));
    System.out.println("12/14 reduces to: " + factorizer.reduce(12, 14));
    System.out.println("12/37 reduces to: " + factorizer.reduce(12, 37));
    System.out.println("42/48 reduces to: " + factorizer.reduce(42, 48));
  }
} 
