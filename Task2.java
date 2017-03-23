import java.util.Scanner;
public class Task2 {
  
    public static void main(String[] args) {
	Scanner in = new Scanner(System.in);
        int a = in.nextInt();
		int b = in.nextInt();
		int n=1;
		for(int i = 0; i < b; i++) n *= a;
		System.out.println("A^B=" + n );
  
    }
  
}