package za.ac.cput.laclance.BehaviouralPatternsTest.ChainOfRespPatternTest;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import za.ac.cput.laclance.BehaviouralPatterns.ChainOfRespPattern.*;

public class ChainOfRespTest
{
    GradeHandler chain;

    @Before
    public void setUp()
    {
        chain = setUpChain();
    }

    public GradeHandler setUpChain()
    {
        GradeHandler AHandler = new GradeAHandler();
        GradeHandler BHandler = new GradeBHandler();
        GradeHandler CHandler = new GradeCHandler();
        GradeHandler DHandler = new GradeDHandler();
        GradeHandler EHandler = new GradeEHandler();
        GradeHandler FHandler = new GradeFHandler();

        AHandler.setSuccessor(BHandler);
        BHandler.setSuccessor(CHandler);
        CHandler.setSuccessor(DHandler);
        DHandler.setSuccessor(EHandler);
        EHandler.setSuccessor(FHandler);

        return AHandler;
    }

    @Test
    public void testChainOfResp()
    {
        String expected = "C";
        String actual = chain.handleRequest(68);

        assertEquals(expected, actual);
    }
}
