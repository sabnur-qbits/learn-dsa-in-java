public class g_FindMin{
    public static void main(String[] argss){
        int[] arr={14, 52, 27, 85, 39, 4};
        int min=14;
        for(int i = 0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Minimum Value: " + min);

    }
}
