package customer;

import java.util.ArrayList;

public class Customer
{
  private int customer_id;
  private String customer_name;
  private int purchase_qty;
  private int item_no;
  private float total_Bill;
  
  
  // functions 
  
  public void AddCustomerDetails(Customer c)
  {
	  this.customer_name= c.customer_name;
	  this.item_no= c.item_no;
	  this.purchase_qty= c.purchase_qty;
  }
  public float DisplayCustomerBill(ArrayList<Customer> arr,String cus_name, ArrayList<shop> shoplist)
  {
	  float total=0;
	  System.out.println("\n\nItem No\t\tCustomer Name\t\tItem Price");
	   System.out.println("----------------------------------------------------------------------------------------------------------");
	  for(Customer c : arr)
	  {
	    if(c.customer_name.equals(cus_name))
	    {
		System.out.println(c.item_no+"\t\t"+c.customer_name+"\t\t"+c.purchase_qty);
		
		for ( shop shop : shoplist)
		{
			  if(shop.getNo(item_no) == c.item_no)
			  {
		        total+= c.purchase_qty * shop.getPrice(); 
			  }
		}
	    }
       }
	  System.out.println("-------------------------------------------------------------------------------------------------------");
	  System.out.println("Total Bill Before Discount == " + total);
	  
	  float dis = 0;
	  if ( total<15000)
	  {
		  dis= (total*8)/100;
	  }
	  else if (total>=15000 && total < 70000)
	  {
		  dis= (total*12)/100;
	  }
	  else if (total>70000)
	  {
		  dis= (total*15)/100;
		  
	  } 
	 
	   System.out.println("\n\n----------------------------------------------------------------------------------------------------------");
	  System.out.println("Total Bill After Discount == " + (total- dis));
	  float profit = (total*6)/100;
	  System.out.println("Total Profit == " + profit);
	  for (Customer cus : arr)
	  {
		  if(cus.getCustomer_name().equals(cus_name))
		  {
			  cus.settotal_Bill(total);
		  }
	  }
	
	   System.out.println("\n\n----------------------------------------------------------------------------------------------------------");
	  return (total-dis);
    }  
 
  
 // getter setter
  public float gettotal_Bill()
  {
	  return total_Bill;
  }
  public void settotal_Bill(float bill)
  {
	  this.total_Bill = bill;
  }
  public int getCustomer_id()
  {
	  return customer_id;
  }
  public void setCustomer_id(int customer_id)
  {
	  this.customer_id=customer_id;
  }
  public String getCustomer_name()
  {
	  return customer_name;
  }
  public void setCustomer_name(String customer_name)
  {
	  this.customer_name=customer_name;
	 
  }
  public int getPurchase_qty()
  {
	return purchase_qty;
  }
   public void setPurchase_qty(int purchase_qty) 
   {
	this.purchase_qty = purchase_qty;
   }
public int getItem_no()
{
	return item_no;
}
public void setItem_no(int item_no)
{
	this.item_no = item_no;
}
}







