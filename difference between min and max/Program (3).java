import java.util.Scanner;

public class Program {
	public static void main(String[]args){
		int min = 2^31-1;
		int max = -2^31;
		Scanner sc = new Scanner(System.in);
		int length=sc.nextInt();
		int array[]=new int[length];
		for (int i =0; i<array.length; i++){
		array[i]=sc.nextInt();
		}
		for (int i:array)
		{ if (min > i)
			{ min = i; }
		if (max < i) 
		{ max = i; }
		}
            System.out.println(max-min);
	}
}	
		