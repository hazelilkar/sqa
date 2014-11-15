////HomeWork : Exercise 9 : Write a fruit class that defines 4 constructors:
//a)	default constructor
//b)	constructor with 1 argument (String name)
//c)	constructor with 2 arguments (String name, String taste)
//d)	constructor with 3 arguments (String name, String taste, String color);
//Only one of the constructor should have the initialization code and rest of the constructors should use “this(…)” syntax. 
//From the main method, create 4 objects one for each constructor type and print the properties after each object is created.

package sqa_learning.classObject;

public class Fruit {

	private String name;
	private String taste;
	private String color;
	
	public void print(){
		System.out.println("Fruit's features: "+name+" " +taste +" " +color);
	}
	
	public Fruit (){	
		this(null,null,null);
	}
	
	public Fruit (String name){
	this(name,null,null);
	}
	
	public Fruit (String name, String taste){
		this(name,taste,null);
	}
	public Fruit (String name, String taste, String color){
		this.name=name;
		this.taste=taste;
		this.color=color;
	}
	public static void main(String args[]){
		Fruit fruit1 = new Fruit("Apple", "Sour","Green");
		Fruit fruit2 = new Fruit("Pineapple", "Sweet");
		Fruit fruit3 = new Fruit ("Grape");
		Fruit fruit4 = new Fruit();
			fruit1.print();
			fruit2.print();
			fruit3.print();
			fruit4.print();
	}
	
}
