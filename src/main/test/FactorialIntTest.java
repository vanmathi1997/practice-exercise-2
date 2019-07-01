import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FactorialIntTest {
    FactorialInt obj;
    @Before
    public void setup()
    {
        obj= new FactorialInt();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }

    @Test
    public void givenNumberShouldReturnResult()
    {
        assertEquals(120,obj.printFactorial((long) 5));
    }
    @Test
    public void givenZeroShouldReturnZero()
    {
        assertEquals(0,obj.printFactorial((long) 0));
    }
    @Test(expected = NullPointerException.class)
    public void givenNullShouldReturnNull()
    {

        obj.printFactorial(null);

    }



}