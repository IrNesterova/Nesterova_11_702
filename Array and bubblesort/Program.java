import java.util.Scanner;


class Program{
	public static void bubbleSort(int array[]){
		for (int i = 0; i<array.length; i++){
			for (int j=0; j < array.length - 1; j++) {
				if (array[j]>array[j+1]){
					int temp = array[j];
					array[j]=array[j+1];
				    array[j+1]=temp; 
					}
			}
		}
}

	
public static void main(String[]args){
	
	Scanner sc= new Scanner(System.in);
	
	int n = sc.nextInt();
	int array[]= new int [n];
	
	for(int i = 0; i<array.length; i++) {
	     array[i] = sc.nextInt(); 
		 }
		 
		 bubbleSort(array);
		 
	for (int i = 0; i<array.length; i++) {
	      System.out.print(array[i]+" "); 
		  }
	
    Scanner in=new Scanner(System.in);
    int c = in.nextInt();
    int d[]=new int [c];

    for (int i = 0; i<d.length; i++) {
	  d[i]= sc.nextInt(); 
	      }
		  
	     bubbleSort(d);
		 
    for (int i = 0; i<d.length; i++) {
	System.out.print(d[i]+" "); 
		}
	}
}       
				
		
		
		