package za.ac.cput.laclance.BehaviouralPatterns.ChainOfRespPattern;

public class GradeBHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
        if (request > 70 & request < 75)
            return "B";
        else
            return successor.handleRequest(request);
    }
}