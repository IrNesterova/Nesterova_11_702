import java.util.Scanner;

class Program {
	public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
		        int a = sc.nextInt();
				int s = 0;
		        while (a !=-1) {
			      if (a%2 == 0) {
			         s +=a; 
					 }
		               a= sc.nextInt();
			}
	    System.out.println(s);
	}
}