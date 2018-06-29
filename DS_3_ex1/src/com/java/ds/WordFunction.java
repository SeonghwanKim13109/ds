package com.java.ds;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class WordFunction {
	private ArrayList<Word> words = new ArrayList();

	
	public int size() {
		return words.size();
	}
	public void makeIndex(String fileName) {
		try {
			Scanner scan = new Scanner(new File(fileName));
			
			while (scan.hasNext()) {
				String temp = scan.next();
				String trimmed;
				if(temp!=null) 
				 trimmed = trim(temp);
				else
					continue;
				if(trimmed != null) {
					trimmed = trimmed.toLowerCase();
					addWord(trimmed);
				}

			}
			scan.close();
		} catch (Exception e) {
			e.printStackTrace();
	
		}
	}

	public void addWord(String word) {
		int index = findWord(word);
		if (index != -1) {
			//count.set(index, count.get(index)+1);
			Word temp = words.get(index);
			temp.setCount(temp.getCount()+1);
		} else {
			Word word_temp = new Word(word,1);
			words.add(word_temp);
		}

	}

	public int findWord(String word) {

		for (int i = 0; i < words.size(); i++) {
			String temp = words.get(i).getWord();
			if(temp.equalsIgnoreCase(word))
				return i;
		}
		return -1;
	}

	public String findWordAt(int i) {

		return words.get(i).getWord();
	}

	public int countWord(String word) {
		int idx = findWord(word);
		Word temp = words.get(idx);
		if (idx != -1)
			return temp.getCount();
		return 0;
	}
	
	public int countWordAt(int idx) {
		Word temp = words.get(idx);
		if(idx != -1 && idx<words.size() && idx>=0)
			return temp.getCount();
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
	private static void sort() {
		
	}
}
