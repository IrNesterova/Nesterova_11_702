import java.util.Scanner;

class Program {
	Scanner sc = new Scanner(System.in); 
	
	public static void CreateArray() {
		System.out.println("Enter array length");
		int n = sc.nextInt();
		array = new int [n];
	}
	
	public static void AddElement() {
		System.out.println("Write an element you wanna add");
		int add = sc.nextInt;
		array[count]=add;
		count++;
	}
	
	public static void AddElementAnywhere() {
		System.out.println("Write the place: ");
		int place = sc.nextInt();
		System.out.println("Write the number: ");
		int val = sc.nextInt();
		array[place]=val;
		
		for (int i = array.length-1; i > place; i--); {
			array[i]=array[i-1];
		}
	}
		
	public static void DeleteElement() {
		System.out.println("Write index: ");
			int index = sc.nextInt();
			for (int i = index - 1; i < array.length-1;i++){
				array[i] = array[i+1];
			}
			array[array.length-1] = 0;
	}

	
	public static void PrintArray() {
		for (int i = 0; i<array.length; i++) {
			System.out.print(array[i] + " ");
		}
	}
	
	public static void main(String[]args) {
		while(true) {
		Scanner sc = new Scanner(System.in);
		System.out.println("MENU");
		System.out.println("1. CREATE AN ARRAY");
		System.out.println("2. ADD ELEMENT IN THE END OF MASSIVE");
		System.out.println("3. ADD ELEMENT ANYWHERE YOU WANT");
		System.out.println("4. DELETE ELEMENT");
		System.out.println("5. PRINT AN ARRAY");
		System.out.println("6. EXIT");
		int count = 0;
		int array[]=null; int command;

			System.out.println("Enter command");
			command = sc.nextInt();
			
			switch(command){
				case 1:
				CreateArray();
				break;
				
				case 2:
				AddElement();
				break;
				
				case 3:
				AddElementAnywhere();
				break;
				
				case 4:
				DeleteElement();
				break;
				
				case 5:
				PrintArray();
				break;
				
				case 6:
				System.exit(0);
			}
		}
	}
}
	
				
				
				
		
		
		