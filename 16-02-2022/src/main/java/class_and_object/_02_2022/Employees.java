package class_and_object._02_2022;

/**
 * class: it is a template to the object/instance
 * 
 * object/instance: it is a physical entity, which have memory allocation in RAM(Heap).
 *
 */

//class contains state(variables) and behavior(methods)
public class Employees 
{
   
	//state(variables)
	int id;
	String name;
	double salary;
	String address;
	
	//constructor: used to initialize an object(state)
	public Employees() 
	{
		id = 1000;
		name = "Ananya";
		salary = 12000.80;
		address = "chennai";
	}
	
	//behavior(methods)
	public void getEmployeeDetails()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(salary);
		System.out.println(address);
	}
	
	public static void main( String[] args )
    {
		
		Employees employee1 = new Employees();		
		
		employee1.getEmployeeDetails();
		
		
    }
	
}