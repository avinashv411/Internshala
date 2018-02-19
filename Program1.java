package com.intern;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		String todayDate = "2016-11-14";
		System.out.println("Enter from Date :");
		String fromDate = in.next();
		System.out.println("Enter to Date :");
		String toDate = in.next();

		String[] returnVal = datadateParameter(todayDate, fromDate, toDate);
		System.out.println("fromdatereturn :" + returnVal[0]);
		System.out.println("todatereturn :" + returnVal[1]);

	}

	private static String[] datadateParameter(String todayDate, String fromDate, String toDate) {
		String[] monthsDate = { "31", "28", "31", "30", "31", "30", "31", "31", "30", "31", "30", "31" };
		int todayMonth = Integer.parseInt(todayDate.substring(5, 7));
		int toMonth = Integer.parseInt(toDate.substring(5, 7));

		String[] returnVal = new String[2];
		returnVal[0] = fromDate.substring(0, 8) + "01";

		if (todayMonth > toMonth) {
			returnVal[1] = toDate.substring(0, 8) + monthsDate[toMonth + 1];
		} else {
			returnVal[1] = todayDate;
		}

		return returnVal;

	}

}
