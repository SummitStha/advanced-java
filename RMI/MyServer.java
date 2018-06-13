import java.rmi.*;
import java.rmi.server.*;

public class MyServer{
	public static void main(String args[]){
		try{
			Adder ob = new AdderRemote();
			Naming.bind("nsmt", ob);
		}
		catch(Exception ex){
			System.out.println(ex);
		}
	}
}
