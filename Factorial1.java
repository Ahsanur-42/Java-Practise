import java.util.Scanner;
public class Factorial1{
    public static void main(String []arg)
    {
        int num;
        long fact=1;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        num=input.nextInt();
        for(int i=num;i>0;i--)
            fact*=i;
        System.out.println("Factorial of "+num+" is "+fact);

    }
}