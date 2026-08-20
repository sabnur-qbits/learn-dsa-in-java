public class o_CompareArrays{
    public static void main(String[] args){
        int[] arr1={1,2,3};
        int[] arr2={1,2,3};
        boolean flag = true;
        if(arr1.length!=arr2.length){
            flag=false;
        }
        else{
           for(int i=0;i<arr1.length;i++){
                if(arr1[i]!=arr2[i]){
                  flag = false;
                }
            }
        }    
          if(flag){
        System.out.println("Arrays are equal");
        }
        else{
            System.out.println("Arrays are different");
        
        }
    }

    }
