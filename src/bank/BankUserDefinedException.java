package bank;
/*
 * Generating BankATMException whenever withdrawal is done for balance less than 10000.
 */
class BankATM
{ 
	private double balance = 10000; 
	private int atmId=5041; 
	private String bankName="SBI";
	private String location="Delhi";
	public double balance() 
	{ 
		return balance; 
	} 
	public int atmId()
	{
		return atmId;
	}
	public String bankName()
	{
		return bankName;
	}
	public String location()
	{
		return location;
	}
	
	public void withdraw(double amt) throws BankATMException //Withdraw method
	{ 
		/*
		 *Checking if the balance is less than 10000 the withdrawal should not be allowed 
		 * and a user-defined exception BankATMException should be thrown.
		 */
		if (amt > balance) 
		{ 
			throw new BankATMException(String.format("Current balance %f is less than requested amount %f", balance, amt));
		}
		balance = balance - amt; 
	} 
	public void deposit(double amt) //Deposit method
	{ 
		if (amt <= 0) 
		{ 
			throw new IllegalArgumentException(String.format("Invalid deposit amount %s", amt));
		} 
	} 
}
/*
 * User defined BankATMException class  
 */ 
class BankATMException extends RuntimeException 
{ 
	private String message; 
	public BankATMException(String message) 
	{ 
		this.message = message; 
	} 
	public BankATMException(Throwable cause, String message) 
	{ 
		super(cause); 
		this.message = message; 
	} 
	public String getMessage() 
	{ 
		return message; 
	}
}



class BankUserDefinedException  
{

	public static void main(String[] args) //start of main class
	{
		// TODO Auto-generated method stub
		//Creating Object1 for BankATM Class
		BankATM bank_atm1 = new BankATM();
		//Creating Object2 for BankATM Class
		BankATM bank_atm2 = new BankATM();
		//Creating Object3 for BankATM Class
		BankATM bank_atm3 = new BankATM(); 
		System.out.println("ATM Id : " + bank_atm1.atmId());
		System.out.println("Bank Name : " + bank_atm1.atmId());
		System.out.println("Location : " + bank_atm1.atmId());
		System.out.println("Orginal balance : " + bank_atm1.balance());		
		System.out.println("Withdrawing amount 500"); 
		bank_atm1.withdraw(500); 
		System.out.println("Current balance : " + bank_atm1.balance()); 
		bank_atm1.withdraw(1000);

		

		System.out.println("Original balance : " + bank_atm2.balance());
		System.out.println("Withdrawing amount 2000"); 
		bank_atm2.withdraw(2000); 
		System.out.println("Current balance : " + bank_atm2.balance()); 
		bank_atm2.withdraw(10000);

		

		System.out.println("Original balance : " + bank_atm3.balance());
		System.out.println("Withdrawing amount 5000"); 
		bank_atm3.withdraw(5000); 
		System.out.println("Current balance : " + bank_atm3.balance()); 
		bank_atm3.withdraw(2000);
	}//Close of Main class

}


