package utsNax;

import java.util.Scanner;
import java.util.Vector;

public class Shop {
	
	Scanner scan = new Scanner(System.in);
	
	protected int choose;
	protected String name;
	protected String material;
	protected String material1;
	protected int damage;
	protected int price;
	
	Vector <smallSword> smallOrder = new Vector<>();
	Vector <bigSword> bigOrder = new Vector<>();
 	
	public Shop() {
		// TODO Auto-generated constructor stub
		do {
		System.out.println("Sword Craft");
		System.out.println("===========");
		Menu();
		System.out.println("Press enter to continue to main menu..");
		scan.nextLine();
		}while(choose !=3);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Shop();
	}
	
	public void Menu() {
		do {
			System.out.println("1. Forge a Sword");
			System.out.println("2. Forge a Big Sword");
			System.out.println("3. Exit");
			try {
				choose = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				choose = 0;
			}scan.nextLine();
		}while(choose!=1 && choose !=2 && choose!=3);
		
		if(choose ==1) {
			smallSword();
		}
		else if(choose ==2) {
			bigSword();
		}
		else if(choose ==3) {
			System.out.println("Thank you for using my program!");
			System.out.println("Press enter to exit program..");
			scan.nextLine();
			System.exit(1);
		}
	}

	private void smallSword() {
		// TODO Auto-generated method stub
		System.out.println("Sword Menu");
		System.out.println("==========");
		swordName();
		material();
		damage();
		displaySmallSword();
	}
	private void bigSword() {
		// TODO Auto-generated method stub
		System.out.println("Sword Menu");
		System.out.println("==========");
		swordName();
		material1();
		damage();
		displayBigSword();
	}
	
	private void swordName(){
		do {

			System.out.print("Input sword's name[minimal 5 characters] : ");
			name = scan.nextLine();
		}while(name.length()<5);
	}
	
	private void material() {
		do {
			System.out.print("Input material [Cobalt|Palladium|Mythril]: ");
			material = scan.nextLine();
		}while(!material.equals("Cobalt") && !material.equals("Palladium") && !material.equals("Mythril"));
	}
	
	private void material1() {
		do {
			System.out.print("Input material [Cobalt Ore|Palladium Ore|Mythril Ore]: ");
			material1 = scan.nextLine();
		}while(!material1.equals("Cobalt Ore") && !material1.equals("Palladium Ore") && !material1.equals("Mythril Ore"));
	}
	
	private void damage() {
		do {
			System.out.println("Input damage [1-100]: ");
			try {
				damage =scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				damage =0;
			}scan.nextLine();
		}while(damage<1 || damage>100);
	}
	
	private void displaySmallSword() {
		smallOrder.add(new smallSword(name, material, damage, price));
		System.out.println();
		System.out.println("Sword Specification");
		System.out.println("===================");
		for (smallSword smallSword : smallOrder) {
			System.out.println("Name	: " + smallSword.getName());
			System.out.println("Ore	: " + smallSword.getMaterial());
			System.out.println("Damage	: " + smallSword.getDamage());
			System.out.println("Price	: " + smallSword.getPrice());
			System.out.println();
		}
	}
	private void displayBigSword() {
		bigOrder.add(new bigSword(name, material1, damage, price));
		System.out.println();
		System.out.println("Sword Specification");
		System.out.println("===================");
		for (bigSword bigSword : bigOrder) {
			System.out.println("Name	: " + bigSword.getName());
			System.out.println("Ore	: " + bigSword.getMaterial());
			System.out.println("Damage	: " + bigSword.getDamage());
			System.out.println("Price	: " + bigSword.getPrice());
			System.out.println();
		}
	}
	
}



















