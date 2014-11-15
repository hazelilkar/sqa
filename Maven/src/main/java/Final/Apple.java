package Final;
/*
 *Exercise 15: (Final) 
Write a class Fruit with properties name, taste and 
originCountry. originCountry should be a final 
variable with value = “USA” and methods String 
getSource();, getWeight() 
getSource() should be a final method. 
Write a sub class Apple and override getWeight 
method and also override getSource() method. 
 */

public class Apple extends Fruit {

	// We cannot override the final method. Since this method was final in parent, we are not allow to override it.
	@Override
	public final String getSource(String x){
		return x + "a";
	}
	
	@Override
	public String getWeight(String y) {
		return y + "abc";
	}
	
}
