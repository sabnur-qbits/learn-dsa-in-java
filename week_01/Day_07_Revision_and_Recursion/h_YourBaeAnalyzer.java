public class h_YourBaeAnalyzer{
    public static int analyzeSteps(int[] dailySteps){
        int sum =0;
        int count =0;
        for(int i=0;i<dailySteps.length;i++){
             sum=sum+dailySteps[i];
            if (dailySteps[i]>10000){
                count++;
            }  
        }
        //return sum;   
        //return count;
        int average=sum/dailySteps.length;
        //return average;
        System.out.println("weekly total steps: " + sum);
        System.out.println("daily Average steps: " + average);
        System.out.println("Days goal met: " + count);
        return 0;

    }
    public static void main(String[] args){
        int[] arr ={8000, 12000, 10500, 9000, 15000, 7000, 11000};
        analyzeSteps(arr);

    }
}