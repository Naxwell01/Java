
public class cheeseCake extends Menu{
	
	private int totalPrice;
	public cheeseCake(String name, int rating, int quantity, int totalPrice) {
		super(name, rating, quantity);
		this.setTotalPrice(totalPrice());
		// TODO Auto-generated constructor stub
	}

	@Override
	public int totalPrice() {
		// TODO Auto-generated method stub
		return (basePrice()*quantity);
	}

	public int getTotalPrice() {
		return totalPrice;
	}
	
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
}

