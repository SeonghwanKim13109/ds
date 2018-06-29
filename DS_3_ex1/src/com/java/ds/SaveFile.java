package com.java.ds;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class SaveFile {
	public static void save(String fileName, Word word) {
		try {
			PrintWriter outFile = new PrintWriter(new FileWriter(fileName));
			for(int i = 0; i<word.size(); i++) {
				outFile.println(word.findWordAt(i) + " " + word.countWordAt(i));
			}
			outFile.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("save failed");
		}
	}
}
