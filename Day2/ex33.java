public class ex33{
    public static void main (String[]args){
                for(int j = 1 ; j <= 5; j++){
                
                   for(int i = 1; i <= 9; i++){
                       if(( i+j  >1 && i+ j <= 5) || (i-j >= 5 && i-j <= 8)){
                           System.out.print(" ");
                        } else if (i == 5 || j== 5||(j-i >= 1 && j-i <= 4) ||( i+j  >=6 && i+ j <= 9) || ( i+j  >=10 && i+ j <= 12)){
                            System.out.print ("*");
                        }
                    }
                  System.out.println("");
                } 
             
    }
}
