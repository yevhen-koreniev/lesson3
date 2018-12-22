package model;

import interfaces.FlyAble;
import interfaces.MoveAble;
import interfaces.SwimAble;

public class CBatmobile extends CVehicle implements MoveAble, SwimAble, FlyAble{

	public CBatmobile(int price, int speed, int year) {
		super(price, speed, year);
	}

	@Override
	public int fly() {
		return getSpeed()*2;
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
		return "CBatmobile [Price=" + getPrice() + ", Speed=" + getSpeed() + ", Year=" + getYear() + "]";
	}

}