package org.example;

import java.util.ArrayList;

public class Factorizer {

    public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> prime = new ArrayList<>();

   if ( n <= 1) {
         return prime;  //returning the empty list if anything below 1 is entered.
     }

       
   while (n % 2 == 0) {
      prime.add(2);
      n /= 2;
      }


  for (int i = 3; i <= Math.sqrt(n); i += 2) {
    while (n % i == 0) {
     prime.add(i);
     n /= i; 
     }
  }

        
   if (n > 2) {
     prime.add(n);
     }

   return new ArrayList<>(prime);

    }
  }
