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
        assertEquals(0, ron.getId());
        assertEquals("", ron.getName());
        assertEquals(1, ron.getGrades().size());
    }




}
