class Program{
	public static void main(String[] args) {
        int[] n = new int[]{-3, 2, 1, 5, -7};
          for (int i = 0; i < n.length; i++) {
            int min = n[i]; 
            int imin = i;   
               for (int j = i + 1; j < n.length; j++) {
                 if (n[j] < min) {
                    min = n[j];
                    imin = j;
                }
            }
 
                if (i != imin) {
                int temp = n[i];
                n[i] = n[imin];
                n[imin] = temp;
            }
            System.out.print(n[i] + " ");
        }
    }
}