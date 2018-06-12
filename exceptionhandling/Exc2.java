class MyException extends Exception{
	MyException(String msg)
	{
		super(msg);
	}
}

public class Exc2{
	public static void main(String[] args){
		double a=5, b=100000;
		try{
			double c=a/b;
			if(c<0.005)
			{
				MyException ob = new MyException("Too small number");
				throw ob;
			}
		}
		catch(MyException ex)
		{
			System.out.println(ex);
		}
	}
}
