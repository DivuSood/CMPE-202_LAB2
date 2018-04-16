import java.util.Scanner;// scanner class
@SuppressWarnings("unused")
public class GumballMachine2 {
	private boolean has_quarter;
	private int num_gumballs;
    @SuppressWarnings("resource")
	public static void main(String[] args) {
		//initialize variables
		    boolean has_quarter = false;
		    double totalAmount = 0.0;
			double totalCharge = 0.0;
			double totalChange = 0.0;
			int quarters;
			int dimes;
			int nickels;
			int pennies; 
			double amount = 1.0;
			boolean notdone = true;
			
			Scanner input = new Scanner(System.in);
			//ask user to input amounts
			
			System.out.println("The Gumball machine accepts amount in coins");
			System.out.println("dime = 0.1, quarter = 0.25, penny = 0.01, nickel = 0.05");
			System.out.println("Please insert coins");
			
			
			//create a while loop that ends when user enter 0 which changes the variable not done to false
			//user will enter amount individually 
			//user will receive warn when the amount entered is not penny, dime, nickel, quarter
			
			notdone = true;
			totalAmount = 0.0;
			totalChange = 0.0;
			totalCharge = 0.0;
			quarters= 0;
			dimes = 0;
			nickels = 0;
			pennies = 0;
			amount = 1.0;
 }	
    @SuppressWarnings({ "resource" })
	public int insertCoins(int coin)
	{
    	int total = coin;
    	int totalAmount=0;
    	while (total < 50)
    	{
    		
    		Scanner keyboard = new Scanner(System.in);
    		System.out.println("Insert coins Quarters or Dimes or Nickels or Pennies ");
    	      
    	      totalAmount= keyboard.nextInt();
    	      System.out.println();
    		        if ((totalAmount == 5) || (totalAmount == 10) || (totalAmount == 25 ))
					{
						total +=totalAmount;
					}
					else
						System.out.println("Coins should be Quarters or Dimes or Nickels or Pennies ");
						 
    	}
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
    
		
    	
    	      
			        
			   	