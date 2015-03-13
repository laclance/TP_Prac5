package za.ac.cput.laclance.BehaviouralPatterns.MediatorPattern;

public class ToCentiConverter  extends Converter {
    public ToCentiConverter(Mediator mediator) {
        super(mediator, "cm");
        this.mediator.registerCentiConverter(this);
    }
}
