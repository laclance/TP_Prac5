package za.ac.cput.laclance.CreationalPatternsTest;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.laclance.CreationalPatterns.FactoryPattern.EmployeeFactory;
import za.ac.cput.laclance.CreationalPatterns.FactoryPattern.Employee;

import static org.junit.Assert.assertEquals;

public class FactoryTest
{
    EmployeeFactory ef;

    @Before
    public void setUp() throws Exception
    {
        ef = EmployeeFactory.getEmployeeFactoryInstance();
    }

    @Test
    public void testFactory() throws Exception
    {
        Employee lect = ef.getEmployeeRole("lecturer");

        String expected = "Lecturer at CPUT";
        String actual = lect.role();

        assertEquals(expected, actual);

    }
}
