class InsufficientBalanceException extends Exception
{
	InsufficientBalanceException(String msg)
	{
		super(msg);
	}
}

class Bank	
{
	String cname,accno;
	double balance;
	Bank (String c, String a, double b)
	{
		cname = c;
		accno = a;
		balance = b;
	}
	void withdraw(double amount) throws InsufficientBalanceException
	{
		if(balance > amount)
		{
			balance-=amount;
			System.out.println("New Balance : " + balance);
		}
		else
		{	
			throw new InsufficientBalanceException("Not Enough Balance");
		}
	}
}

public class CustomException {
	public static void main (String args[])
	{
		Bank ob = new Bank("Niroj", "101A", 5000);
		try
		{
			ob.withdraw(6000);
		}
		catch(InsufficientBalanceException ex)
		{
			System.out.println(ex);
		}
	}
}