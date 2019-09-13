public class ex35 {
    public static void main (String[]args){
        for(int j =1 ; j<=5 ;j++){
            for(int i=1 ; i <= 5; i++){
                if((i==j&& i<=1)||(i==j&& i>=5) || (i+j==6&& i>=5) || (i+j==6&& i<=1)){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println(" ");
        } 
    }
}