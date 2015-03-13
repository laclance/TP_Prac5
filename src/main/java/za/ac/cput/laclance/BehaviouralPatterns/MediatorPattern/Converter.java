package za.ac.cput.laclance.BehaviouralPatterns.MediatorPattern;

public class Converter {

	Mediator mediator;
    int km;

	public Converter(Mediator mediator, int km) {
		this.mediator = mediator;
        this.km = km;
	}

	public int convert(String unit) {
		System.out.println("Converting " + km + " km to " + unit);
		return mediator.convert(km, unit);
	}
}