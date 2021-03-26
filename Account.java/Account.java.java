class Account
{
	int accountNumber;
	String accountHolderName;
	double balance;
	
	//create all the setter getter method
	
	
	void setAccountNumber(int id)
   {
   
   this.accountNumber=id;
   }
   
	void setAccountHolderName(String name)
   {
   
   this.accountHolderName=name;
   }
   void setBalance(double balance)
   {
   
   this.balance=balance;
   }
   
   int getAccountNumber()
   {
   return accountNumber;
   }
   double getBalance()
   {
   return balance;
   }
   
   String getAccountHolderName()
   {
   return accountHolderName;
 *//  }
	
	void showdetails()
	{
		System.out.println("The Account Details"+getAccountNumber());
		System.out.println("The Account Details"+getAccountHolderName());
		System.out.println("The Account Details"+getBalance());

	}
}

class Start{
	public static void main(String[] arg)
	{
		Account a1 = new Account();
		a1.setAccountNumber(10112);
		a1.setAccountHolderName("Jhon");
		a1.setBalance(89000.00);
		a1.showdetails();
	}
}