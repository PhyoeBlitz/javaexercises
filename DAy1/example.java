import java.util.Arrays;
public class example{
    public static void main(String[]args){
        String[]grades = {"mango","strawberry","grapes"};
        String[]scores = Arrays.copyOf(grades,4);
        
        System.out.print(Arrays.toString(scores));
    }
}