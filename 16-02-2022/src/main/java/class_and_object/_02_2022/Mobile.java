package class_and_object._02_2022;

public class Mobile {
	
	String mob_name;
	String model;
	String RAM;
	String processor;
	String os_version;
	
	public Mobile()
	{
		mob_name="vivo y31";
		model="V2O36";
		RAM="6.00 GB";
		processor="2.0GHz Snapdragon";
		os_version="Funtouch OS 12 Global";
		
	}
	
	public void getMobileDetails()
	{
		System.out.println(mob_name);
		System.out.println(model);
		System.out.println(RAM);
		System.out.println(processor);
		System.out.println(os_version);
	}

	public static void main(String[] args) {
		
		Mobile mobile1=new Mobile();
		
		mobile1.getMobileDetails();
	}

}