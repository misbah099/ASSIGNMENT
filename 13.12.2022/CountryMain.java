package assignments;

public class CountryMain {

	public static void main(String[] args) {
		Country countries = new Country();
		countries.storeCountryNames("India");
		countries.storeCountryNames("USA");
		countries.storeCountryNames("Pakistan");
		countries.storeCountryNames("Bangladesh");
		countries.storeCountryNames("China");

		System.out.println("China: " + countries.retrieveCountry("India"));
		System.out.println("Japan: " + countries.retrieveCountry("Srilanka"));	
	}

}
