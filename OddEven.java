import java.util.Scanner;
class OddEven{
	public static void main(String[] agrs){
		Scanner in = new Scanner(System.in);
		System.out.println("Enter First Number : ");
		int a=in.nextInt();
		
		if(a%2==0){
			System.out.println("Even Number!!");

		}
		else{
			System.out.println("Odd number!!");
		}
	}
}