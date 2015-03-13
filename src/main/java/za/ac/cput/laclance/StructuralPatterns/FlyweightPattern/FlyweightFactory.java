package za.ac.cput.laclance.StructuralPatterns.FlyweightPattern;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory
{
	private static FlyweightFactory flyweightFactory;
	private Map<String, Flyweight> flyweightPool;

	private FlyweightFactory()
    {
        flyweightPool = new HashMap<String, Flyweight>();
	}

	public static FlyweightFactory getInstance()
    {
		if (flyweightFactory == null)
			flyweightFactory = new FlyweightFactory();
		return flyweightFactory;
	}

	public Flyweight getFlyweight(String key)
    {
		if (flyweightPool.containsKey(key))
			return flyweightPool.get(key);
		else
        {
			Flyweight flyweight;

			if (key.equalsIgnoreCase("kg"))
				flyweight = new FlyweightKilos();
			 else
				flyweight = new FlyweightPounds();

			flyweightPool.put(key, flyweight);
			return flyweight;
		}
	}
}