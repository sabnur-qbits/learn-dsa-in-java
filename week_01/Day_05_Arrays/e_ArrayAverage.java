public class e_ArrayAverage{
    public static void main(String[] args){
        double[] marks={85.0, 90.0, 75.0, 88.0, 92.0, 80.0};
        double add =0;
        for(int i=0;i<marks.length;i++){
            add = add + marks[i];
        }
        double average=add/marks.length;
        System.out.println("Average: " +average);
    }
}