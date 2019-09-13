public class score{
    public static void main(String[]args){
        double[]grades = {98.2,22.9,30.0};
        double[]scores = new double[3];
        for(int i = 0;i<=2;i++){
            scores[i]=grades[i];
            System.out.print(scores[i] +" ");
        }
    }
}