import java.util.Scanner;
import java.util.Vector;

public class Main {
	private String name;
	private String order;
	private String orderSize;
	private String orderType;
	private int orderRating;
	private int orderQuantity;
	private int totalPrice;
	private int reOrder;

	Scanner scan = new Scanner(System.in);

	Vector<Coffee> coffeeOrder = new Vector<>();
	Vector<cheeseCake> cheeseCakeOrder = new Vector<>();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}
	public Main() {
		List();
	}

	protected void List() {
		orderMenu();
		if(order.equals("Coffee")) {
			coffee();
		}
		else {
			cheeseCake();
		}
		reOrder();
	}
	//Choose Menu
	protected void orderMenu() {
		System.out.println("Fnbucks Coffee Shop");
		System.out.println("===================");
		do {
			System.out.print("Choose menu you want to order [Coffee | Cheese Cake]: ");
			order = scan.nextLine();
		}while(!order.equals("Coffee") && !order.equals("Cheese Cake"));
		System.out.println();
	}

	//function for coffee order
	protected void coffee() {
		System.out.println("Order Coffee:");
		System.out.println();
		name();
		orderSize();
		orderType();
		orderRating();
		orderQuantity();
		System.out.println("Order Coffee Success!");
		displayCoffee();

	}
	//function for cheese cake order
	protected void cheeseCake() {
		System.out.println("Order Cheese Cake:");
		System.out.println();
		name();
		orderRating();
		orderQuantity();
		System.out.println("Order Cheese Cake Success!");
		displayCheeseCake();
	}
	//Ask for another order
	protected void reOrder() {
		do {
			System.out.println("Re-Order");
			System.out.println("1. Yes");
			System.out.println("2. Exit");
			try {
				reOrder = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				reOrder = 0;
			}
			scan.nextLine();
			if(reOrder == 1) {
				System.out.println("");
				List();
			}
			else if (reOrder == 2) {
				System.out.println("Thank you for your order :D");
				System.exit(1);
			}
		}while(reOrder!=1 || reOrder!=2);
	}

	//Input Customer order
	protected void name() {
		do {
			System.out.print("Input order name [5..20 characters]: ");
			name = scan.nextLine();
		}while((name.length()<5 || name.length()>20) || !name.matches("^[a-z A-Z]*$"));
	}
	protected void orderSize() {
		do {
			System.out.print("Input order size [Small | Medium | Large]: ");
			orderSize = scan.nextLine();
		}while(!orderSize.equals("Small") && !orderSize.equals("Medium") && !orderSize.equals("Large"));
	}
	protected void orderType(){
		do {
			System.out.print("Input order type [Cold | Hot]: ");
			orderType = scan.nextLine();
		}while(!orderType.equals("Cold") && !orderType.equals("Hot"));
	}

	protected void orderRating() {
		do {
			System.out.print("Input order rating [1..4]: ");
			try {
				orderRating = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				orderRating = 0;
			}scan.nextLine();
		}while(orderRating < 1 || orderRating > 4);
	}

	protected void orderQuantity() {
		do {
			System.out.print("Input order quantity: ");
			try {
				orderQuantity = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				orderQuantity =0;
			}scan.nextLine();
		}while(orderQuantity<1);
	}

	// Display Order detail
	protected void displayCoffee() {
		coffeeOrder.add(new Coffee(name, orderRating, orderQuantity, orderSize, orderType, totalPrice));
		System.out.println("Coffee Order");
		System.out.println("===========================================================");
		System.out.print(String.format("|%-20s|", "        Name"));
		System.out.print(String.format("|%-10s|", " Quantity"));
		System.out.print(String.format("|%-10s|", "  Rating"));
		System.out.println(String.format("|%-10s|", "Total Price"));
		for (Coffee coffee : coffeeOrder) {
			System.out.print(String.format("|%-20s|", coffee.getName()));
			System.out.print(String.format("|    %-3d   |", coffee.getQuantity()));
			System.out.print(String.format("|%-10d|", coffee.getRating()));
			System.out.println(String.format("|%-10d |", coffee.totalPrice()));
		}
		System.out.println("===========================================================");
		int sum= 0;
		for (int i = 0; i < coffeeOrder.size(); i++) {
			sum = sum+coffeeOrder.get(i).totalPrice();
		}
		System.out.print(String.format("|%-45s|", "TOTAL"));
		System.out.println(String.format("%-11d|", sum));
		System.out.println("===========================================================");
		System.out.println("");
	}

	protected void displayCheeseCake() {
		cheeseCakeOrder.add(new cheeseCake(name, orderQuantity, orderRating, totalPrice));
		System.out.println("Cheese Cake Order");
		System.out.println("===========================================================");
		System.out.print(String.format("|%-20s|", "        Name"));
		System.out.print(String.format("|%-10s|", " Quantity"));
		System.out.print(String.format("|%-10s|", "  Rating"));
		System.out.println(String.format("|%-10s|", "Total Price"));
		for (cheeseCake cheeseCake : cheeseCakeOrder) {
			System.out.print(String.format("|%-20s|", cheeseCake.getName()));
			System.out.print(String.format("|    %-3d   |", cheeseCake.getQuantity()));
			System.out.print(String.format("|%-10d|", cheeseCake.getRating()));
			System.out.println(String.format("|%-10d |",cheeseCake.totalPrice()));
		}
		System.out.println("===========================================================");
		int sum= 0;
		for (int i = 0; i < cheeseCakeOrder.size(); i++) {
			sum = sum+coffeeOrder.get(i).totalPrice();
		}
		System.out.print(String.format("|%-45s|", "TOTAL"));
		System.out.println(String.format("%-11d|", sum));
		System.out.println("===========================================================");
		System.out.println("");
	}

}
