public class i_Fibonacci{
    public static void main(String[] args){
        int prev =0;
        int curr=1;
        int next;
        int count = 1;      
        while(count<=10){
            System.out.print(prev + " ");
            next = prev+curr;
            prev= curr;
            curr = next;
            count++;
            //System.out.println(prev + curr + next);
        }
    
    }
}