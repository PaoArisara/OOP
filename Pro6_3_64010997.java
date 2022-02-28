public class Pro6_3_64010997
{
        public static void main(String[] args) {
            Queue q1 = new Queue();
            for (int i = 0; i < 20; i++) {
                q1.enqueue(i+1);
            }
            int v =0;
            while (!q1.empty()){
                System.out.println(q1.dequeue());
                v++;
                if(v==5)
                {
                    //System.out.println("");
                    v=0;
                }
            }
        }
}