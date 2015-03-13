package za.ac.cput.laclance.StructuralPatterns.CompositePattern;

import java.util.ArrayList;

public class Composite implements Place
{
    ArrayList<Place> places = new ArrayList<Place>();

	@Override
    public void printPlace()
    {
		for (Place place : places)
			place.printPlace();
	}

    @Override
    public String getPlace()
    {
        String placeName = "";
        for (Place place : places)
            placeName += place.getPlace();
        return placeName;
    }


    public void add(Place place)
    {
		places.add(place);
	}

	public void remove(Place place)
    {
		places.remove(place);
	}

	public ArrayList<Place> getPlaces()
    {
		return places;
	}

	public Place getPlace(int index)
    {
		return places.get(index);
	}

}