public class c_FizzBuzz{
    public static void main(String[] args){
        for(int i=1;i<=20;i++){
            if(i%3==0 && i%5==0){
                System.out.print("FizzBuzz");
                 System.out.print(",");
            }
            else if(i%5==0){
                System.out.print("Buzz");
            }
            else if(i%3==0){
                System.out.print("Fizz");
               System.out.print(",");  

            }
            else{
                System.out.print(i);
                 System.out.print(",");
            }
             
        }
       
    }
}