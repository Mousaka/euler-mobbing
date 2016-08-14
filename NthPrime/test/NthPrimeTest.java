import org.junit.Test;

import java.util.OptionalInt;

import static org.junit.Assert.assertTrue;

public class NthPrimeTest {
   @Test
   public void start() throws Exception {
      final OptionalInt start = NthPrime.start();
      assertTrue(start.isPresent());
      System.out.println(start);
   }
}