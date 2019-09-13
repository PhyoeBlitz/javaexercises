public class review4{
    public static void main (String[]args){
        for(int j = 1; j <= 3;j++){
            for(int i =1; i<= 3;i++){
                if(i==j){
                    System.out.print("X");
                }else if(i!=j){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}