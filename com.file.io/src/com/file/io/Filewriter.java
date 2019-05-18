package com.file.io;
import java.io.*;

public class Filewriter {
	
	public static void main(String[] args) throws IOException
	{
		File f=new File("input.txt");
		f.createNewFile();
		FileWriter fw= new FileWriter(f,true);
		fw.write("mounika\n");
		fw.write("u can do it\n");
		fw.write("all the best");
		fw.flush();
		fw.close();
	}

}
