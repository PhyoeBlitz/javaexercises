public class EXE2{
    public static void main (String[]args){
        int [] numbers = {1,2,3,4,5};
        for(int x = 0; x <=4 ;x++){
            System.out.println("Number " + numbers[x] + " is " + numbers[x] );
        }
        for(int x = 0; x <=4 ;x++){
            if(x==0){
                System.out.print("{" + numbers[x]);
            }else if(x >0){
            System.out.print(","+numbers[x]);
        }
            if(x==4){
                System.out.print("}");
            }
        }
        System.out.print(numbers);
    }
}