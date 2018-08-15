import java.util.*;
import java.io.*;
import java.net.*;

public class TCPServer{
	public static void main(String args[]){
		try{
			ServerSocket ss = new ServerSocket(6789);
			Socket s = ss.accept();
			System.out.println("---Connection Established---");
			
			Scanner clientInput = new Scanner(s.getInputStream());
			String str1 = clientInput.nextLine();
			System.out.println("From Client: " + str1);

			Scanner input = new Scanner(System.in);
			System.out.println("Enter Your Message: ");
			String str2 = input.nextLine();
			DataOutputStream dout = new DataOutputStream(s.getOutputStream());
			dout.writeBytes(str2 + "\n");
			dout.close();
			ss.close();
		}
		catch(Exception ex){
			System.out.println(ex);
		}

	}
}