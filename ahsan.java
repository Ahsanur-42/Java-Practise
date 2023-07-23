import java.util.Scanner;
public class ahsan {
    int a;
    public void print_a()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("The value of n: ");
        a = input.nextInt();
        System.out.println("The value of a " +a);
    }
    public static void main(String []arg)
    {
        ahsan obj = new ahsan();
        obj.print_a();
    }
    
}
