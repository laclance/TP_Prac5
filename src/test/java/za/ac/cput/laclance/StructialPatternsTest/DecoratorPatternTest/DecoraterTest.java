package za.ac.cput.laclance.StructialPatternsTest.DecoratorPatternTest;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import za.ac.cput.laclance.StructuralPatterns.DecoratorPattern.*;

public class DecoraterTest {
    Soldier soldier;

    @Before
    public void setUp()
    {
        soldier = new BasicSolder();
        soldier = new SuperDecorator(soldier);
    }

    @Test
    public void testDecorator()
    {
        int expected = 10;
        int actual = soldier.attack();

        assertEquals(expected, actual);
    }
}
