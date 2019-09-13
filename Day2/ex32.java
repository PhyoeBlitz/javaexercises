public class ex32{
    public static void main (String[]args){
        for(int j = 1 ; j <= 3; j++){
            for(int i = 1 ; i <= 3;i++){
                if(j == i || j < i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
        }
    }