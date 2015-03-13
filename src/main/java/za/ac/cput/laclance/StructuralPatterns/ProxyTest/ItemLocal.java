package za.ac.cput.laclance.StructuralPatterns.ProxyTest;

import java.util.Random;

public class ItemLocal extends Item  {
    public ItemLocal()
    {
        Random randNum = new Random();
        itemCode = "L" + (randNum.nextInt(999999));
    }
}
