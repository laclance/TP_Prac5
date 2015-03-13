package za.ac.cput.laclance.BehaviouralPatterns.ChainOfRespPattern;

public class GradeCHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
        if(request >= 60 & request < 70)
            return "C";
        else
            return successor.handleRequest(request);
    }
}
