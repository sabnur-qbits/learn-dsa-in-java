public class l_YourBaeCalories{
    public static void main(String[] args){
        double[] arr={450.0, 520.0, 600.0, 499.5, 510.0};
        double goal=500.0;
        for(int i =0;i<arr.length;i++){
            if(goal>arr[i]){
            System.out.println("Day " + i + " : Goal met.");
            }
            else{
                System.out.println("Day " + i + ": Goal missed.");
            }
        }
    }
} 
