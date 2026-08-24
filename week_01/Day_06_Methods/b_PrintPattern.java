public class b_PrintPattern{
    public static void printLine(String line){
        System.out.println(line);
        for(int i=1;i<=30;i++){
            System.out.print("-");
        }

    }
    public static void main(String[] args){
        printLine("Main Title");
        System.out.println();
        printLine("Subtitle here");
    }
}