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
}
