package utils;

import model.CVehicle;

public class PrintingUtil {
	public static void print(CVehicle[] vehicles) {
		for (int i = 0; i < vehicles.length; i++) {
			System.out.println(vehicles[i]);
		}
		
		addDelimiter();
	}
	
	private static void addDelimiter() {
		System.out.println("\n*******************************************");
	}
}