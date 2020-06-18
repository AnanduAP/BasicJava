import java.util.Scanner;

public class SumOfNnumbers {
public static void main(String args[]){
	int sum=0;
	System.out.println("Enter the limit :");
	Scanner s= new Scanner(System.in);
	int limit=s.nextInt();
	for(int i=0;i<=limit;i++){
		sum=sum+i;
	}
	System.out.println("Sum of the limit is : "+sum);
}
}
