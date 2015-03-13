package za.ac.cput.laclance.BehaviouralPatternsTest.TemplatePatternTest;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.laclance.BehaviouralPatterns.TemplatePattern.*;

import static org.junit.Assert.assertEquals;

public class TemplateTest {
    Soldier soldier;

    @Before
    public void setup()
    {
        soldier = new VeteranSoldier();
    }

    @Test
    public void testTemplate() throws Exception
    {
        String excpected = "Veteran Soldier does 50 damage";
        String actual = soldier.attack();

        assertEquals(excpected, actual);
    }
}
