package com.java.proj;

import java.util.*;

import jdk.nashorn.internal.runtime.arrays.IteratorAction;


public class Scheduler {
	
	private ArrayList<Event> arrList = new ArrayList<Event>();
	private static StringTokenizer strTok;
	
	public static MyDate token(String date) {
		
		strTok = new StringTokenizer(date, "/");
		int year,month,day;
		year = Integer.parseInt(strTok.nextToken());
		month = Integer.parseInt(strTok.nextToken());
		day = Integer.parseInt(strTok.nextToken());
		MyDate temp_date = new MyDate(year, month, day);
		
		return temp_date;
	}
	
	public void processCommand() {
		Scanner scan = new Scanner(System.in);
		boolean notExit = true;
		String cmd;

		while (notExit) {
			System.out.print("$");
			cmd = scan.next();
			if (cmd.equals("addevent")) {
				String type = scan.next();
				if(type.equals("oneday")) {
					System.out.print("when : ");
					String date = scan.next();
					MyDate temp_date = Scheduler.token(date);
					
					System.out.print("title : ");
					scan.nextLine();
					String title = scan.nextLine();
					
					Oneday od = new Oneday(temp_date, title);
					arrList.add(od);
					
				}else if(type.equals("duration")) {
					System.out.print("begin : ");
					String begin_date = scan.next();
					MyDate begin = Scheduler.token(begin_date);
					
					System.out.print("end : ");
					String end_date = scan.next();
					MyDate end =Scheduler.token(end_date);
					
					System.out.print("title :");
					scan.nextLine();
					String title = scan.nextLine();
					
					Duration dr = new Duration(begin, end, title);
					arrList.add(dr);
				}else if(type.equals("deadline")) {
					System.out.print("until : ");
					String until_day= scan.next();
					MyDate expire = Scheduler.token(until_day);
					
					System.out.print("title : ");
					scan.nextLine();
					String title = scan.nextLine();
					
					Deadline dl = new Deadline(expire, title);
					arrList.add(dl);
				}
			} else if (cmd.equals("list")) {
				
				Iterator<Event> iterator = arrList.iterator();
				while(iterator.hasNext()) {
					Event temp = iterator.next();
					if(temp instanceof Oneday)
						System.out.println(((Oneday)temp).toString());
					else if(temp instanceof Duration)
						System.out.println(((Duration)temp).toString());
					else if(temp instanceof Deadline)
						System.out.println(((Deadline)temp).toString());
				}
				
			} else if (cmd.equals("show")) {
				

			} else if (cmd.equals("exit"))
				notExit = false;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scheduler app = new Scheduler();
		app.processCommand();
	}

}
