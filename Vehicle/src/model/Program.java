package model;

import utils.*;

public class Program {

	public static void main(String[] args) {
		CVehicle[] vehicles = VehicleFactory.getListVehicles(20);
		PrintingUtil.print(vehicles);
		PrintingUtil.print(VehicleFilters.getFlyAble(vehicles));
		PrintingUtil.print(VehicleFilters.getCars(vehicles));
		CVehicle[] filteredVehicles = VehicleFilters.getSwimAble(vehicles);
		PrintingUtil.print(filteredVehicles);
		
		System.out.println("-----Sorting-----");
		VehicleSorting.sortByPrice(filteredVehicles);
		PrintingUtil.print(filteredVehicles);
		VehicleSorting.sortByYear(filteredVehicles);
		PrintingUtil.print(filteredVehicles);
		VehicleSorting.sortBySpeed(filteredVehicles);
		PrintingUtil.print(filteredVehicles);
		
		System.out.println("-----Max Speed-----");
		vehicles = VehicleFactory.getListVehicles(10);
		filteredVehicles = VehicleFilters.getSwimAble(vehicles);
		PrintingUtil.print(filteredVehicles);
		System.out.println("Max Speed:" + VehicleSorting.getMaxSpeed(filteredVehicles));
	}
}