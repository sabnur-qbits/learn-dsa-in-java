public class m_SumUntilLimit{
    public static void main(String[] args){
        int sum = 0;
        int current = 1;
        do{
            sum = sum+current;
            current++;
    }
        while(sum<=100);
        System.out.println("total sum:" + sum);
    }
}