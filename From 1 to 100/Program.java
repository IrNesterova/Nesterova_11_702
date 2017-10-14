import java.util.Scanner;

public class Program{
    public static void main(String[] azazaza){
        Scanner sc = new Scanner(System.in);
        int right = 5050;
        int sum = 0;
        for(int i = 0;i < 100;i++)
        {
            sum += sc.nextInt();
        }
        System.out.println(right-sum);
    }
}
