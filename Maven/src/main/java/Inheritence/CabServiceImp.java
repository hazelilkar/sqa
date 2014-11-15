package Inheritence;

public class CabServiceImp implements IBusiness{

	public boolean isOpen(){
		return true;
	}

	public String getContactInfo(){
		return "123-121-21-21";
	}
	public int getCapacity(){
		return 200;
	}
	  public String getCabType(){
	        return "Hybrid";
}
}