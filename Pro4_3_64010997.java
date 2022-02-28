
public class Pro4_3_64010997{
    public static void main(String[] args) 
    {
        double[] number = new double[1000];
        for(int i=0;i<number.length;i++)
        {
            number[i] = Math.random()*1000;
            System.out.printf("%10.2f",number[i]);
            if((i+1)%10==0)
            {
                System.out.println();
            }
        }
        System.out.println("List created");
        System.out.println("Sorting stopwatch starts...");

        StopWatch stopWatch = new StopWatch();
        sort(number);
        stopWatch.stop();
        for(int i=0;i<number.length;i++)
        {
            System.out.printf("%10.2f",number[i]);
            if((i+1)%10==0)
            {
                System.out.println();
            }
        }
        System.out.println("Sorting stopwatch stoped");
        System.out.println("The sort time is "+stopWatch.getElapsedTime()+" milliseconds");
        System.out.println("-----------------------------------");
        System.out.println("The palindromPrime stopwatch starts...");
        System.out.println("Creating 1000 PalindromPrime...");
        stopWatch.start();
        for(int i=2,count=0;count<1000;i++)
        {

            if(Palindrome(i)&&Prime(i))
            {
                System.out.print(i+" ");
                count++;
                if(count%10==0)
                {
                    System.out.println();
                }
            }
        }
        stopWatch.stop();
        System.out.println("The palindromPrime time is "+stopWatch.getElapsedTime()+" milliseconds");

    }
    static void sort(double arr[])
    {
        int n = arr.length;
 
        // One by one move boundary of unsorted subarray
        for (int i = 0; i < n-1; i++)
        {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (arr[j] < arr[min_idx])
                    min_idx = j;
 
            // Swap the found minimum element with the first
            // element
            double temp = arr[min_idx];
            arr[min_idx] = arr[i];
            arr[i] = temp;
        }
    }
    static boolean Prime(int n)
    {
        for(int y=2;y<=Math.sqrt(n);y++)
        {
            if(n%y==0)
            return false;
        }
        return true;
    }

    static boolean Palindrome(int n)
    {
        int sum=0,temp=n;   
        while(n>0)
        {      
        sum=(sum*10)+n%10;    
        n=n/10;    
        }    
        return temp==sum; 
    }  
}

