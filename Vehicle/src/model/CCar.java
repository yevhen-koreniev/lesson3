package model;
import interfaces.MoveAble;

public class CCar extends CVehicle implements MoveAble{

	public CCar(int price, int speed, int year) {
		super(price, speed, year);
	}

	@Override
	public String toString() {
		return "CCar [Price=" + getPrice() + ", Speed=" + getSpeed() + ", Year=" + getYear() + "]";
	}

	@Override
	public int move() {
		// TODO Auto-generated method stub
		return 0;
	}
}