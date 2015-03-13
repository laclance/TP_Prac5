package za.ac.cput.laclance.StructialPatternsTest.CompositePatternTest;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.laclance.StructuralPatterns.CompositePattern.*;

import static org.junit.Assert.assertEquals;

public class CompositeTest
{
    Composite capetownPlaces;
    Composite durbanPlaces;

    @Before
    public void setUp() throws Exception
    {
        Leaf leaf1 = new Leaf("CTLibrary", "Cape Town");
        Leaf leaf2 = new Leaf("CTGym", "Cape Town");
        Leaf leaf3 = new Leaf("CTShop", "Cape Town");
        Leaf leaf4 = new Leaf("DGym", "Durban");
        Leaf leaf5 = new Leaf("DLibrary", "Durban");

        capetownPlaces = new Composite();
        capetownPlaces.add(leaf1);
        capetownPlaces.add(leaf2);
        capetownPlaces.add(leaf3);

        durbanPlaces = new Composite();
        durbanPlaces.add(leaf4);
        durbanPlaces.add(leaf5);
    }

    @Test
    public void testComposite()
    {
        String expected = "CTGym";
        String actual = capetownPlaces.getPlace(1).getPlace();

        assertEquals(expected, actual);
    }
}
