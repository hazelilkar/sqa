package basic_learning;

public class MethodsOfString {

	public static void main(String args[]){
		
		String str1 = "Java classes are funny";
		String str2 = "are they really?";
		
		int length = str1.length();
		System.out.println("length of str1 is : " +length);
		
		// Substring is a method that helps you to break down and take specific part of the object.
		String subStr1 = str1.substring(1,length);
		System.out.println("index of : "+subStr1);		
	
		int indexStr2 = str2.indexOf("are");
		System.out.println("Index of 'are' in str2 is : " +indexStr2);
		
		int indexStr3 = str2.indexOf(" are");
		System.out.println("Index of ' are' in str2 is : " +indexStr3);
		// Since in front of the 'are' there is a space and it doesnt exist in str2, it will return us -1.
		
	}
	
}
