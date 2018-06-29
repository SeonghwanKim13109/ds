package com.java.ds;

import java.io.File;

import java.util.Scanner;

public class Word {
	private final int MAX = 10000000;
	private String[] words = new String[MAX];
	private int[] count = new int[MAX];
	private int last_insertion = 0;

	public void makeIndex(String fileName) {
		try {
			Scanner scan = new Scanner(new File(fileName));
			
			while (scan.hasNext()) {
				String temp = scan.next();
				String trimmed = trim(temp).toLowerCase();
				
				if(trimmed != null)
					addWord(trimmed);
//				addWord(temp);
			}
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
	
		}
	}

	public int getLast_insertion() {
		return last_insertion;
	}

	public void addWord(String word) {
		int index = findWord(word);
		if (index != -1) {
			count[index]++;
		} else {
			words[last_insertion] = word;
			count[last_insertion] = 1;
			last_insertion++;
		}

	}

	public int findWord(String word) {

		for (int i = 0; i < last_insertion; i++) {
			if(words[i].equalsIgnoreCase(word))
				return i;
		}
		return -1;
	}

	public String findWordAt(int i) {

		return words[i];
	}

	public int countWord(String word) {
		int idx = findWord(word);
		if (idx != -1)
			return count[idx];
		return 0;
	}
	
	public int countWordAt(int idx) {
		if(idx != -1 && idx<MAX && idx>=0)
			return count[idx];
		return -1;
	}
	
	private static String trim(String str) {
		int i = 0;
		while(i<str.length()&&!Character.isLetter(str.charAt(i))) {
			i++;
		}
		int j = str.length() -1;
		while(j>=0 &&!Character.isLetter(str.charAt(j))) {
			j--;
		}
		if(i<=j)
			return str.substring(i,j+1);
		return null;
	}
}
