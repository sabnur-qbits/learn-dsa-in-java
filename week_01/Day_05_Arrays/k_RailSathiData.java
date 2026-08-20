public class k_RailSathiData{
    public static void main(String[] args){
        int[] arr={1200, 1500, 1100, 1800, 1400, 900, 1300};
        int max = 1200;
        int add = 0;
        for(int i=0;i<arr.length;i++){
            add=add+arr[i];
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Total Passengers: " + add);
        System.out.println("Busiest Day Record: " + max);
    }
}