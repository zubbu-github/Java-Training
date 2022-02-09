package day3;

public class InheritanceUsedForOverridingPolymorphismDemo extends A {

	int a =5;
	int b =9;
	int c;
	
	void sum() {
		c=a+b;
		System.out.println("Result: " + c);
	}
		void multiplication(int a, double b) {//parent
			System.out.println("Parent Result of Multiplication: " +(a*b));
			System.out.println("Hello Child");
		}
		void display() {
			System.out.println("Hello CHild");
		}
	public static void main(String[] args) {
		InheritanceUsedForOverridingPolymorphismDemo iufopd = new InheritanceUsedForOverridingPolymorphismDemo();
		iufopd.sum();
		iufopd.multiplication(3, 6.5);
		A a = new A();
		a.display();
		iufopd.display();
	}

}

class A{
	void multiplication(int a, double b) {//parent
		System.out.println("Parent Result of Multiplication: " +(a*b));
	}
	void display() {
		System.out.println("Hello PArent");
	}
	
}
