package za.ac.cput.laclance.BehaviouralPatterns.ChainOfRespPattern;

public class GradeEHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
        if(request >= 40 & request < 50)
            return "E";
        else
            return successor.handleRequest(request);
    }
}
