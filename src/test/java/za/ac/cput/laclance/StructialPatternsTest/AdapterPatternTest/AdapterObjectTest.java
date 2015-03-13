package za.ac.cput.laclance.StructialPatternsTest.AdapterPatternTest;

import org.junit.Before;
import org.junit.Test;

import za.ac.cput.laclance.StructuralPatterns.AdapterPattern.*;
import static junit.framework.TestCase.assertEquals;

public class AdapterObjectTest
{
    SocketAdapter sa;
    Voltage volt;

    @Before
    public void setUp() throws Exception
    {
        sa = new SocketObjectAdapter();
        volt = sa.get12Volt();
    }

    @Test
    public void testAdapter() throws Exception
    {
        int expected = 12;
        int actual = volt.getVolts();
        assertEquals(expected, actual);
    }
}
