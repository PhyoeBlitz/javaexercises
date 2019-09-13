import java.util.Arrays;
public class shopping{
    public static void main (String[]args){
        String[]shoppingList = {"Mango","Strawberry","banana","Avocado","Pineapple"};
        shopping(shoppingList);
    }
    
    public static void shopping(String[] a){
        System.out.println (Arrays.toString(a));
    }
}