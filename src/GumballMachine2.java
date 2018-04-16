import java.util.Scanner;// scanner class
@SuppressWarnings("unused")
public class GumballMachine2 {
	private boolean has_quarter;
	private int num_gumballs;
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		//initialize variables
		        boolean has_quarter = false;
		        int totalAmount = 0.0;
			int quarters;
			int dimes;
			int nickels;
			int pennies; 
			int amount = 1.0;
			boolean notdone = true;
			
			Scanner input = new Scanner(System.in);
			//ask user to input amounts
			
			System.out.println("The Gumball machine accepts amount in coins");
			System.out.println("dime = 1, quarter = 25, penny = 1, nickel = 5");
			System.out.println("Please insert coins");
			
			
			//create a while loop that ends when user enter 0 which changes the variable not done to false
			//user will enter amount individually 
			//user will receive warn when the amount entered is not penny, dime, nickel, quarter
			
			notdone = true;
			totalAmount = 0;
			quarters= 0;
			dimes = 0;
			nickels = 0;
			pennies = 0;
			amount = 0;
		        while (notdone){
				System.out.println("Enter coins ");
				
				try {
					amount = input.nextInt();
					if(amount == 1 || amount ==  25 || amount == 5 || amount == 1 
							){
						totalAmount = totalAmount + amount;
						
						if (amount == 0){
							notdone = false;
						}
					}
					else {
						System.out.println("Please re-enter coins (Quaters/dimes/nickels/pennies)");
																			
					}
				} 
				catch (Exception e) {
					System.out.println("Please re-enter coins (Quaters/dimes/nickels/pennies) ");
					input.nextLine();
				}
			}
	   }
}
				public int insertCoins(int coin)
				{
			    	int total = coin;
			    	int totalAmount=0;
			    	while (total < 50)
			    	
			    	if ( total >= 50 )
			            this.has_quarter = true ;
			        else 
			           has_quarter = false ;
					return totalAmount;
				}
			    	public void turnCrank()
			        {
			        	if ( this.has_quarter )
			        	{
			        		if ( this.num_gumballs > 0 )
			        		{
			        			this.num_gumballs-- ;
			        			this.has_quarter = false ;
			        			System.out.println( "Thanks for your quarter.  Gumball Ejected!" ) ;
			        		}
			        		else
			        		{
			        			System.out.println( "No More Gumballs!  Sorry, can't return your coin." ) ;
			        		}
			        	}
			        	else 
			        	{
			        		System.out.println( "Please insert a coin" ) ;
			        	}        
			        
			        }
			}
			    
					
			    	
			    	      

 
