package utils;

import java.util.Arrays;
import java.util.Comparator;

import model.CVehicle;

public class VehicleSorting {
	public static void sortByPrice(CVehicle[] vehicles) {
		Arrays.sort(vehicles, new CompareByPrice());
	}
	
	public static void sortBySpeed(CVehicle[] vehicles) {
		Arrays.sort(vehicles, new CompareBySpeed());
	}
	
	public static void sortByYear(CVehicle[] vehicles) {
		Arrays.sort(vehicles, new CompareByYear());
	}
	
	public static int getMaxSpeed(CVehicle[] vehicles) {
		sortBySpeed(vehicles);
		
		return vehicles[vehicles.length - 1].getSpeed();
	}
}

class CompareByPrice implements Comparator<CVehicle>{
	@Override
	public int compare(CVehicle o1, CVehicle o2) {
		return o1.getPrice() - o2.getPrice();
	}
}

class CompareBySpeed implements Comparator<CVehicle>{
	@Override
	public int compare(CVehicle o1, CVehicle o2) {
		return o1.getSpeed() - o2.getSpeed();
	}
}

class CompareByYear implements Comparator<CVehicle>{
	@Override
	public int compare(CVehicle o1, CVehicle o2) {
		return o1.getYear() - o2.getYear();
	}
}