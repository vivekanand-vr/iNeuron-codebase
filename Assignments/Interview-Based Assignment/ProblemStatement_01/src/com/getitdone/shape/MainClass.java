package com.getitdone.shape;

public class MainClass {

	public static void main(String[] args) {
		IShape circle=new Circle(20);
		float area = circle.calcArea();
		System.out.println("Area of the circle is :"+area);
		float perimeter = circle.calcPerimeter();
		System.out.println("Perimeter of the circle is "+perimeter);
		System.out.println();
		System.out.println("----------------------------------");
		System.out.println();
		IShape triangle=new Triangle(20,15,10,15);
		System.out.println("Area of the Triangle is"+triangle.calcArea());
		System.out.println("Perimeter of the Triangle is"+triangle.calcPerimeter());

	}

}
