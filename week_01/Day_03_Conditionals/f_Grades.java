public class f_Grades{
    public static void main(String[] args){
        double score;
        score =-25;
        if(score >=90){
            System.out.println("GRADE A");
        }
        else if(score >=80){
            System.out.println("GRADE B ");
        }
        else if(score >=70){
            System.out.println("GRADE C ");
        }
        else if(score < 0 || score > 100){
            System.out.println("INVALID");
        }
        else{
            System.out.println("FAIL ");
        }
    }
}