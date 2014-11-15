package exercise;

public class Ex19_Country {
	String countryCode; 
	String countryName; 
	long population; 
	String currency;
	
	
	public Ex19_Country (){}
	public Ex19_Country ( String countryCode, String countryName, long population, String currency){
		this.countryCode = countryCode;
		this.countryName = countryName;
		this.population = population;
		this.currency = currency;
	}
	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	public void setPopulation(long population) {
		this.population = population;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ex19_Country other = (Ex19_Country) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		return true;
	}
//	@Override
//	public int hashCode() {
//		final int prime = 31;
//		int result = 1;
//		result = prime * result
//				+ ((countryCode == null) ? 0 : countryCode.hashCode());
//		return result;
//	}

}
