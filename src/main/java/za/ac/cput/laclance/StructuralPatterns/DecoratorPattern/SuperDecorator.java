package za.ac.cput.laclance.StructuralPatterns.DecoratorPattern;

import java.util.Random;

public class SuperDecorator extends SoldierDecorator {

	public SuperDecorator(Soldier soldier) {
        super(soldier);
	}

	@Override
	public int attack() {
        return soldier.attack() * superAttack();
	}

	public int superAttack() {
        return 2;
	}

}