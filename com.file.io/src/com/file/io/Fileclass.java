package com.file.io;
import java.io.*;

public class Fileclass {

	public static void main(String[] args) throws IOException {
		File f1= new File("mounika.txt");
		f1.createNewFile();
		File f2=new File("mounika123");
		f2.mkdir();
		File f3=new File(f2,"murali.txt");
		f3.createNewFile();
		File f4=new File(f2,"nagamani.txt");
		f4.createNewFile();
		File f5=new File(f2,"chandu.txt");
		f5.createNewFile();
	    String[] s=f2.list();
	    for(String s1:s)
	    {
	    	System.out.println(s1);
	    }
		System.out.println(f1.length());
	}

}
