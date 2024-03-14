package abstractc;

abstract class Addition{
	
	abstract void add();
	
	public void sub()
	{
		System.out.println("Subraction");
	}
}

abstract class ImplementedMethod extends Addition{
	abstract void division();
	public void multipy()
	{
		System.out.println("Multiplication");
	}
}	
class add1 extends ImplementedMethod {
	public void add() {
		System.out.println("addition");
	}
public void division() {
	System.out.println("division");
}
}
 class AbstractExample {

	public static void main(String[] args) {
		add1 a1 = new add1();
		a1.add();
		a1.sub();
		a1.multipy();
		a1.multipy();
	}

}