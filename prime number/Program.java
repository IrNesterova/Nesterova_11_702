import java.util.Scanner;

class Program{
	
	public static boolean isPrime(int number) {
		if (number == 2 || number == 3) {
		return true; 
		}
		
		for (int i = 2; i*i <= number; i++) {
			if (number%i==0) {
				return false;
				} else {
				return true;
				}				
		}  return true;
}         
	
		
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean x = isPrime(n);
		System.out.println(x);
	}
}

		