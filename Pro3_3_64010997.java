import java.util.Random;
import java.util.Scanner;

public class Pro3_3_64010997 {

    public static void main(String[]args) 
  { 
    Scanner ip = new Scanner(System.in); 
    System.out.print("Enter the size of the matrix : ");
    int size = ip.nextInt();
    int[][] m = new int[size][size];
    
    generateMatrix(m);
    displayMatrix(m);

    int column = 0 ;
    int row = 0;
    for(int k = 0; k<2; k++)
    {
        for(int i =0 ; i<m.length;i++)
        {
            if(rowSequence(m,k,i))
            {
                System.out.println("All "+ k + "s on raw " + i);
                row++;
            }
        }
    }
    for(int k = 0; k<2; k++)
    {
        for(int i =0 ; i<m.length;i++)
        {
            if(columnSequence(m,k,i))
            {
                System.out.println("All "+ k + "s on raw " + i);
                column++;
            }
        }
    }

    if(column == 0)
    {
        System.out.println("No same numbers on a column");
    }
    if(row == 0)
    {
    System.out.println("No same numbers on a row");
    }
  }
     
 public static boolean rowSequence(int[][] m,int n ,int row )
 { 
    for(int k =0; k < m[row].length;k++)
    {
        if(m[row][k] != n) return false;
    }
    return true;

 }
 public static boolean columnSequence(int[][] m,int n ,int column )
{ 
   for(int i =0; i < m.length;i++)
   {
       if(m[i][column] != n) return false;
   }
   return true;
}
public static void displayMatrix(int[][] m)
{ 
   System.out.println("");
   for(int i =0; i < m.length;i++)
   {
       for(int k =0; k < m[i].length;k++)
       {
         System.out.print(m[i][k]);
       }
       System.out.println("");
   }
}
public static void generateMatrix(int[][] m)
{ 
    int count = 0;
    for(int i = 0 ; i < m.length; i++)
    {
        for(int k = 0; k<m[i].length;k++)
        {
            m[i][k]=(int)(Math.random() *2);
        }
    }
}
}
