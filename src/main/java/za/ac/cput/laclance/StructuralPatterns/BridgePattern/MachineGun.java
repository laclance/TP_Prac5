package za.ac.cput.laclance.StructuralPatterns.BridgePattern;

public class MachineGun implements Gun{
    private int damage;

    public MachineGun()
    {
        damage = 300;
    }

    @Override
    public int getDamage() {
        return damage;
    }
}
