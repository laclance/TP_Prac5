package za.ac.cput.laclance.StructuralPatterns.BridgePattern;

public abstract class Soldier {

    Gun gun;
    int skill;

    public abstract int doDamage();

    public void setGun(Gun gun) {
        this.gun = gun;
    }

    public int getDamage(int damage) {
        return skill * damage;
    }

}
