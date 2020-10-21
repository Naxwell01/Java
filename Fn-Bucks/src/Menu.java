
public abstract class Menu {
	private String name;
	private int rating;
	protected int quantity;
	
	public Menu(String name, int rating, int quantity) {
		this.name = name;
		this.rating = rating;
		this.quantity = quantity;
	}
	public int basePrice() {
		return rating*10000;
	}
	
	public abstract int totalPrice();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
}
