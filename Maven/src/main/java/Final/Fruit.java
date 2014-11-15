/*
 * Exercise 15: (Final) 
Write a class Fruit with properties name, taste and 
originCountry. originCountry should be a final 
variable with value = “USA” and methods String 
getSource();, getWeight() 
getSource() should be a final method. 
Write a sub class Apple and override getWeight 
method and also override getSource() method. 
 */

package Final;

public class Fruit {

	String name;
	String taste;
	final String originCountry = "USA";
	
	public String getSource(String x){
		return x;
	}
	
	public String getWeight(String y) {
		return y;
	}
	
}
