
public class Class2 extends Class1 {
int a;
Class2(){
	System.out.println("It is class 2s constructor");
}
Class2(int a){
	System.out.println("It is class 2s Agument constructor");
}

void display(){
	System.out.println("It is class 2s ");
	a=20;
	super.a=30;
	int c=a+super.a;
	System.out.println("Sum is :"+c);
	super.display();
}
}
