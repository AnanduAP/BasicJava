import java.util.Scanner;

public class SumUsingFun {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("Enter the numbers");
	int num1=s.nextInt();
	int num2=s.nextInt();
	int total=sum(num1,num2);
	System.out.println("Sum of the digits is :" +total);
}
static int sum(int a,int b){
	int s=a+b;
	return s;
}
}
