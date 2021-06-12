package samplejavaclassobj;

public class Student {
	public static void main(String[] args) {
		Stud s1= new Stud();
		s1.stuname="taj";
		s1.id="aloor";
		s1.age=32;
		s1.printData();
		Stud.m=20;
		System.out.println("The value="+Stud.m);
	
	}
}
	 class Stud
	{ 
	String stuname,id;
	int age;  
	static int m; 
	void printData() {    
		             System.out.println("Student name = "+stuname); 
	                 System.out.println("Student city = "+id);     
	                 System.out.println("Student age = "+age);  
	                 }  
	} 


	

