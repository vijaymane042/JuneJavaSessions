package oos_encapsulation;

public class Registration {

	private String firstname;
	private String lastname;
	private String email;
	private String address;
	private String mobileno;
	//constructor
	public Registration(String firstname, String email) {
		this.firstname = firstname;
		this.email = email;
	}
	public Registration(String firstname, String email, String mobileno) {
		this.firstname = firstname;
		this.email = email;
		this.mobileno = mobileno;
	}
	public Registration(String firstname, String lastname, String email, String address, String mobileno) {
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.mobileno = mobileno;
	}
	
	//getter and setter
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	
	
	
	
	
	
	
	
	
	
}
