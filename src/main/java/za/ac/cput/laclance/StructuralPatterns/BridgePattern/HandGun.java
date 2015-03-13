package za.ac.cput.laclance.StructuralPatterns.BridgePattern;

public class HandGun  implements Gun{
    private int damage;

    public HandGun()
    {
        damage = 50;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
