package za.ac.cput.laclance.BehaviouralPatterns.MediatorPattern;

public class CheckConvert
{
    Mediator mediator;

    public CheckConvert(Mediator mediator) {
        this.mediator = mediator;
        mediator.registerCheck(this);
    }

    public boolean checkCenti(int km)
    {
        if (km < 100000)
            return true;
        else
            return false;
    }

    public boolean checkMilli(int km)
    {
        if (km < 10000)
            return true;
        else
            return false;
    }

    public boolean check(int km, String unit)
    {
       if (unit.equals("cm"))
           return checkCenti(km);
        else
           return checkMilli(km);
    }
}
