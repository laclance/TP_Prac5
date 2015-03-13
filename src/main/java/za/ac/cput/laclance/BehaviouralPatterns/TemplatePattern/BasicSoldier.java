package za.ac.cput.laclance.BehaviouralPatterns.TemplatePattern;

public class BasicSoldier extends Soldier
{
    @Override
    public String getType()
    {
        return "Basic Soldier";
    }

    @Override
    public int getDamage()
    {
        return 10;
    }
}
