class A implements Runnable
{
	public void run()
	{
		for(int i=2; i<=30; i+=2)
		{
			System.out.println("Even = "+i);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}
class B implements Runnable
{
	public void run()
	{
		for(int j=101; j<130; j+=2)
		{
			System.out.println("Odd = "+j);
			try
			{
				Thread.sleep(1000);
			}
			catch(InterruptedException ex)
			{
				System.out.println(ex);
			}
		}
	}
}

public class MultithreadingDemo {
	public static void main(String args[])
	{
		new Thread(new A()).start();
		new Thread(new B()).start();
	}
}