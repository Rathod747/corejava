package com.rays.IO;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writefile {
	public static void main(String[] args) throws Exception {
		FileWriter writer = new FileWriter("C:\\Users\\admin\\Documents//Seema.txt");
		PrintWriter  pw = new PrintWriter(writer);
		for(int i = 0; i<5; i++) {
		pw.println(i + ":Line");
	}
     pw.close();
     writer.close();
     System.out.println("File is successfully written");
}
}