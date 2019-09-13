public class reduseEx{
    public static void main(String[]args){
        int []number ={1,2,3,4,5};
        int total =0;
        total =reduse (number,total);
        System.out.print(total);
    }
    public static int reduse(int[]a,int total){
        
        for(int i =0;i< a.length;i++){
            total = total + a[i];
        }
        
        return total;
        
    }
    
}