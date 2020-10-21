package utsNax;

public class smallSword extends sword{

	public smallSword(String name, String material, int damage, int price) {
		super(name, material, damage, price);
		// TODO Auto-generated constructor stub
	}
	public int Price() {
		return price = (damage*100) + materialPrice();
	}
	@Override
	public int materialPrice() {
		if(material.equals("Cobalt")) {
			materialPrice = 5000;
		}
		else if(material.equals("Palladium")) {
			materialPrice = 6000;
		}
		else if(material.equals("Mythril")) {
			materialPrice = 7000;
		}
		return materialPrice;
	}
}
