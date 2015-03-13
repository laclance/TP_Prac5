package za.ac.cput.laclance.StructialPatternsTest.FlyweightPatternTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import za.ac.cput.laclance.StructuralPatterns.FlyweightPattern.*;

public class FlyweightTest
{
    FlyweightFactory flyweightFactory;
    Flyweight flyweightKg;

    @Before
    public void setUp()
    {
        flyweightFactory = FlyweightFactory.getInstance();
        flyweightKg = flyweightFactory.getFlyweight("kg");
    }

    @Test
    public void testFlyweight()
    {
        String expected = "22.67964547178199 Kg";
        String actual = flyweightKg.getWeight(50);

        assertEquals(expected, actual);
    }
}
