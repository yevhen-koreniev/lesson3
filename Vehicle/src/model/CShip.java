package model;
import interfaces.SwimAble;

public class CShip extends CVehicle implements SwimAble{

	public CShip(int price, int speed, int year) {
		super(price, speed, year);
	}

	@Override
	public int swim() {
		return getSpeed();
	}

	@Override
	public String toString() {
		return "CShip [Price=" + getPrice() + ", Speed=" + getSpeed() + ", Year=" + getYear() + "]";
	}
}