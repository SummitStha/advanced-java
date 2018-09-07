import java.io.*;

public class CopyFile {
	public static void main(String args[])
	{
		try
		{
			FileInputStream fin = new FileInputStream("../test_files/test.txt");
			FileOutputStream fout = new FileOutputStream("../test_copied_files/copied-test.txt");
			int ch;
			while((ch = fin.read())!=-1)
			{
				fout.write((char)ch);
			}
			fin.close();
			fout.close();
			System.out.println("File Copied.");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
