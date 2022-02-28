class Main {
    public static void main(String[] args) {
        int c,num,line=0;//ckeck
        int count=0;
        //prime
        
        for(int i=2;i<=100000;i++)
        {
            c=1;
            for(int y=2;y<i;y++)
            {
                if(i%y==0)
                    c=0;
            }
            if(c==1)
            {
                num=i;
                int r,sum=0,temp;    
                temp=num;    
                while(num>0){    
                r=num%10;  //getting remainder  
                sum=(sum*10)+r;    
                num=num/10;    
            }    
            if(temp==sum)
            {  
                if (line != 10 && count<100)
                System.out.print(i+" ");  
                line++;
                count++;
                if(line==11)
                {
                    System.out.println(); 
                    line=1; 
                 }
            }
            }
        
        }
    } 
}