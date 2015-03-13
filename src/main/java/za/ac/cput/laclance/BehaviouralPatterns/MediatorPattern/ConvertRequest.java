package za.ac.cput.laclance.BehaviouralPatterns.MediatorPattern;

public class ConvertRequest {

	Mediator mediator;

	public ConvertRequest(Mediator mediator) {
		this.mediator = mediator;
		this.mediator.registerRequest(this);
	}

	public int convert(int km, String unit) {
		if (unit.equals("cm"))
			return km / 10000;
        else
            return km / 100000;
	}
}