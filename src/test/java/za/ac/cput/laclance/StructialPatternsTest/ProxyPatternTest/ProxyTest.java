package za.ac.cput.laclance.StructialPatternsTest.ProxyPatternTest;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;
import za.ac.cput.laclance.StructuralPatterns.ProxyTest.*;

public class ProxyTest {
    Item LocalItem;
    Proxy internationalItem;

    @Before
    public void setUp() throws Exception {
        LocalItem = new ItemLocal();
        internationalItem = new Proxy();
    }

    @Test
    public void testProxy() throws Exception {
        char expected = 'I';
        char actual = internationalItem.getCode().charAt(0);
        assertEquals(expected, actual);
    }
}
