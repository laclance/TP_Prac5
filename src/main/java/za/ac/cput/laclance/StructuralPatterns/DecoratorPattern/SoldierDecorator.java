package za.ac.cput.laclance.StructuralPatterns.DecoratorPattern;

public abstract class SoldierDecorator implements Soldier {

	Soldier soldier;

	public SoldierDecorator(Soldier soldier) {
        this.soldier = soldier;
	}

}