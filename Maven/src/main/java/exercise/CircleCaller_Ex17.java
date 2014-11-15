package exercise;

public class CircleCaller_Ex17 {

	public static void main(String args[]){
		Shape_Ex17 obj1 =  new Circle_Ex17 ("Circle", 10.2);
		String name = obj1.getName();
		Double radius = obj1.getArea();
		
		System.out.println("Name of my shape is: "+name);
		System.out.println("Area of my shape is: "+radius);
		
		Shape_Ex17 obj2 = new Triangle_Ex17 ("Triangle",10,20);
		
		System.out.println("Name of my shape is: "+obj2.getName()+ "\nArea of my shape is: "+obj2.getArea());
		
	}
}
