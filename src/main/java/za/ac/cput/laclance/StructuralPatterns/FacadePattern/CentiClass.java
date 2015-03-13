package za.ac.cput.laclance.StructuralPatterns.FacadePattern;

public class CentiClass {
    public int getCenti (MeterClass meters, int kilometers)
    {
        return meters.getMeters(kilometers) * 10;
    }
}
