public class f_FindMax{
    public static void main(String[] argss){
        int[] arr={14, 52, 27, 85, 39, 4};
        int max=14;
        for(int i = 0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Maximum Value: " + max);

    }
}