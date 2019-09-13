public class exWarmUp{
    public static void main(String[]args){
        int[]array={1,2,3,4,5};
        int number = 5;
        search(array,number);
        
    }
    
    public static int search(int[]a,int value){
        for(int i = 0; i < a.length;i++){
            if(a[i] == value){
                
                System.out.print ("Found the number : " + a[i]);
                return 1;
            }
               
            
        }
         return-1;
    }
}