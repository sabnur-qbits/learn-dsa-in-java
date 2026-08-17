public class s_WavesScanner{
    public static void main(String[] args){
        for(int i=1;i<=15;i++){
            if(i%3 == 0){
                System.out.println("File " +i + "- Pirated Content Detected!");
            }
            else{
                System.out.println("File " +i + "- Clean!");
            }
        }
    }
}