public class k_LargestOfThree{
    public static void main(String[] args){
        int x,y,z;
        x = 18;
        y = 18;
        z = 15;
        if(x>y || z>y ){
            //System.out.println("The biggest number is x: "+ x);
            if(x>z){
                System.out.println("The biggest number is: " + x);
            }
        
            else{
               System.out.println("The biggest number is: " + z);
            }
        }
        else{
            System.out.println("The biggest number is: " + y);
        }
    }
 }