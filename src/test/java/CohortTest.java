import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import static org.junit.Assert.*;

public class CohortTest {

    Cohort emptyCohort;
    Cohort cohortWithOne;
    Cohort cohortWithMany;

    @Before
    public void setup(){

        emptyCohort = new Cohort();
        cohortWithOne = new Cohort();
        cohortWithMany = new Cohort();

        Student ron = new Student(1, "Ron");
        ron.addGrade(89);

        Student milo = new Student(2, "Milo");
        milo.addGrade(81);
        milo.addGrade(92);
        milo.addGrade(99);

        Student mia = new Student(3, "Mia");
        mia.addGrade(99);
        mia.addGrade(97);
        mia.addGrade(96);

        cohortWithOne.addStudent(ron);
        cohortWithMany.addStudent(ron);
        cohortWithMany.addStudent(milo);
        cohortWithMany.addStudent(mia);
    }

    @Test
    public void testAddStudentAndGetStudentsWork(){
        assertEquals(0, emptyCohort.getStudents().size());
        assertEquals(1, cohortWithOne.getStudents().size());
        assertEquals(3, cohortWithMany.getStudents().size());
        cohortWithMany.addStudent(new Student(3, "Jack"));
        assertEquals(4, cohortWithMany.getStudents().size());
    }

    @Test
    public void testIfAvgIsCorrect(){
        assertEquals(89, cohortWithOne.getCohortAverage(), 0);
        assertEquals(92.33, cohortWithMany.getCohortAverage(), 0.1);
    }

}
