package com.java.ds;

import java.util.*;
import org.w3c.dom.css.Rect;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Main main = new Main();
		main.execute();
	}

	private void execute() {
		ArrayList<Shape> arrList = new ArrayList<Shape>();
		Scanner scan = new Scanner(System.in);
		String cmd;
		boolean notExit = true;

		while (notExit) {
			System.out.print("$ ");
			cmd = scan.next();
			if (cmd.equals("add")) {
				String shape = scan.next();

				if (shape.compareToIgnoreCase("R")==0) {
					arrList.add(new Rectangle(scan.nextDouble(), scan.nextDouble()));
				} else if (shape.compareToIgnoreCase("C")==0) {
					arrList.add(new Circle(scan.nextDouble()));
				} else if (shape.compareToIgnoreCase("T")==0) {
					arrList.add(new Triangle(scan.nextDouble(), scan.nextDouble()));
				}

			} else if (cmd.equals("show")) {
				Iterator<Shape> iterator = arrList.iterator();
				int i = 1;

				while (iterator.hasNext()) {
					Shape temp = iterator.next();
					System.out.print(i+" ");
					i++;

					if (temp instanceof Rectangle)
						temp = (Rectangle) temp;
					else if (temp instanceof Triangle)
						temp = (Triangle) temp;
					else if (temp instanceof Circle)
						temp = (Circle) temp;

					temp.show();
				}
			} else if (cmd.equals("showdetail")) {
				Iterator<Shape> iterator = arrList.iterator();
				int i = 1;

				while (iterator.hasNext()) {
					Shape temp = iterator.next();
					System.out.print(i+" ");
					i++;

					if (temp instanceof Rectangle)
						temp = (Rectangle) temp;
					else if (temp instanceof Triangle)
						temp = (Triangle) temp;
					else if (temp instanceof Circle)
						temp = (Circle) temp;

					temp.showdetail();
				}
			}else if(cmd.equals("exit"))
				notExit = false;
		}
	}
}
