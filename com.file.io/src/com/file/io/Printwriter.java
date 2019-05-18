package com.file.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Printwriter {

	public static void main(String[] args) throws IOException {
		PrintWriter pw=new PrintWriter(new FileWriter(new File("mounika123","chandu.txt")));
        pw.write("hi mounika");
        pw.print(100);
        pw.print(100009);
	    pw.flush();
	    pw.close();
	
	}

}
