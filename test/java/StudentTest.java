import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {
    private Student ron;

    @Before
    public void instantiateStudent() {
        ron = new Student(1L, "Ron");
        ron.addGrade(98);
        ron.addGrade(99);
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
        assertEquals(2, ron.getGrades().size());
        assertNotEquals(0, ron.getId());
        assertNotEquals("", ron.getName());
        assertNotEquals(3, ron.getGrades().size());
    }

    @Test
    public void testAddGrade() {
        assertSame(98, ron.getGrades().get(0));
        assertSame(99, ron.getGrades().get(1));
        assertNotSame(ron.getGrades().get(0), ron.getGrades().get(1));
    }

    @Test
    public void testGetAverageGrade() {
        assertEquals(98.5, ron.getAverage(), 0);
        assertNotEquals(100, ron.getAverage(), 0);
    }

    @Test
    public void testUpdateGrade() {
        ron.updateGrade(1, 98);
        assertSame(98, ron.getGrades().get(1));
        ron.updateGrade(0, 99);
        assertSame(99, ron.getGrades().get(0));

    }

    @Test
    public void testDeleteGrade() {
        ron.deleteGrade(1);
        assertSame(1, ron.getGrades().size());
        ron.addGrade(100);
        assertSame(2, ron.getGrades().size());
        ron.deleteGrade(0);
        assertSame(null, ron.getGrades().get(0));
    }




}
