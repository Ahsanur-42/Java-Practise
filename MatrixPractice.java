import java.util.Scanner;
public class MatrixPractice 
{
    int mat1[][] = new int[3][3];
    int mat2[][] = new int[3][3];
    int outmat[][] = new int[3][3];
    MatrixPractice()
    {
        System.out.println("Enter first Matrix: ");
        Scanner input = new Scanner(System.in);
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        mat1[i][j] = input.nextInt();

        System.out.println("Enter second Matrix: ");
        for(int i=0;i<3;i++)
        for(int j=0;j<3;j++)
        mat2[i][j] = input.nextInt();
    }
        void addMatrix()
        {
            for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            outmat[i][j] = mat1[i][j]+mat2[i][j];
            
            System.out.println("Addition Matrix is: ");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                System.out.print(outmat[i][j]+" ");
                System.out.println(" ");
            }
        }
        void subMatrix()
        {
            for(int i=0;i<3;i++)
            for(int j=0;j<3;j++)
            outmat[i][j] = mat1[i][j]-mat2[i][j];

            System.out.println("Substraction Matrix is: ");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                System.out.print(outmat[i][j]+" ");
                System.out.println(" ");
            }

        }
        int temp=0;
        void multiMatrix()
        {
            for(int i=0;i<3;i++)
            {
                 for(int j=0;j<3;j++)
                 {
                    temp=0;
                    for(int k=0;k<3;k++)
                         temp+=mat1[i][k]*mat2[k][j];
                    outmat[i][j]=temp;
                 }
            }
            System.out.println("Multiplication Matrix is: ");
            for(int i=0;i<3;i++)
            {
                for(int j=0;j<3;j++)
                {
                    System.out.print(outmat[i][j]+" ");
                    
                }
                System.out.println(" ");
            }
            
        }
    
    public static void main(String []arg)
    {
        MatrixPractice obj = new MatrixPractice();
        obj.addMatrix();
        obj.subMatrix();
        obj.multiMatrix();
    }
}
