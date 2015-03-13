package za.ac.cput.laclance.CreationalPatternsTest;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import za.ac.cput.laclance.CreationalPatterns.PrototypePattern.*;

public class PrototypeTest
{
    Subject sub;
    Subject sub2;

    @Before
    public void setUp() throws Exception
    {
        sub = new Subject("TP002");
        sub2 = (Subject)sub.makeCopy();
    }

    @Test
    public void testPrototype() throws Exception
    {
        assertNotEquals(sub.hashCode(), sub2.hashCode());
    }

    @Test
    public void testPrototype2() throws Exception
    {
        assertEquals(sub.toString(), sub2.toString());
    }
}
