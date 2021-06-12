package samplejavaclassobj;

public class Consoverloading {
	public static void main(String[] args) {
		
	}
	
class Cs
{
	int p,q;
	public Cs() {}
	public Cs(int x, int y) {
		p=x;
		q=y;
	}
	public int add(int x,int y) {
		return x+y;
	}
	public int add(int i,int j,int k) {
		return(i+j+k);
	}
	public float add(float i, float j) {
		return(i+j);
	}
	public void printdata() {
	System.out.println("The value p="+p);
	System.out.println("The value q="+q);
	}
	
	
}
}
