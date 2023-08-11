import java.util.Scanner;
public class Array{
    public static void main(String []arg)
    {
        int arr[] = new int[10];
        int i;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter value of Array: ");
        for(i=0;i<10;i++)
        arr[i] = input.nextInt();

        for(i=0;i<10;i++)
        System.out.println("The Output is: "+arr[i]);

        System.out.print(" ");
        System.out.print("Enter element for searching: ");
        int SearchElement = input.nextInt();
        for(i=0;i<10;i++)
        if(SearchElement==arr[i])
        {
            System.out.println("Found at position!");
            break;
        }
        if(i==10)
        System.out.println("Not Found!");
    }
    
}
