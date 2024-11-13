package com.company.liskov_1;

public class Square extends Shape {
	
	private int side ;

	public Square(int side) {
		this.side = side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	public int getSide() {
		return side;
	}

	@Override
	public int computeArea() {
		return side * side;
	}
}
