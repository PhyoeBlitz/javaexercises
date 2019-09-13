public class traversingWeather{
    public static void main(String[]arg){
        double [] temForecast = {26.0,24.5,22.3};
        for (int i=0;i<temForecast.length;i++){
            if(temForecast[i]==24.5){
                System.out.print("Found the value "+temForecast[i]);
            }
        }
    }
}