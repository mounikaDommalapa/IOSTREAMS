package com.file.io;
import java.io.*;

public class Bufferedreqder {

	public static void main(String[] args) throws IOException
	{
		File f=new File("mounika123","mounika.txt");
		BufferedReader br=new BufferedReader(new FileReader(f));
		BufferedReader br1=new BufferedReader(new FileReader(f));
		System.out.println((char)br.read());
		System.out.println("\n**********************************************");
		String s=br1.readLine();
		while(s!=null)
		{
			System.out.println(s);
			s=br1.readLine();
		}
	}
}
