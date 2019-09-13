public class ex20{
    public static void main (String[]args){
        for(int j =1;j <= 6;j++){
            for(int i = 1; i <=6; i++){
                if(i==j){
                    System.out.print(i);
                }else if(i!=j){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}