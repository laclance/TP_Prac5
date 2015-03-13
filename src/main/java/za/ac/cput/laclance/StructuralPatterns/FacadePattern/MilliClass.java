package za.ac.cput.laclance.StructuralPatterns.FacadePattern;

public class MilliClass {
    public int getMilli (MeterClass meters, CentiClass centi, int kilometers)
    {
        return centi.getCenti(meters, kilometers) * 10;
    }
}
