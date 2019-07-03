import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class FileSizeTest {
    FileSize obj;
    @Before
    public void setup()
    {
        obj= new FileSize();
    }
    @After
    public void tearDown()
    {
        obj=null;
    }
    @Test
    public void givenFileShouldReturnCount()//test case for displaying file
    {
        FileSize obj=new FileSize();
        obj.displayFile();
    }

}