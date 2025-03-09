package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Factorizer {

    public ArrayList<Integer> primeFactors(Integer n) {
        ArrayList<Integer> prime = new ArrayList<>();
        if (n <= 1) {
            return prime;  
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
    
    
    
    public boolean isPrime(int n) {
      
        if (n <= 1) {
            return false; 
        }
        if (n <= 3) {
            return true; 
        }
        if (n % 2 == 0 || n % 3 == 0) {
            return false; 
        }
        
     
        for (int i = 5; i * i <= n; i += 6) {
            if (n % i == 0 || n % (i + 2) == 0) {
                return false;
            }
        }
        
        return true;
    }
    
    
 
    public boolean isComposite(int n) {
      
        if (n <= 1) {
            return false;
        }
        
       
        return !isPrime(n);
    }
    
    /**
      Reducing a fraction to its simplest form by dividing both the numerator and denominator
     by the GCD
     
     * @param numerator 
     * @param denominator 
     * @return 
     */
    public String reduce(int numerator, int denominator) {
      
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero");
        }
        
        if (numerator == 0) {
            return "0";
        }
        
    
        boolean isNegative = (numerator < 0 && denominator > 0) || (numerator > 0 && denominator < 0);
        numerator = Math.abs(numerator);
        denominator = Math.abs(denominator);
        
        
        int gcd = findGCD(numerator, denominator);
        
       
        int reducedNumerator = numerator / gcd;
        int reducedDenominator = denominator / gcd;
        
        
        String result;
        if (reducedDenominator == 1) {
            result = String.valueOf(reducedNumerator);
        } else {
            result = reducedNumerator + "/" + reducedDenominator;
        }
        
       
        return isNegative ? "-" + result : result;
    }
    
    
    private int findGCD(int a, int b) {
       
        Map<Integer, Integer> factorsA = getPrimeFactorsWithCounts(a);
        Map<Integer, Integer> factorsB = getPrimeFactorsWithCounts(b);
        
        
        int gcd = 1;
        for (Map.Entry<Integer, Integer> entry : factorsA.entrySet()) {
            int prime = entry.getKey();
            if (factorsB.containsKey(prime)) {
                int minCount = Math.min(entry.getValue(), factorsB.get(prime));
                for (int i = 0; i < minCount; i++) {
                    gcd *= prime;
                }
            }
        }
        
        return gcd;
    }
    
   
    private Map<Integer, Integer> getPrimeFactorsWithCounts(int n) {
        ArrayList<Integer> factors = primeFactors(n);
        Map<Integer, Integer> factorCounts = new HashMap<>();
        
        for (int factor : factors) {
            factorCounts.put(factor, factorCounts.getOrDefault(factor, 0) + 1);
        }
        
        return factorCounts;
      }
}