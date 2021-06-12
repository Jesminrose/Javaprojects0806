package samplejavaclassobj;

public class Employee {
	int empid;
	String empname;
	Employee(int id, String empname)
	{
		this.empid= id;
		this.empname=empname;
	}
	void info()
	{
		System.out.println("The name=" +empname);
		System.out.println("The id ="+empid);
	}
	
public static void main(String[] args) {
	Employee emp1=new Employee(23,"Rajesh");
	emp1.info();
	}
}
