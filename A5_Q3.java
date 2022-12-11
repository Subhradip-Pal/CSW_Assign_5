import java.util.Scanner;

public class A5_Q3 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		System.out.println("Enter the ith & jth term:");
		int i=sc.nextInt(),j=sc.nextInt();
		if(((x>>>i)&1)!=((x>>>j)&1)) {
			long bit=(1L<<i)|(1L<<j);
			x=(int)bit^x;
		}
		System.out.println(x);

	}

}
