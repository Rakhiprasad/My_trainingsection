package programs;

public class Employes
{
	String empName;
	int empId;
	static String companyName="obsqura";

	
	public Employes(String name,int id)
	{
	empName=name;
	empId=id;
	}
	
	public static void main(String[] arg)
	{
	Employes obj1= new Employes("rak",10);
	System.out.println("name"+obj1.empName);
	System.out.println("id"+obj1.empId);
	System.out.println("company name"+obj1.companyName);
	}
}
