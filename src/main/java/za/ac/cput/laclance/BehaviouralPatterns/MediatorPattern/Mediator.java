package za.ac.cput.laclance.BehaviouralPatterns.MediatorPattern;

public class Mediator {

    Converter CentiConverter;
    Converter MilliConverter;
    CheckConvert checkConvert;
	ConvertRequest convertRequest;

	public Mediator() {
	}

    public void registerCheck(CheckConvert checkConvert) {
        this.checkConvert = checkConvert;
    }

    public void registerRequest(ConvertRequest convertRequest) {
        this.convertRequest = convertRequest;
    }

    public void registerCentiConverter(Converter CentiConverter) {
		this.CentiConverter = CentiConverter;
	}

	public void registerMilliConverter(Converter MilliConverter) {
		this.MilliConverter = MilliConverter;
	}

	public int convert(int km, String unit) {
        if (checkConvert.check(km, unit))
		    return convertRequest.convert(km, unit);
        else
            return 0;
	}
}