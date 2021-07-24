package wholesale;

import java.util.ArrayList;
import java.util.Scanner;

import customer.Customer;
import customer.shop;
public class Mainclass 
{
   private static Scanner sc;
   private static ArrayList<shop> shopList= new ArrayList <shop>();
	 private static ArrayList<Customer> cusList= new ArrayList <Customer>();
	  	

   static void menu()
 {
	
 System.out.println("1- ADD NEW ITEM");
 System.out.println("2-DISPLAY ALL ITEMS");
 System.out.println("3- ADD CUSTOMER DETAILS");
 System.out.println("0-EXIT");
}
	public static void main(String [] args)
	{
		

		int opt;
		sc = new Scanner(System.in);
		
		 do 
		 {
			System.out.println("AVAILABLE OPTIONS\n");
          shop s = new shop();
			 menu();
			  opt = sc.nextInt();
		
			  switch(opt)
			  {
			  
			  case 1:
				  
				  sc = new Scanner(System.in);
				System.out.println("Enter Item Name");
				s.setName(sc.nextLine());
				System.out.println(" Enter Item No");
				s.setNo(sc.nextInt());
				System.out.println("Enter Item Price");
				s.setPrice(sc.nextInt());
				s.addNewItem(s);
				shopList.add(s);
				
				
				  break;
			  case 2:
				  
				  s.displayItems(shopList);
				  
				  
				  break;
			  case 3:
				  sellOutDetails();
				  
				  break;
				  
			  default : 
					   
					   
					    break;
			  }
	 		
		 } 

		 while (opt != 0);
		System.out.println("ENTER YOUR CHOICE");
	 }
	private static void sellOutDetails()
	{
		sc = new Scanner(System.in);
	   	Customer c = new Customer();
	   	
	   	System.out.println("Enter the customer name:" );
	   	c.setCustomer_name(sc.nextLine());
	 	System.out.println("Enter the Item No:" );
	   	c.setItem_no(sc.nextInt());
	 	System.out.println("Enter the Item Qty:" );
	   	c.setPurchase_qty(sc.nextInt());
	   	
	  	
	   	c.AddCustomerDetails(c);
	   	cusList.add(c);
	   	
	   	System.out.println("Do You Have More Items? (Yes/No)");
	  	String choice = "";
	   	
	   	choice= sc.next();
	   	
	   if ( choice.equalsIgnoreCase("yes"))
	   	{
	   		//again input and update  data of customer
	   		sellOutDetails();
	   		
	   	}
	   	else
	   	{
	   	
	   		//display bill
	   		
	   		 		
	   		c.DisplayCustomerBill(cusList , c.getCustomer_name() ,shopList );
	   	}
	 }
}