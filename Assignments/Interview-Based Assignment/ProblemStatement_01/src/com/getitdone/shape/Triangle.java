package com.getitdone.shape;

public class Triangle implements IShape {
	
	private float base ;
	private float height;
	private float side1;
	private float side2;
	
    
	public Triangle(float base, float height, float side1, float side2) {
		super();
		this.base = base;
		this.height = height;
		this.side1 = side1;
		this.side2 = side2;
	}

	@Override
	public float calcArea() {
		
		return (height*base)/2;
	}

	@Override
	public float calcPerimeter() {
		
		return side1+side2+base;
	}

}
