import org.junit.Test;

import java.util.OptionalInt;

import static org.junit.Assert.assertTrue;

public class SmallestMultipleTest {
   @Test
   public void start() throws Exception {
      final OptionalInt value = SmallestMultiple.start();
      System.out.println(value);
      assertTrue(value.isPresent());
      assertTrue(value.getAsInt() == 232792560);
   }
}