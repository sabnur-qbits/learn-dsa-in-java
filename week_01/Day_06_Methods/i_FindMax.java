public class i_FindMax{
    public static int findMaximum(int x, int y, int z){
        if(x>y && x>z){
            System.out.println("The maximum number is : " + x);
            return x;
            }
            else if(y>x && y>z){
                System.out.println("The maximum number is : " + y);
                return y;
            }
            else{
            System.out.println("The maximum number is : " + z);
           return y;
            }
    }
      public static void main(String[] args){
        findMaximum(12,15,30);
      }
}