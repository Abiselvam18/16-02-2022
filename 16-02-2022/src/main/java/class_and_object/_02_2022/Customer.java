package class_and_object._02_2022;

public class Customer {
	
	int cust_id;
	String cust_name;
	String cust_address;
	
	public Customer()
	{
		cust_id=100;
		cust_name="Jaishni";
		cust_address="chennai";	;
	}
	
	public void getcustomerDetails()
	{
		System.out.println(cust_id);
		System.out.println(cust_name);
		System.out.println(cust_address);
	}

	public static void main(String[] args) {
		
		Customer customer1=new Customer();
		
		customer1.getcustomerDetails();
	}

}

