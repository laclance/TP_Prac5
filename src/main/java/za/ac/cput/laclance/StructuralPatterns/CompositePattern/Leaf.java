package za.ac.cput.laclance.StructuralPatterns.CompositePattern;

public class Leaf implements Place
{
    String name;
	String location;

    public Leaf(String name, String location)
    {
        this.name = name;
        this.location = location;
    }

    @Override
	public void printPlace()
    {
		System.out.println(name);
	}

    @Override
    public String getPlace()
    {
        return name;
    }
}