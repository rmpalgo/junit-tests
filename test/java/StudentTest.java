import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student ron;

    @Before
    public void instantiateStudent() {
        ron = new Student(1L, "Ron");
    }


    @Test
    public void testCreateStudent() {
        Student jack = null;
        assertNull(jack);
        assertNotNull(ron);
    }

    @Test
    public void testFieldsStudent() {
        assertEquals(1, ron.getId());
        assertEquals("Ron", ron.getName());
        assertEquals(0, ron.getGrades().size());
        assertNotEquals(0, ron.getId());
        assertNotEquals("", ron.getName());
        assertNotEquals(1, ron.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        ron.addGrade(98);
        assertSame(98, ron.getGrades().get(0));
        ron.addGrade(99);
        assertSame(99, ron.getGrades().get(1));
        assertNotSame(ron.getGrades().get(0), ron.getGrades().get(1));
    }

    @Test
    public void testGetAverageGrade() {
        assertEquals(98.5, ron.getAverage(), 0);

    }




}
