import java.util.Scanner;


class Program {
	public static void main(String[] args){
		int command;
		int array[] = null; int count = 0;
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1. CREATE AN ARRAY");
		System.out.println("2. ADD ELEMENT IN THE END OF MASSIVE");
		System.out.println("3. ADD ELEMENT ANYWHERE YOU WANT");
		System.out.println("4. DELETE ELEMENT");
		System.out.println("5. PRINT AN ARRAY");
		System.out.println("6. EXIT");

			System.out.println("Enter command");
			command = sc.nextInt();
			
			switch(command){
				
				case 1:
				
					System.out.println("Enter array length");
				    int n = sc.nextInt();
					array = new int[n];
					
					break;
					
				case 2:
				
					int add = sc.nextInt();
					array[count] = add;
					count ++;
					break;

								
				case 3:
				
				System.out.println("Write the place: ");
					int place = sc.nextInt();
					System.out.println("Write a number: ");
	                int val = sc.nextInt();		
					array[place] = val;
							
						for (int i = array.length-1; i > place;i--){
							array[i] = array[i-1];
						}
						break;
				
				case 4:
				
				System.out.println("Write index: ");
					int index = sc.nextInt();
						for (int i = index - 1; i < array.length-1;i++){
							array[i] = array[i+1];
						}
						array[array.length-1] = 0;	
				break;
				
				case 5:
	
				for (int i = 0; i<array.length; i++) {
						System.out.println(array[i] + " "); 
				}
				
				break;
				
				case 6:
					System.exit(0);
			
			
		}
	}
}
}