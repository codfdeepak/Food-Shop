package FoodShop;

import java.util.Scanner;

public class FoodShop {

	public Food  selectFood()
	{
		System.out.println("=== Pizza prize = 60rs/1 piece  ===  || === Burger prize = 120rs/1 piece ===");
		System.out.println("=== Samosa Prize = 15rs/1 piece ===  || === Coke   Prize = 50rs/Bottle   ===");
		System.out.println("::                                                                          ::");
		System.out.println(":: Press 1 for Pizza  || Press 2 for Burger || Press 3 for Samosa || Press 4 For Coke ::");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("You have selected Pizza");
			System.out.println("Enter  the Quantity of Pizza::");
			int count=sc.nextInt();
			int totalCost=count*60;
			System.out.println("Tatal Cost is: "+totalCost+":: Plese Complete Your Payment ::");
			int pay=sc.nextInt();
					
			if(pay==totalCost)
			{
				System.out.println("Collect Your "+count+" Pieces Pizza and Enjoy");
				Pizza p1=new Pizza();
				p1.eat();	
			}
			else if(pay>totalCost)
			{
				System.out.println("Collect Your "+count+" Pieces Pizza and Remains "+(pay-totalCost)+" Cash From Counter");
				Pizza p1=new Pizza();
				p1.eat();
			}
			else {
				System.out.println("Insuficiet Amount Payed");
				return selectFood();
			}
			
			Pizza p1=new Pizza();
			return p1;
		}
		else if(choice==2)
		{
			System.out.println("You have selected Burger");
			System.out.println("Enter  the Quantity of Burger::");
			int count=sc.nextInt();
			int totalCost=count*120;
			System.out.println("Tatal Cost is: "+totalCost+"rs :: Plese Complete Your Payment ::");
			int pay=sc.nextInt();
					
			if(pay==totalCost)
			{
				System.out.println("Collect Your "+count+" Pieces Burger and Enjoy");
				Burger b1=new Burger();
				b1.eat();	
			}
			else if(pay>totalCost)
			{
				System.out.println("Collect Your "+count+" Pieces Burger and Remains "+(pay-totalCost)+"rs From Counter");
				Burger b1=new Burger();
				b1.eat();	
			}
			else {
				System.out.println("Insuficiet Amount Payed");
				return selectFood();
			}
			Burger b1=new Burger();
			return b1;
		}
		else if(choice==3)
		{
			System.out.println("You have selected Samosa");
			System.out.println("Enter  the Quantity of Samosa::");
			int count=sc.nextInt();
			int totalCost=count*15;
			System.out.println("Tatal Cost is: "+totalCost+":: Plese Complete Your Payment ::");
			int pay=sc.nextInt();
					
			if(pay==totalCost)
			{
				System.out.println("Collect Your "+count+" Pieces Pizza and Enjoy");
				Samosa s1=new Samosa();
				s1.eat();	
			}
			else if(pay>totalCost)
			{
				System.out.println("Collect Your " +count+" Pieces Samosa and Remains "+(pay-totalCost)+"rs From Counter");
				Samosa s1=new Samosa();
				s1.eat();	
			}
			else {
				System.out.println("Insuficiet Amount Payed");
				return selectFood();
			}
			Samosa s1=new Samosa();
			return s1;
		}
		else if(choice==4)
		{
			System.out.println("You have selected Coke");
			System.out.println("Enter  the Quantity of Coke::");
			int count=sc.nextInt();
			int totalCost=count*50;
			System.out.println("Tatal Cost is: "+totalCost+":: Plese Complete Your Payment ::");
			int pay=sc.nextInt();
					
			if(pay==totalCost)
			{
				System.out.println("Collect Your "+count+" Bottle  Coke and Enjoy");
				Coke c1=new Coke();
				c1.drink();	
			}
			else if(pay>totalCost)
			{
				System.out.println("Collect Your "+count+" Bottle Coke and Remains "+(pay-totalCost)+"rs From Counter");
				Coke c1=new Coke();
				c1.drink();	
			}
			else {
				System.out.println("Insuficiet Amount Payed");
				return selectFood();
			}
			Coke c1=new Coke();
			return c1;
		}
		else
		{
			System.err.println("Invalid choice ");
			return selectFood();
		}
		
		
		
		
	}
	
	
}
