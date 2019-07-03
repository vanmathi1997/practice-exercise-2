import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class EvenCheckTest {
    EvenCheck obj;
    @Before
    public void setup()
    {
        obj= new EvenCheck();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }

    @Test
    public void givenOddNumberShouldReturnFalse()//test case for odd number
    {

        boolean result=obj.checkeven(3);
        assertEquals(false,result);
    }
    @Test
    public void givenEvenNumberShouldReturnTrue()//test case for even number
    {

        boolean result=obj.checkeven(4);
        assertEquals(true,result);
    }
    @Test(expected = NullPointerException.class)//test case for null
    public void givenNullShouldReturnNull()
    {

        boolean result=obj.checkeven(null);
    }
    @Test
    public void givenNegativeEvenShouldReturnTrue()//test case for negative even number
    {

        boolean result=obj.checkeven(-4);
        assertEquals(true,result);
    }

}