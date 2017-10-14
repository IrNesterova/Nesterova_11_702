import java.util.Scanner;



class Program {
	public static void main(String[]args){
		int c;
		System.out.println("Input first number: ");
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		System.out.println("Input second number: ");
		int b = sc.nextInt();
		if (a > b) {
			for ( int i = a; i > b+1; i--) {
				c = a - b + 1;
				a = a - 1;
				System.out.print(c+" ");		
						}
		}
		else {
			for ( int i = b; i > a; i--) {
				c = b - a + 1;
				b = b-1;
				System.out.print(c+"");	}
		}
		}
	}

