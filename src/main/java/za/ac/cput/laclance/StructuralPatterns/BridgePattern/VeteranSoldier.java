package za.ac.cput.laclance.StructuralPatterns.BridgePattern;

public class VeteranSoldier extends Soldier {

    public VeteranSoldier(Gun gun) {
        this.skill = 2;
        this.gun = gun;
    }

    @Override
    public int doDamage() {
        int damage = gun.getDamage();
        return getDamage(damage);
    }

}
