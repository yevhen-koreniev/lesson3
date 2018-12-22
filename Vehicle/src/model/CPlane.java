package model;
import interfaces.FlyAble;

public class CPlane extends CVehicle implements FlyAble{

	public CPlane(int price, int speed, int year) {
		super(price, speed, year);
	}

	@Override
	public int fly() {
		return getSpeed();
	}

	@Override
	public String toString() {
		return "CPlane [Price=" + getPrice() + ", Speed=" + getSpeed() + ", Year=" + getYear() + "]";
	}

}