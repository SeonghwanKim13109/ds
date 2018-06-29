package com.java.ds;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		WordFunction word_func = new WordFunction();
		boolean continue_flag = true;
		while (continue_flag) {
			String command;

			System.out.print("$  ");
			command = scan.next();

			if (command.equals("read")) {
				String fileName = scan.next();
				word_func.makeIndex(fileName);

			} else if (command.equals("find")) {
				String temp = scan.next();
				int index = word_func.findWord(temp);
				if (index > -1) {
					System.out.println("The word '" + temp + "' appear " + word_func.countWordAt(index) + " times");
				} else {
					System.out.println("The word '" + temp + "'doesn't appear ");

				}
			} else if (command.equals("help")) {
				
				System.out.println("function : read / find /save / exit");
				
			} else if (command.equals("save")) {
				String fileName = scan.next();
				word_func.sort();
				SaveFile.save(fileName, word_func);
			} else if (command.equals("exit")) {
				continue_flag = false;
			}
		}
		scan.close();

	}
}
