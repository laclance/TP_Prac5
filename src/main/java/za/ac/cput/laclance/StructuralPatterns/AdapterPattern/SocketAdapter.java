package za.ac.cput.laclance.StructuralPatterns.AdapterPattern;

public interface SocketAdapter
{
    public Voltage get240Volt();
    public Voltage get12Volt();
    public Voltage get3Volt();
}