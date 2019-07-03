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

        public void givenNameAgeSalaryShouldReturnSuccess()//Test case for all valid values
        {
    String result=obj.member_variable("mugen",27,(float)27.45);
    assertEquals("mugen2727.45",result);
        }
    @Test
    public void givenNullAgeSalaryShouldReturnException()//test case for null name
    {
        String result=obj.member_variable(null,27,(float)27.45);


    }
    @Test
    public void givenNameZeroSalaryShouldReturnSuccess()//test case for age zero
    {
        String result=obj.member_variable("mugen",0,(float)27.45);

    }


}