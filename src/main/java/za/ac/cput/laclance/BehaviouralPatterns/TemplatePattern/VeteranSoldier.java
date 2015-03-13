package za.ac.cput.laclance.BehaviouralPatterns.TemplatePattern;

public class VeteranSoldier extends Soldier
{
    @Override
    public String getType()
    {
        return "Veteran Soldier";
    }

    @Override
    public int getDamage()
    {
        return 50;
    }
}
