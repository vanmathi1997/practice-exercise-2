import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StudentGradesTest {
    StudentGrades grades ;
    int [] array = {66,72,83,64,75};
    @Before
    public void setUp()
    {
        grades = new StudentGrades();
    }

    @After
    public void tearDown() {

        grades = null;
    }

    @Test
    public void testgivenArrayShouldReturnMaximum()
    {
        int actual = grades.maximum(array,5);
        assertEquals(83,actual);
    }

    @Test
    public void testgivenArrayShouldReturnMinimum()
    {

        int actual = grades.minimum(array,5);
        assertEquals(64,actual);
    }

    @Test
    public void testgivenArrayShouldReturnAverage()
    {
        double actual = grades.average(array,5);
        assertEquals(72,actual,0);
    }

}