package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.ArrayList;
import java.util.Arrays;

class FactorizerTest {
  @Test
  void itReturnsAnEmptyListForZero() {
    Factorizer factorizer = new Factorizer();
    assertEquals(factorizer.primeFactors(0), new ArrayList());
  }

  @Test
    void itReturnsAnEmptyListForOne() {
      Factorizer factorizer = new Factorizer();
      assertEquals( factorizer.primeFactors(1), new ArrayList());
    }

  @Test
    void itReturnsCorrectPrimeNumber() {
      Factorizer factorizer = new Factorizer();
      assertEquals(new ArrayList<>(Arrays.asList(17)), factorizer.primeFactors(17));
    }

  @Test
    void itReturnsCorrectForCompositeNumber() {
     Factorizer factorizer = new Factorizer();
     assertEquals(new ArrayList<>(Arrays.asList(2, 2, 5, 5)), factorizer.primeFactors(100));
    }

  @Test
    void itReturnsCorrectForAnotherCompositeNumber() {
      Factorizer factorizer = new Factorizer();
      assertEquals(new ArrayList<>(Arrays.asList(2, 19)), factorizer.primeFactors(38));
    }

  @Test
    void itReturnsCorrectSmallerPrimeNumber() {
      Factorizer factorizer = new Factorizer();
      assertEquals(new ArrayList<>(Arrays.asList(3)), factorizer.primeFactors(3));
    }
    void testReduceFunction() {
      Factorizer factorizer = new Factorizer();
      
    
      assertEquals("3", factorizer.reduce(36, 12));
      assertEquals("1", factorizer.reduce(12, 12));
      assertEquals("2", factorizer.reduce(8, 4));
      
     
      assertEquals("6/7", factorizer.reduce(12, 14));
      assertEquals("12/37", factorizer.reduce(12, 37));
      assertEquals("3/4", factorizer.reduce(9, 12));
      

      assertEquals("7/8", factorizer.reduce(42, 48));
      assertEquals("101/103", factorizer.reduce(101, 103));
      

      assertEquals("-3/4", factorizer.reduce(-9, 12));
      assertEquals("-3/4", factorizer.reduce(9, -12));
      assertEquals("3/4", factorizer.reduce(-9, -12));
      

      assertEquals("0", factorizer.reduce(0, 5));
  }
  
  @Test
  void testIsPrimeFunction() {
      Factorizer factorizer = new Factorizer();
      
 
      assertTrue(factorizer.isPrime(2));
      assertTrue(factorizer.isPrime(3));
      assertTrue(factorizer.isPrime(5));
      assertTrue(factorizer.isPrime(7));
      assertTrue(factorizer.isPrime(11));
      assertTrue(factorizer.isPrime(13));
      assertTrue(factorizer.isPrime(17));
      assertTrue(factorizer.isPrime(23));
      assertTrue(factorizer.isPrime(29));
      
  
      assertFalse(factorizer.isPrime(0));
      assertFalse(factorizer.isPrime(1));
      assertFalse(factorizer.isPrime(4));
      assertFalse(factorizer.isPrime(6));
      assertFalse(factorizer.isPrime(8));
      assertFalse(factorizer.isPrime(9));
      assertFalse(factorizer.isPrime(10));
      assertFalse(factorizer.isPrime(12));
      assertFalse(factorizer.isPrime(15));
  }
}

