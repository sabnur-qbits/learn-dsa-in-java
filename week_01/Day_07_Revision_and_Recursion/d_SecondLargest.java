public class d_SecondLargest{
    public static void main(String[] args){
        int[] arr={10, 5, 20, 8,20,15};
        int max=0;
        int secondmax =0;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
            secondmax = max;
            max = arr[i];
            }
            else if (arr[i]>secondmax && arr[i]!=max){
                secondmax=arr[i];
            }
        }
        System.out.println(secondmax);
    }
}