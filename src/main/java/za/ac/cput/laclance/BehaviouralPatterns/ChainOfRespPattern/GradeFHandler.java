package za.ac.cput.laclance.BehaviouralPatterns.ChainOfRespPattern;

public class GradeFHandler extends GradeHandler
{
    @Override
    public String handleRequest(int request)
    {
            return "F";
    }
}
