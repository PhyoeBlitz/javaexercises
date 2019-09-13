public class ex24{
    public static void main(String[]args){
        for(int i =1; i<=14;i++){
            if(i%2==0 && i%7 ==0){
                System.out.print("PineApple ");
            }else if(i%2 ==0){
                System.out.print("Pine ");
            }else if(i%7==0){
                System.out.print("Apple ");
            }else{
                System.out.print(i + " ");
            }
        }
    }
    
}