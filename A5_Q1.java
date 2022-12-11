import java.util.Scanner;
public class A5_Q1 {
	public static int count(int x)
	{
		int numBits=0;
		while(x!=0) {
			numBits=numBits+(x&1);
			x=x>>>1;
		}
		return numBits;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:");
		int x=sc.nextInt();
		System.out.println(count(x));

	}

}
