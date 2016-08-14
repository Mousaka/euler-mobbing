import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class SumOfPrimesTest {
   @Test
   public void sumOfPrimes() throws Exception {
      final long i = SumOfPrimes.sumOfPrimes(2000000);
      System.out.println(i);
   }

   @Test
   public void sumOfPrimesBellow10() throws Exception {
      final long i = SumOfPrimes.sumOfPrimes(10);
      System.out.println(i);
      assertTrue(i == 17);
   }
}