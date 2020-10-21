
public class Coffee extends Menu{
	private String size;
	private String type;
	private int sizeNumber;
	private int totalPrice;
	public Coffee(String name, int rating, int quantity, String size, String type, int totalPrice) {
		super(name, rating, quantity);
		// TODO Auto-generated constructor stub
		this.size = size;
		this.type = type;
		this.setTotalPrice(totalPrice());
	}
	
	private int sizePrice() {
		if(size.equals("Small")) {
			sizeNumber = 1;
		}
		else if(size.equals("Medium")) {
			sizeNumber = 2;
		}
		else if(size.equals("Large")) {
			sizeNumber = 3;
		}
		return sizeNumber*5000;
	}
	
	@Override
	public int totalPrice() {
		// TODO Auto-generated method stub
		return ((basePrice()+sizePrice())*quantity);
	}
	
	
	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public int getSizeNumber() {
		return sizeNumber;
	}

	public void setSizeNumber(int sizeNumber) {
		this.sizeNumber = sizeNumber;
	}

	public int getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}

}
