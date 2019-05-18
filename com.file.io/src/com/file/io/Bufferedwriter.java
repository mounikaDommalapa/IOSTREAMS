package com.file.io;
import java.io.*;

public class Bufferedwriter {

	public static void main(String[] args) throws IOException {
		File f=new File("mounika123","mounika.txt");
		BufferedWriter bw=new BufferedWriter(new FileWriter(f));
		bw.write("Hi mounika");
		bw.newLine();
		bw.write("how are you");
		bw.newLine();
		bw.write("hope you are good");
        bw.flush();
	}

}
