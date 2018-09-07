import java.io.*;

public class RandomAccessDemo
{
	public static void main(String[] args) 
	{
		try
		{
			RandomAccessFile rf = new RandomAccessFile("../test_files/random_test.txt", "rw");
			rf.writeInt(10);
			rf.writeChar('A');
			long pos = rf.getFilePointer();
			rf.seek(0);
			System.out.println(rf.readInt());
			System.out.println(rf.readChar());
			rf.writeUTF("Hello");
			rf.writeDouble(10.5);
			rf.seek(pos);
			System.out.println(rf.readUTF());
			System.out.println(rf.readDouble());
			rf.close();
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
