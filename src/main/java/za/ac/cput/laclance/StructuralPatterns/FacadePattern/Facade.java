package za.ac.cput.laclance.StructuralPatterns.FacadePattern;

public class Facade {

	public int getMeters(int k) {
        MeterClass MClass = new MeterClass();
		return MClass.getMeters(k);
	}

	public int getCenti(int k) {
        MeterClass MClass = new MeterClass();
		CentiClass CMClass = new CentiClass();
		return CMClass.getCenti(MClass, k);
	}

	public int getMilli(int k) {
        MeterClass MClass = new MeterClass();
        CentiClass CMClass = new CentiClass();
        MilliClass MMClass = new MilliClass();
		return MMClass.getMilli(MClass, CMClass, k);
	}

}