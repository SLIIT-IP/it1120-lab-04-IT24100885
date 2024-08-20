import java.util.Scanner;
public class IT24100885Lab4Q1 {
        public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int x = input.nextInt();
		
		if(x>0)
		{
			System.out.println("Given Number Is Positive: ");
		}
		else if(x<0)
		{
			System.out.println("Given Number Is Negative");
		}
		else if(x==0)
		{
			System.out.println("Given Number Is Zero");
		}			
	}
}