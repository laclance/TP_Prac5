package za.ac.cput.laclance.BehaviouralPatterns.TemplatePattern;

public abstract class Soldier {
    public final String attack() {
		return getType() + " does " + getDamage() + " damage";
	}

	public abstract String getType();

	public abstract int getDamage();
}