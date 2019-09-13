public class ex25{
    public static void main(String[]args){
        int[]n = {12,32,43,8,42,90};
        
        for(int x = 0; x<=5;x++){
            System.out.print(n[x] + " ");
            if( x==5){
            System.out.println(" ");
            }
        }
        
        for(int x = 5; x>=0;x--){
            System.out.print(n[x] + " ");
        }
    }
}