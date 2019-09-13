public class ex4{
    public static double print(double[]grades){
        for(double a : grades){
            System.out.print(a + " ");
        }
        return 1;
    }
    public static void main(String[]args){
        double []grades = {22.5,18.2,5.0};
        print(grades);
    }
}