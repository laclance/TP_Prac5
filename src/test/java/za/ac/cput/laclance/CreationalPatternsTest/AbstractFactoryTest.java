package za.ac.cput.laclance.CreationalPatternsTest;


import org.junit.Before;
import org.junit.Test;
import za.ac.cput.laclance.CreationalPatterns.AbstractFactoryPattern.FactoryProducer;
import za.ac.cput.laclance.CreationalPatterns.AbstractFactoryPattern.Subject;
import za.ac.cput.laclance.CreationalPatterns.AbstractFactoryPattern.SubjectsFactory;

import static org.junit.Assert.assertEquals;

public class AbstractFactoryTest {

    SubjectsFactory secondyrsubjectsFactory;
    @Before
    public void setUp() throws Exception {
        secondyrsubjectsFactory = FactoryProducer.getFactory("2nd");
    }

    @Test
    public void testFactory() throws Exception
    {
        Subject ds2 = secondyrsubjectsFactory.getSubjectName("DS");
        String expected = "Development Software 2";
        String actual = ds2.getSubjectName();

        assertEquals(expected, actual);
    }
}
