package za.ac.cput.laclance.StructuralPatterns.FlyweightPattern;

public class FlyweightPounds implements Flyweight
{
    String weight;
    public FlyweightPounds()
    {
        weight = "Lb";
    }

    @Override
    public String getWeight(int w) {
        return w * 2.20462 + " " +  weight;
    }
}
