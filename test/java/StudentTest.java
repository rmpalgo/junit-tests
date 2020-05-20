import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class StudentTest {

    @Test
    public void testGetId() {
        assertEquals(0, Student.getId());
    }

    @Test
    public void testGetName() {
        assertEquals("", Student.getName());
    }


}
