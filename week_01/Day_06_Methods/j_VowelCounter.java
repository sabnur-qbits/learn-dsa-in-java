public class j_VowelCounter{
    public static int countVowels(String text){
        int count =0;
        for(int i =0;i<text.length();i++){
            char ch=text.charAt(i);
            if(ch=='a'||ch=='e' ||ch=='i' || ch=='o'||ch=='u'){
                count++;
            }
        }
        System.out.println(count);
        return count;
        
        
    }
    public static void main(String[] args){
        countVowels("java programming");
    }
}