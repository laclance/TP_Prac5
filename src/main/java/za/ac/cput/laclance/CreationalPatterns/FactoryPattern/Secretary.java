package za.ac.cput.laclance.CreationalPatterns.FactoryPattern;

public class Secretary implements Employee
{
    @Override
    public String role() {
        return "Secretary at CPUT";
    }
}
