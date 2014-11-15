package exercise;

public class Country {
	
	String countryName;
	String countryCode;
	String currency;
	long population;
	
	//defining overloaded constructor with above param and setting all properties
	public Country(String countryName,String countryCode, String currency, long population){
		this.countryName=countryName;
		this.countryCode=countryCode;
		this.currency=currency;
		this.population=population;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public long getPopulation() {
		return population;
	}

	public void setPopulation(long population) {
		this.population = population;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((countryCode == null) ? 0 : countryCode.hashCode());
		return result;
	}

	//generating hashcode using countryCode as criteria
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Country other = (Country) obj;
		if (countryCode == null) {
			if (other.countryCode != null)
				return false;
		} else if (!countryCode.equals(other.countryCode))
			return false;
		return true;
	}
	
	
	
}
