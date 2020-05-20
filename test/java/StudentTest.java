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
    public void testGetId() {
        assertEquals(0, ron.getId());
    }

    @Test
    public void testGetName() {
        assertEquals(null, ron.getName());
    }




}
