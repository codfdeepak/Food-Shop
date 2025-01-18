package FoodShop;

import java.util.Scanner;

public class User_Customer {

	public static void main(String[] args) {
		
		FoodShop pr1=new FoodShop(); 
		
		char c;
		do
		{
		 pr1.selectFood();
		 System.out.println("Press Y/y for Continue shopping...");
		 Scanner sc=new Scanner(System.in);
		 c=sc.next().charAt(0);
			
		}while(c=='Y' || c=='y');
		{
			System.out.println("Thank you Shopping");
		}
		
	}
}
