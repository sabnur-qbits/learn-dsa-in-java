public class t_PrimeCheck{
    public static void main(String[] args){
        int num;
        num = 30;
        boolean isDivisorFound = false;
        for(int n =2;n<=num/2;n++){
            if (num%n==0){
                  isDivisorFound = true; 
                }
            }  
            if(isDivisorFound == true){
             System.out.println("Not Prime");
        }
        else{
            System.out.println("Prime");
        }    
         
        }
}