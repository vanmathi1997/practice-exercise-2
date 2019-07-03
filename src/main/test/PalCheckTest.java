import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

    public class PalCheckTest {
        PalCheck obj;
        @Before
        public void setup()
        {
            obj= new PalCheck();
        }
        @After
        public void tearDown()
        {

            obj=null;
        }
        @Test
        public  void givenPalStringShouldReturnTrue(){
            boolean result= PalCheck.isPalindrome("madam");//test case for palindrome
            assertEquals(true,result);

        }
        @Test
        public  void givenNonPalStringShouldReturnFalse(){
            boolean result= PalCheck.isPalindrome("Never");//test case for non palindrome
            assertEquals(false,result);

        }
        @Test(expected = NullPointerException.class)
        public  void givenNullStringShouldReturnNull(){
            boolean result= PalCheck.isPalindrome(null);//test case for null
        }

        @Test
        public  void givenNumbersStringShouldReturn(){
        boolean result= PalCheck.isPalindrome("12321");//test case for number palindrome
            assertEquals(true,result);


        }
    }




