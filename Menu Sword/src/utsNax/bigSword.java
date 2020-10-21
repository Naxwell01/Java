package utsNax;

public class bigSword extends sword{

	public bigSword(String name, String material, int damage, int price) {
		super(name, material, damage, price);
		// TODO Auto-generated constructor stub
	}
	public int Price() {
		return price = (damage*100) + materialPrice();
	}
	@Override
	public int materialPrice() {
		if(material.equals("Cobalt Ore")) {
			materialPrice = 8000;
		}
		else if(material.equals("Palladium Ore")) {
			materialPrice = 9000;
		}
		else if(material.equals("Mythril Ore")) {
			materialPrice = 10000;
		}
		return materialPrice;
	}
}
