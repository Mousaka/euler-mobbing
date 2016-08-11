import org.junit.Test;

import static org.junit.Assert.*;

public class LargestPalindromProductTest {

   @Test
   public void testLarge(){
      LargestPalindromProduct.largestPalindromeProduct(3);
   }

   @Test
   public void testIsPalindrom(){
      assertTrue(LargestPalindromProduct.isPalindrome(11));
      assertFalse(LargestPalindromProduct.isPalindrome(10));
   }

   @Test
   public void isProductOfTwoFactors(){
      assertTrue(LargestPalindromProduct.isProductOfTwoFactors(2*3*4,3));
      assertFalse(LargestPalindromProduct.isProductOfTwoFactors(13,3));
   }
}