public class h_LinearSearch{
    public static void main(String[] args){
        int[] arr={5, 10, 15, 20, 25};
        int target=15;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("Target found at index: " +i);
                break;
            }
        }

    }
}