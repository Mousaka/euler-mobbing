import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LatticeTest {
   @Test
   public void twoGrid() throws Exception {
      assertEquals(6, new Lattice(2).start());
   }

   @Test
   public void threeGrid() throws Exception {
      assertEquals(20, new Lattice(3).start());
   }

   @Test
   public void fourGrid() throws Exception {
      assertEquals(70, new Lattice(4).start());
   }
}