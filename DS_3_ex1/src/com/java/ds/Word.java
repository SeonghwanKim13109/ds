package com.java.ds;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Word {
	private ArrayList<String> words = new ArrayList();
	private ArrayList<Integer> count = new ArrayList();

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

	public void addWord(String word) {
		int index = findWord(word);
		if (index != -1) {
			count.set(index, count.get(index)+1);
		} else {
			words.add(word);
			count.add(1);
		}

	}

	public int findWord(String word) {

		for (int i = 0; i < words.size(); i++) {
			String temp = words.get(i);
			if(temp.equalsIgnoreCase(word))
				return i;
		}
		return -1;
	}

	public String findWordAt(int i) {

		return words.get(i);
	}

	public int countWord(String word) {
		int idx = findWord(word);
		if (idx != -1)
			return count.get(idx);
		return 0;
	}
	
	public int countWordAt(int idx) {
		if(idx != -1 && idx<words.size() && idx>=0)
			return count.get(idx);
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
