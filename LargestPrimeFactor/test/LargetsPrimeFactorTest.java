import org.junit.Test;

import static org.junit.Assert.*;



public class LargetsPrimeFactorTest {

   @Test
   public void isPrimeTest() {
      assertTrue(LargetsPrimeFactor.isPrime(29));
      assertFalse(LargetsPrimeFactor.isPrime(9));
   }

   @Test
   public void largestPrimeTest13195() {
      assertEquals(29, LargetsPrimeFactor.getLargestPrimeFactor(13195));

   }

   @Test
   public void largestPrimeTest600851475143() {
      //assertEquals(29, LargetsPrimeFactor.getLargestPrimeFactor(13195));
      System.out.println(LargetsPrimeFactor.getLargestPrimeFactor(new Long("600851475143")));
   }

   @Test
   public void largestPrimeTestTemp() {
      //assertEquals(29, LargetsPrimeFactor.getLargestPrimeFactor(13195));
      System.out.println(LargetsPrimeFactor.getLargestPrimeFactor(new Long("51475143")));
   }

}