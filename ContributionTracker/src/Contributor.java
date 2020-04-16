
public class Contributor {
	String _name;
	String _city;
	String _country;
	String _phone;
	double _contribution;
	int _id;
	
	public Contributor(String name, String city, String country, String phone, double contribution, int id) {
		_name = name;
		_city = city;
		_country = country;
		_phone = phone;
		_contribution = contribution;
		_id = id;
	}
	
	void printContributor(){
		System.out.println("Name: " + _name);
		System.out.println("City: " + _city);
		System.out.println("Country: "+ _country);
		System.out.println("Phone: " + _phone);
		System.out.println("Contribution: " + _contribution);
		System.out.println("ID: " + _id);
	}
	
	
}
