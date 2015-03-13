package za.ac.cput.laclance.BehaviouralPatterns.ChainOfRespPattern;

public abstract class GradeHandler
{
    GradeHandler successor;

    public void setSuccessor(GradeHandler successor)
    {
        this.successor = successor;
    }

    public abstract String handleRequest(int request);
}