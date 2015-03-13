package za.ac.cput.laclance.BehaviouralPatternsTest.MediatorPatternTest;

import org.junit.Before;
import org.junit.Test;
import za.ac.cput.laclance.BehaviouralPatterns.MediatorPattern.*;

import static org.junit.Assert.assertEquals;

public class MediatorTest {
    Mediator mediator;
    Converter frenchConverter;
    ConvertRequest convertRequest;
    DollarConverter dollarConverter;

    @Before
    public void setup()
    {
        mediator = new Mediator();
        frenchConverter = new ToMetersConverter(mediator);
        convertRequest = new ConvertRequest(mediator, 100.0f);
        dollarConverter = new DollarConverter(mediator);
    }

    @Test
    public void testTemplate() throws Exception
    {
        boolean expected = false;
        boolean actual = frenchConverter.attemptToPurchase(55.0f);

        assertEquals(expected, actual);
    }
}
