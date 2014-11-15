package exercise;

public class Circle_Ex17 extends Shape_Ex17 {

	double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Circle_Ex17 (String name, Double radius){
		super(name);
		this.radius = radius;
	}
	
	public double getArea(){
		return (3.14*radius*radius);
	}
}
