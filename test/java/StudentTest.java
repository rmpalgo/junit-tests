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




}
