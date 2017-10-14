import java.util.Scanner;

class Program {
	public static double function(double x) {
		return Math.sin(1/x);
	}
	
	public static double integrate(double a, double b, double h) {
		double result = 0;
		for (double i = a; i<=b; i +=h) {
			if (i !=0) {
				result = result + h * function(i); 
			}
		}
		return result;
	}
	
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("¬ведите a: ");
		double a = sc.nextDouble();
		System.out.println("¬ведите b: ");
		double b = sc.nextDouble();
		System.out.println("¬ведите количество шагов: ");
		int n = sc.nextInt();
		
		double h = Math.abs((a+b)/n);
		double integr = integrate(a,b,h);
		System.out.println(integr);
	}
}