package utsNax;

public abstract class sword {
	protected String name;
	protected String material;
	protected int damage;
	protected int price;
	protected int materialPrice;
	
	public sword(String name, String material, int damage, int price) {
		this.name = name;
		this.material = material;
		this.damage = damage;
		this.price = Price();
	}
	public abstract int materialPrice();
	
	public int Price() {
		return price = (damage*100) + materialPrice();
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getMaterialPrice() {
		return materialPrice;
	}

	public void setMaterialPrice(int materialPrice) {
		this.materialPrice = materialPrice;
	}
	
	

	
}
