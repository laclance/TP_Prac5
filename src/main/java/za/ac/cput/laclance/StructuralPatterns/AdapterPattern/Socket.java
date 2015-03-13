package za.ac.cput.laclance.StructuralPatterns.AdapterPattern;

public class Socket
{
    public Voltage getVoltage()
    {
        return new Voltage(240);
    }
}