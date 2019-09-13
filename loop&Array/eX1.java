import java.util.Arrays;
public class eX1{
    public static void main(String[]args){
        double[]a = {1,2,3};
        powArray(a,2);
        
        //Setion 2
        int[]b = {1,1,2,4,5,5,6,6,6,99};
        System.out.print(Arrays.toString(histogram(b)));
    }
    public static double powArray(double[]a,double value){
    for (int i = 0; i < a.length; i++) {
       double[]aSquared = new double[a.length];
       aSquared[i] = Math.pow(a[i], value);
       System.out.println(aSquared[i] + " ");
    }
    return 1;
    }
    public static int []histogram(int[] scores){
        int[] counts = new int[100];
           for (int i = 0;i<scores.length;i++) {
              int index = scores[i];
              
              counts[index]++;
              //if(
           }
           
           return counts;
    }
    
}