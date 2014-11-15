package Inheritence;

public class IBusinessCaller {

	public static void main(String args[]){
		CabServiceImp b1 = new CabServiceImp();
		RestaurantImp b2 = new RestaurantImp();
	
		 System.out.println("Cab : "+b1.getCapacity()+"\n"+b1.getContactInfo()
	                +"\n"+b1.isOpen()+"\n"+b1.getCabType());
	         
	        System.out.println("Resturant : "+b2.getCapacity()+"\n"+b2.getContactInfo()
	                +"\n"+b2.isOpen()+"\n"+b2.getMenu(true));
	         
		
	}
}
