package exercise;

/*This class implements the interface, which means it will have to 
implement all the methods of interface. But this class decides to provide
the implementation of only 1 method and delegate the 3 remaining methods to
further child classes. In order to do that, you will have to define this
class as abstract class, which means you are providing imple. for some and not
for some. (level 2)
 */
public abstract class SomeDBOperations implements DBOperations{

	//@Override
	public int Create() {
		// TODO Auto-generated method stub
		return 0;
	}   
}
