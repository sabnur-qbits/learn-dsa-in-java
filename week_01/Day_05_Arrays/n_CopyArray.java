public class n_CopyArray{
    public static void main(String[] args){
        int[] source={1, 2, 3, 4, 5};
        int[] destination={0,0,0,0,0}; 
        int i;
        System.out.print("Destination array: ");
        for(i =0;i<source.length;i++){
            destination[i]=0+source[i];
            System.out.print( destination[i] + " ");
        }
        
    }
}