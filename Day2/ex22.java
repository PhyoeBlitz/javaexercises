public class ex22{
    public static void main(String []args){
        int c=1;
        for(int j = 1; j <= 5;j++){
            for(int i = 1; i<= 5;i++){
                
                if(i==j){
                    System.out.print(c);
                    c++;
                    
                }else if(i+j==6){
                    System.out.print(c);
                    c++;
                }else if(i!=j){
                    System.out.print(" ");
                }
            
            }
            System.out.println(" ");
        }
    }
}