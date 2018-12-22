package model;

import interfaces.MoveAble;
import interfaces.SwimAble;

public class CAmphibia extends CVehicle implements MoveAble, SwimAble{

	public CAmphibia(int price, int speed, int year) {
		super(price, speed, year);
	}

	@Override
	public int swim() {
		return getSpeed()/2;
	}

	@Override
	public int move() {
		return getSpeed();
	}

	@Override
	public String toString() {
		return "CAmphibia [Price=" + getPrice() + ", Speed=" + getSpeed() + ", Year=" + getYear() + "]";
	}

}