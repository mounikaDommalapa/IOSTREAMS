package com.file.io;
import java.io.*;
public class Filereader {

	public static void main(String[] args) throws IOException {
		File f= new File("input.txt");
		FileReader fr= new FileReader(f);
	    System.out.println("*******************all the data*************************");		
		FileReader fr1= new FileReader(f);
	    System.out.println((char)fr.read());
	    fr.close();
        System.out.println("*******************all the data*************************");		
		int i= fr1.read();
		while(i!=-1)
		{
			System.out.print((char)i);
			i=fr1.read();
		}
		fr1.close();
		System.out.println("\n*******************Array of characters*************************");		
		FileReader fr2= new FileReader(f);	
		char[] ch= new char[(int)f.length()];
		int s= fr2.read(ch);
		for(char c:ch)
		{
        System.out.print(c);
		}
	}

}
