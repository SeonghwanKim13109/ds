package com.java.ds;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OrthogonalLine[] arr_OL = new OrthogonalLine[100];
		Point[] arr_p = new Point[100];
		int p_num = 0;
		int o_num = 0;
		double x_max = 0 ,x_min = 0;
		double y_max = 0, y_min = 0;
		try {
			Scanner scan = new Scanner(new File("in.txt"));
			
			while(scan.hasNext()) {
				arr_p[p_num++] = new Point(scan.nextDouble() , scan.nextDouble());
			}
			
			for(int i = 0; i<p_num-1;i++) {
				if(i == 0) {
					x_max = arr_p[i].getX();
					x_min = arr_p[i].getX();
					y_max = arr_p[i].getY();
					y_min = arr_p[i].getY();
				}
				
				if(arr_p[i].getX() > x_max)
					x_max = arr_p[i].getX();
				if(arr_p[i].getX()< x_min)
					x_min = arr_p[i].getX();
				if(arr_p[i].getY()>y_max)
					y_max = arr_p[i].getY();
				if(arr_p[i].getY()<y_min)
					y_min = arr_p[i].getY();
				
				if(i == p_num-1)
					break;
				
				arr_OL[o_num++] = new OrthogonalLine(arr_p[i],arr_p[(i+1)%(p_num-2)]);
			}
			
			/*for(int i =0 ; i<o_num;i++) {
				System.out.println(arr_OL[i].toString() +" "+ arr_OL[(i+2)%o_num].toString() + arr_OL[i].isIntersect(arr_OL[(i+2)%o_num]));
			}
			System.out.println();
			for(int i =0 ; i<o_num;i++) {
				System.out.println(arr_OL[i].toString() +" " +arr_OL[(i+1)%o_num].toString() + arr_OL[i].isIntersect(arr_OL[(i+1)%o_num]));
			}*/
			System.out.println(x_max +" " + x_min +" "+ y_max+" "+y_min);
			if(arr_p[p_num-1].getX() >x_max || arr_p[p_num-1].getX() <x_min)
				System.out.println("점 "+arr_p[p_num-1].toString()+" 는 주어진 다각형안에 존재하지 않습니다");
			else if(arr_p[p_num-1].getY() >y_max || arr_p[p_num-1].getY() <y_min)
				System.out.println("점 "+arr_p[p_num-1].toString()+" 는 주어진 다각형안에 존재하지 않습니다");
			else {
				int count = 0;
				OrthogonalLine o1 = new OrthogonalLine(arr_p[p_num-1], new Point(x_max+1, arr_p[p_num-1].getY()));
				System.out.println(o1.toString());
				for(int i = 0 ; i<o_num; i++) {
					if(arr_OL[i].isIntersect(o1)) {
						count++;
					}
				}
				if(count%2 == 0)
					System.out.println("점 "+arr_p[p_num-1].toString()+" 는 주어진 다각형안에 존재하지 않습니다");
				else
					System.out.println("점 "+arr_p[p_num-1].toString()+" 는 주어진 다각형안에 존재합니다");
			}
			scan.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
