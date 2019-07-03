import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class CheckPowerTest {

    CheckPower obj;
    @Before
        public void setup()
        {
             obj = new CheckPower();
        }
        @After
        public void tearDown()
        {
            obj=null;
        }
    @Test(expected = NullPointerException.class)//Test case for null input
    public void givenNullShouldReturnNull(){

        boolean result=obj.isPower4(null);

    }
    @Test
    public void givenZeroShouldReturnFalse()//Test case for 0
    {

        boolean result=obj.isPower4((long) 0);
        assertEquals(false,result);
    }

    @Test
    public void givenNonPowerShouldReturnFalse()//Test case for non power of 4
    {

        boolean result=obj.isPower4((long) 14);
        assertEquals(false,result);
    }

    @Test
    public void givenPowerShouldReturnTrue()//Test case  for power of 4
    {
        boolean result=obj.isPower4((long) 64);
        assertEquals(true,result);
    }

}