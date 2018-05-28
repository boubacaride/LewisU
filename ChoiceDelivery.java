package LewisU.Programming;

import java.util.Scanner;
enum Delivery
{
    DELIVERY_AVAILABLE,

    DELIVERY_WITH_EXTRA_COST
}

public class ChoiceDelivery{
	
	  private static Scanner scan;
	private static Scanner scan2;
	private static Scanner scan3;
	public static int modeMenu() 
	  {
		  int selection;
	  
	
	scan3 = new Scanner (System.in);
	System.out.println("");
	
	System.out.println("\tFryer's Restaurant");
System.out.println("\tPlease chose from the following: \n"+
			"\tSelect 1 for pick up \n\t"+
			"Select 2 for delivery\n ");
			
	
selection = Integer.parseInt(scan3.nextLine());

	if(selection != 1 && selection != 2)
	{
		do{
	System.out.print(" You have enter an invalid selection. \n"
			+"Please select 1 or 2\n ");
	selection = Integer.parseInt(scan3.nextLine());
		}while(selection != 1 && selection != 2);
	}
	return selection;
	}

	// The menu

	public static float choiceMenu()

	{

	int selection;
	int quantity;
	float price=0;

	 scan2 = new Scanner(System.in);
	System.out.println("\tFlyers Restaurant Menu: ");
	System.out.print("\tPlease make your selection form the Menu (1 to 4): ");
	System.out.println(" ");
	System.out.println("\t1. Flyers' Burger: $4.50");
	System.out.println("\t2. Flyers' Drink: $1.50");
	System.out.println("\t3. Flyers' Fries: $2.50");
	System.out.println("\t4. Flyers' Desert: $3.00");
	
	System.out.println("");
	selection = Integer.parseInt(scan2.nextLine());

	if(selection < 1 || selection > 4)
	{
		do{
	System.out.print(" You have enter an invalid selection. \n"
			+"Please select from 1 to 4\n");
			
	selection = Integer.parseInt(scan2.nextLine());
	
		}while(selection < 1 || selection > 4);
	}

	System.out.println("\tPlease entry the quantity: ");
	quantity =  Integer.parseInt(scan2.nextLine());

	if(selection == 1){
		 price = (float) (quantity * 4.5);
	}
	else if(selection == 2){
	 price = (float) (quantity * 1.5);
	}
	else if(selection == 3){
	 price = (float)(quantity * 2.5);
	}
	else if(selection == 4){
	 price = (float) (quantity * 3);
	}

	return price;
	}
public static void main(String[] args) {
		
		int deliverySelection;
		 int restaurantZipCode = 60446;
		 int customerZipCode;
		 Delivery choice = null;
		 String selectedItems = "y";
		 double price=0;
		 scan = new Scanner(System.in);
		 deliverySelection =  modeMenu();

		if(deliverySelection ==2)
		{
			System.out.println(" ");
		   System.out.print("\tPlease enter your zip code: ");
		   
		customerZipCode =  Integer.parseInt(scan.nextLine());
		
		if((restaurantZipCode - customerZipCode) < 5 && (customerZipCode - restaurantZipCode) < 5)
		{
		   System.out.println("\tDelivery is available." );
		choice = Delivery.DELIVERY_AVAILABLE;
		}
		else if((restaurantZipCode - customerZipCode) == 5 || (customerZipCode - restaurantZipCode) == 5)
		{
			System.out.println(" ");
		System.out.println("\tDelivery is available with extra cost " );
		choice =  Delivery.DELIVERY_WITH_EXTRA_COST;
		}
		 else

		{
		 System.out.println("\tSorry delivery not available for "+customerZipCode+" zip code");

		 System.exit(0);

		  }                  
		
		  }
		while (selectedItems.equalsIgnoreCase("y"))

		             {

		                    price += choiceMenu();

		                    System.out.print("\tDo you want to order more (Y/N): ? ");
		                    System.out.println(" ");
		                    selectedItems = scan.nextLine();

		                    if(selectedItems.equalsIgnoreCase("n"))

		                           break;

		             }


		             //  the tax

		             price += 0.05*price;
		             System.out.println("\t\t Fryer' Restaurant");
		             System.out.println("\t\tRomeoville, IL 60446");
		             System.out.println("\t\t    SALE");		            
		             System.out.println("\tSub-total:\t \t$"+price);
		             System.out.println("\tSales Tax: \t\t$"+0.05*price);

		             if(deliverySelection == 2 )

		             {

		                    if(choice == Delivery.DELIVERY_AVAILABLE){
		                    	
		                           price += 5;
		                           System.out.println("\tDelivery Charge:\t$5.00");}
		                    else if(choice == Delivery.DELIVERY_WITH_EXTRA_COST){

		                           price += 7;
		                    System.out.println("\tDelivery Charge:\t$7.00");}
		             }
		             

		            

		             //the total bill
		             
		             System.out.println("\tYour total:\t\t$"+price+"\n"
		             		+ "\t\t   Thank You ");

	}

}
