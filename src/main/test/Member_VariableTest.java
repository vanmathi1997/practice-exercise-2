import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class Member_VariableTest {
    Member_Variable obj;
    @Before
    public void setup()
    {
        obj= new Member_Variable();
    }
    @After
    public void tearDown()
    {

        obj=null;
    }
    @Test

        public void givenParametersShouldReturnSuccess()
        {
    Member_Variable obj=new Member_Variable();
    String result=obj.member_variable("mugen",27,(float)27.45);
    assertEquals("Success",result);
        }

}