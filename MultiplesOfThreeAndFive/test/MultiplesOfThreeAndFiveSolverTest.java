import org.junit.Test;

import static org.junit.Assert.*;

public class MultiplesOfThreeAndFiveSolverTest {
   @Test
   public void sumOfMultiples() throws Exception {
      assertTrue(new MultiplesOfThreeAndFiveSolver().sumOfMultiples(10) == 23);
   }

   @Test
   public void sumOfMultiplesWithDuplicates() throws Exception {
      assertEquals(60, new MultiplesOfThreeAndFiveSolver().sumOfMultiples(16));
   }

   @Test
   public void printSumOfMultiples() throws Exception {
      assertEquals(233168, new MultiplesOfThreeAndFiveSolver().sumOfMultiples(1000));
   }



}