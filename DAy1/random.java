import java.util.Random;
import java.util.Arrays;
public class random{
    public static void main(String[]args){
        int numValue = 50;
        int []a = randomArray(numValue);
        System.out.print(Arrays.toString(a));
    }
    public static int[]randomArray(int size){
        Random random = new Random();
        int []a = new int[size];
        for (int i =0;i<a.length;i++){
            a [i] = random.nextInt(100);
        }
        return a;
    }
}