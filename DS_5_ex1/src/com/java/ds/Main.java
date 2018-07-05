package com.java.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Scanner scan = new Scanner(new File("in.txt"));
			Square temp;
			ArrayList<Square> arrList = new ArrayList<Square>();
			
			while (scan.hasNext()) {
				temp = new Square(scan.nextDouble(), scan.nextDouble(), 
						scan.nextDouble(), scan.nextDouble());
				arrList.add(temp);
			}
			
			Iterator<Square> iterator = arrList.iterator();
			
			while(iterator.hasNext()) {
				System.out.println(iterator.next().getArea());
			}
			
			Collections.sort(arrList);
			PrintWriter pw = new PrintWriter(new FileWriter("out.txt"));
			iterator = arrList.iterator();
			while(iterator.hasNext()) {
				temp = iterator.next();
				pw.println(temp.getUp_x()+" " + temp.getUp_y()+" " +
						temp.getDown_x()+" " +temp.getDown_y()+" ");
			}
			pw.close();
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
