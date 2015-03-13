package za.ac.cput.laclance.StructialPatternsTest.BridgePatternTest;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.laclance.StructuralPatterns.BridgePattern.*;

import static org.junit.Assert.assertEquals;

public class BridgeTest {
    Soldier soldier;

    @Before
    public void setUp()
    {
        soldier = new VeteranSoldier(new HandGun());
    }

    @Test
    public void testFlyweight()
    {
        int expected = 100;
        int actual = soldier.doDamage();

        assertEquals(expected, actual);
    }
}
