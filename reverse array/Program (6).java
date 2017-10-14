import java.util.Scanner;

class Program {
   public static void main(String args[])   {
       int length, i, j, temp;
       Scanner sc = new Scanner(System.in);
	   System.out.print("Enter array length : ");
       length = sc.nextInt();
	   int array[]= new int [length];
	   System.out.print("Enter array elements : ");
       for(i=0; i<length; i++)
       {
           array[i] = sc.nextInt();
       }
	   j = i - 1;     
       i = 0;        
	   while(i<j)
       {
           temp = array[i];
           array[i] = array[j];
           array[j] = temp;
           i++; j--;
       }
	   System.out.print("Reverse array: ");
       for(i=0; i<length; i++)
       {
           System.out.print(array[i]+ "  ");
       }       
   }
}