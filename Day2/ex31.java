public class ex31{
    public static void main (String[]args){
        for(int j =1 ;j<=3;j++){
            for(int i = 1; i <= 3;i++){
                if( i + j == 4 || i+j ==5 ||i+j ==6){
                System.out.print("*");
            }else if(i + j != 4 || i+j !=5 ||i+j !=6){
                System.out.print(" ");
            }
        }
            System.out.println("");
        }
    }
}