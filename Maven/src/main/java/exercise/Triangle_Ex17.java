package exercise;

public class Triangle_Ex17 extends Shape_Ex17{

	public double Height;
	public double Weight;
	
	public Triangle_Ex17(){
		
	}	
	public Triangle_Ex17 (String name, double Height, double Weight){
		super(name);
		this.Height = Height;
		this.Weight = Weight;
	}
	
	public double getHeight() {
		return Height;
	}

	public double getWeight() {
		return Weight;
	}

	public double getArea(){
		return (3.14*getHeight()*getWeight());
	}
}
