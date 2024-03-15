package com.getitdone.shape;

public class Circle implements IShape {
	private float radius;
	
	public Circle(float radius) {
		this.radius=radius;
	}

	@Override
	public float calcArea() {
		
		return (float) (Math.PI*radius*radius);
	}

	@Override
	public float calcPerimeter() {
		
		return (float) (2*Math.PI*radius);
	}

}
