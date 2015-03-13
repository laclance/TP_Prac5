package za.ac.cput.laclance.StructuralPatterns.ProxyTest;

import java.util.Random;

public class ItemInter extends Item {
    public ItemInter()
    {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Random randNum = new Random();
        itemCode = "I" + (randNum.nextInt(999999));
    }
}
