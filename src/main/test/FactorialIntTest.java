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
    public void givenNumberShouldReturnResult()//Test case for number
    {
        assertEquals(120,obj.printFactorial((long) 5));
    }
    @Test
    public void givenZeroShouldReturnOne()//test case for zero

    {
        assertEquals(1,obj.printFactorial((long) 0));
    }
    @Test(expected = NullPointerException.class)//test case for null
    public void givenNullShouldReturnNull()
    {

        obj.printFactorial(null);

    }



}