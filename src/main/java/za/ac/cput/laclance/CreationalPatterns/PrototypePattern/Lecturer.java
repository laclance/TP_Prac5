package za.ac.cput.laclance.CreationalPatterns.PrototypePattern;

public class Lecturer implements CloneObject
{
    private String name;

    public Lecturer(String name)
    {
        this.name = name;
    }

    @Override
    public CloneObject makeCopy()
    {
        return new Lecturer(name);
    }

    @Override
    public String toString()
    {
        return "Lecturer{" +
        "name='" + name + '\'' +
        '}';
    }
}