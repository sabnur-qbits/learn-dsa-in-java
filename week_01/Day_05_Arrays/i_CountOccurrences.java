public class i_CountOccurrences{
    public static void main(String[] args){
        int[] arr={2, 5, 2, 8, 2, 9};
        int target=2;
        int c=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                c++;
            }
        } 
        System.out.println("The number 2 appears " + c + " times.");
    }
}