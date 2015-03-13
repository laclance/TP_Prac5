package za.ac.cput.laclance.StructuralPatterns.FlyweightPattern;

public class FlyweightKilos implements Flyweight
{
    String weight;
    public FlyweightKilos()
    {
        weight = "Kg";
    }

    @Override
    public String getWeight(int w) {
        return w / 2.20462 + " " + weight;
    }
}
