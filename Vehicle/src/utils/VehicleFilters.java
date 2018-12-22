package utils;

import model.CCar;
import model.CPlane;
import model.CShip;
import model.CVehicle;

import interfaces.*;

public class VehicleFilters {
	public static CVehicle[] getCars(CVehicle[] vehicles) {
		VehicleList vehicleList = new VehicleList();
		
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof CCar) {
				vehicleList.add(vehicles[i]);
			}
		}
		
		return vehicleList.getList();
	}
	
	public static CVehicle[] getPlanes(CVehicle[] vehicles) {
		VehicleList vehicleList = new VehicleList();
		
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof CPlane) {
				vehicleList.add(vehicles[i]);
			}
		}
		
		return vehicleList.getList();
	}
	
	public static CVehicle[] getShips(CVehicle[] vehicles) {
		VehicleList vehicleList = new VehicleList();
		
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof CShip) {
				vehicleList.add(vehicles[i]);
			}
		}
		
		return vehicleList.getList();
	}
	
	public static CVehicle[] getSwimAble(CVehicle[] vehicles) {
		VehicleList vehicleList = new VehicleList();
		
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof SwimAble) {
				vehicleList.add(vehicles[i]);
			}
		}
		
		return vehicleList.getList();
	}
	
	public static CVehicle[] getFlyAble(CVehicle[] vehicles) {
		VehicleList vehicleList = new VehicleList();
		
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof FlyAble) {
				vehicleList.add(vehicles[i]);
			}
		}
		
		return vehicleList.getList();
	}
	
	public static CVehicle[] getMoveAble(CVehicle[] vehicles) {
		VehicleList vehicleList = new VehicleList();
		
		for (int i = 0; i < vehicles.length; i++) {
			if (vehicles[i] instanceof MoveAble) {
				vehicleList.add(vehicles[i]);
			}
		}
		
		return vehicleList.getList();
	}
}