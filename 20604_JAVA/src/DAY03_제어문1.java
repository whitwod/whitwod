import java.util.Scanner;

public class DAY03_���1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b;
		char op;
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("����:");
			a = sc.nextInt();
			System.out.println("����:");
			b = sc.nextInt();
			System.out.println("�����:");
			op = sc.next().charAt(0);
			
			switch (op) {
			case '+':
				System.out.println(a + "+" + b + "=" + (a+b));
			case '-':
				System.out.println(a + "-" + b + "=" + (a-b));
			case '*':
				System.out.println(a + "*" + b + "=" + (a*b));
			case '/':
				System.out.println(a + "/" + b + "=" + (a/b));
				break;
				
			default:
				break;
			}
		}
		
		
		
	}

}
