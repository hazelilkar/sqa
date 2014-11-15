/*
 * Write Interface DBOperations, It 
declare 4 methods, create, update, delete and 
read. 
Implementing classes are MySQLDBOperation, 
OracleDBOperation which implement the 
DBOperations interface. Both these classes 
provides the implementation of all the 4 methods. 
Now create an abstract class SomeDBOperations 
implements interface and provides the 
implementation of create method and leave other 
3 methods as abstract. MySQLDBOP.. and Oracle 
DB operation should not have the implementation 
for create method. 
 */

//concrete classes, which provides all missing implementation.
package exercise;
public class MySQLDBOperation extends SomeDBOperations {


	//@Override
	public int Delete(){
		return 0;
	}
	//@Override
	public int Update(){
		return 0;
	}
	//@Override
	public String Read(){
		return null;
	}
}
