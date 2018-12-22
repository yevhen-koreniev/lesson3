package utils;

import java.util.Arrays;
import model.CVehicle;

public class VehicleList {
	private CVehicle[] filteredVehicles = new CVehicle[0];
	
	public void add(CVehicle vehicle) {
		filteredVehicles = Arrays.copyOf(filteredVehicles, filteredVehicles.length + 1);
		filteredVehicles[filteredVehicles.length - 1] = vehicle;
	}
	
	public CVehicle[] getList() {
		return filteredVehicles;
	}
}