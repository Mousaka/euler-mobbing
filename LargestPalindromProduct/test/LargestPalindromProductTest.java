import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LargestPalindromProductTest {
   @Test
   public void start() throws Exception {
      System.out.println(LargestPalindromProduct.start());
   }

   @Test
   public void testIsPalindrom(){
      assertTrue(LargestPalindromProduct.isPalindrome(11));
      assertFalse(LargestPalindromProduct.isPalindrome(10));
   }
}