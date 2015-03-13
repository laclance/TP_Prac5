package za.ac.cput.laclance.BehaviouralPatterns.MediatorPattern;

public class ToMetersConverter extends Converter {

	public ToMetersConverter(Mediator mediator) {
        super(mediator, "mm");
		this.mediator.registerMilliConverter(this);
	}
}