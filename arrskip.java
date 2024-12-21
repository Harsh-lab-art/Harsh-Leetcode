
import java.util.*;
class arrskip
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
       System.out.println("enter the no. rows");
       int r=sc.nextInt();
       System.out.println("enter the no.of coloumns");
       int c=sc.nextInt();
       int arr[][]=new int[r][c];
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
         {
            arr[i][j]=sc.nextInt();
         }
       }
       for(int i=0;i<r;i++)
       {
        for(int j=0;j<c;j++)
        {
            if((i+j)%2==0)
            {
                System.out.print("  ");
            }
            else
            {
             System.out.print(arr[i][j]+"  ");
            }
       }
       System.out.println(" ");
      }
   }
}

