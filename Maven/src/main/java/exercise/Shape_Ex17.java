package exercise;

public abstract class Shape_Ex17 {

	String name;
	
	public Shape_Ex17(){}
	
	public Shape_Ex17 (String name){
		this.name = name;
	}
	
	public abstract double getArea();

	public String getName() {
		return name;
	}

}
