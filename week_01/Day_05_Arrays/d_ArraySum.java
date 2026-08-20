public class d_ArraySum{
    public static void main(String[] args){
        int[] arr={10,20,30,40,50};
        int add = 0;
        for(int i=0;i<arr.length;i++){
            add = add+arr[i];
        }
        System.out.println("Total Sum: " + add);
    }

}