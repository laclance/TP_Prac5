package za.ac.cput.laclance.StructuralPatterns.ProxyTest;

public class Proxy {

	Item internationalItem;

	public Proxy() {
        System.out.println("Creating proxy...");
	}

	public String getCode() {
		if (internationalItem == null) {
            internationalItem = new ItemInter();
		}
        return internationalItem.getCode();
	}

}
