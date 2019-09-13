import java.util.Random;
import java.util.Arrays;

public class ex{
    public static void main (String[]args){
        int numValue = 20;
        int []score = rangeCount(numValue);
        int a = inRange(score,0,5);
        System.out.println(Arrays.toString(score));
        System.out.println(a);
    }
    public static int[]rangeCount(int size){
        Random random = new Random();
        int []a = new int [size];
        for(int i =0;i<a.length;i++){
            a[i] = random.nextInt(20);
        }
        return a;
    }
    public static int inRange(int[]a,int low,int high){
        int count=0;
        for (int i =0;i<a.length;i++){
            if(a[i] >= low&& a[i]<high){
                count++;
            }
        }
        return count;
    }
}