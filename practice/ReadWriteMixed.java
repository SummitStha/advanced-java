import java.io.*;
import java.util.*;

public class ReadWriteMixed {
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter id, name and salary.");
		int id = input.nextInt();
		String name = input.next();
		double salary = input.nextDouble();
		try
		{
			FileOutputStream fout = new FileOutputStream("../test_files/mixed.txt");
			DataOutputStream dout = new DataOutputStream(fout);
			dout.writeInt(id);
			dout.writeUTF(name);
			dout.writeDouble(salary);
			dout.close();
			fout.close();
			System.out.println("Data writing complete." +"\n");
			FileInputStream fin = new FileInputStream("../test_files/mixed.txt");
			DataInputStream din = new DataInputStream(fin);
			System.out.println("Data reading complete.");
			System.out.println("ID : " + din.readInt());
			System.out.println("Name : " + din.readUTF());
			System.out.println("Salary : " + din.readDouble());
			din.close();
			fin.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
