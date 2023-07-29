import java.util.Scanner;
public class Calculator{
    int a,b;
    public void print_a()
    {
         System.out.println(" ");
        Scanner input = new Scanner(System.in);
        System.out.print("The value of a: ");
        a = input.nextInt();
    }
    public void print_b()
    {
        Scanner input = new Scanner(System.in);
        System.out.print("The value of b: ");
        b = input.nextInt();
        System.out.println(" ");
        System.out.println("The Total Sum: "+(a+b));
         System.out.println("The Total Sub: "+(a-b));
          System.out.println("The Total Multi: "+(a*b));
           System.out.println("The Total Div: "+(a/b));
            System.out.println("The Total Rem: "+(a%b));
             System.out.println(" ");
    }
    public static void main(String []arg)
    {
        Calculator obj = new Calculator();
        obj.print_a();
        obj.print_b();
    }
}