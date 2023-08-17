import java.util.Scanner;
public class ArraySearch 
{
    public static void main(String []arg)
    {
        int arr[] = new int[10];
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the value of Array: ");
        for(i=0;i<10;i++)
        arr[i] = input.nextInt();

        for(i=0;i<10;i++)
        System.out.println("The output is: "+arr[i]);

        System.out.print(" ");
        System.out.print("Enter any element for searching: ");
        int searchElement = input.nextInt();
        for(i=0;i<10;i++)
        if(searchElement==arr[i])
        {
            System.out.println("Found at position!");
            break;
        }
        if(i==10)
        System.out.println("Not Found!");
    }
}
