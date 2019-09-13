public class review6{
    public static void main (String[]args){
        for(int j = 1; j <= 5;j++){
            for(int i =1; i<= 5;i++){
                if(i==j || i+j==6){
                    System.out.print("X");
                }else if(i!=j){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}