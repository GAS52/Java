import java.util.Scanner;
public class Task3 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
        int a = in.nextInt();
		int b = fact(a);
		System.out.println(a + "!=" + b);
	}
	static int fact (int n) {
			if(n==1)
			return 1;
		else
			return n*fact(n-1);
		}
}