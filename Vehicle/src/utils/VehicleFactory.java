package utils;

import model.*;

public class VehicleFactory {
	public static CVehicle getVehicle(int i){
		switch (i) {
		case 0: return new CAmphibia(getRndPrice(2), getRndSpeed(1), getRndYear());
		case 1: return new CBatmobile(getRndPrice(4), getRndSpeed(4), getRndYear());
		case 2: return new CCar(getRndPrice(1), getRndSpeed(2), getRndYear());
		case 3: return new CPlane(getRndPrice(5), getRndSpeed(5), getRndYear());
		case 4: return new CShip(getRndPrice(3), getRndSpeed(3), getRndYear());
				
		default: return null;
		}
	}
	
	public static CVehicle randVehicle(){
		return getVehicle((int) (Math.random()*5));
	}
	
	public static CVehicle[] getListVehicles(int n){
		CVehicle[] masVeh = new CVehicle[n];
		
		for (int i = 0; i < masVeh.length; i++) {
			masVeh[i]=randVehicle();
		}
		
		return masVeh;
	}
	
	public static int getRndYear() {
		return (int)(Math.random() * 18) + 2000;
	}
	
	public static int getRndPrice(int factor) {
		return (int)(Math.random() * 2000) + factor*20000;
	}
	
	public static int getRndSpeed(int factor) {
		return (int)(Math.random() * 50) + factor*100;
	}
}