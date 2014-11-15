package exercise;
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
//the most basic classes without any implementation. level 1
public interface DBOperations {

	int Create ();
	int Update ();
	int Delete ();
	String Read();
}
