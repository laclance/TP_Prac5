package za.ac.cput.laclance.StructuralPatterns.AdapterPattern;

public class SocketObjectAdapter implements SocketAdapter
{
    private Socket sock = new Socket();

    @Override
    public Voltage get240Volt()
    {
        return sock.getVoltage();
    }

    @Override
    public Voltage get12Volt()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 20);
    }

    @Override
    public Voltage get3Volt()
    {
        Voltage v = sock.getVoltage();
        return convertVolt(v, 80);
    }

    private Voltage convertVolt(Voltage v, int i)
    {
        return new Voltage(v.getVolts() / i);
    }
}