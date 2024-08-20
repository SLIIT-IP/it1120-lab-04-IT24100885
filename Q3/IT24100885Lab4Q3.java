import java.util.Scanner;
public class IT24100885Lab4Q3 {
        public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter The Number: ");
		int y = input.nextInt();
		String z;
		
		z=y>0?"This Is A Positive Number":y<0?"This Is A Negative Number":"This Is The Zero";
		System.out.print(z);
		}		
}