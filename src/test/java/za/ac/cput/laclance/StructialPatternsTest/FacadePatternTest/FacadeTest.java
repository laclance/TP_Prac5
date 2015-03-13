package za.ac.cput.laclance.StructialPatternsTest.FacadePatternTest;

import za.ac.cput.laclance.StructialPatternsTest.FacadePatternTest.*;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.laclance.StructuralPatterns.FacadePattern.Facade;

import static org.junit.Assert.assertEquals;

public class FacadeTest
{
    Facade facade;

    @Before
    public void setUp()
    {
        facade = new Facade();
    }

    @Test
    public void testFacade()
    {
        int expected = 100000;
        int actual = facade.getMilli(1);

        assertEquals(expected, actual);
    }
}

