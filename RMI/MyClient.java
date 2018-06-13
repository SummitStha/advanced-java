import java.rmi.*;
import java.rmi.server.*;

public class MyClient{
	public static void main(String args[]){
		try{
			Adder ob = (Adder)Naming.lookup("rmi://localhost/nsmt");			
			System.out.println("Sum=" + ob.add(10,3));
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
}
