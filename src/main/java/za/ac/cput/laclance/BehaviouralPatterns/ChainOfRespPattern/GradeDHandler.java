package za.ac.cput.laclance.BehaviouralPatterns.ChainOfRespPattern;

public class GradeDHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
        if(request >= 50 & request < 60)
            return "D";
        else
            return successor.handleRequest(request);
    }
}