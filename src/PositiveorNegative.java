import java.util.Scanner;

public class PositiveorNegative {
public static void main(String args[])
{
	System.out.println("Enter the number :");
	Scanner s=new Scanner(System.in);
	int a=s.nextInt();
	if (a<0) {
		System.out.println("Negative number");
	}
	else {
		System.out.println("Positive number");
	}
}
}
