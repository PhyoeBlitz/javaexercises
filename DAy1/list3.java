public class list3{
    public static void main(String[]args){
        String[]studentList ={"Kalam","Josei","Jani","Ahmed"};
        String name = "Kalam";
        search (studentList,name);
        
    }
    public static String search(String[]a,String value){
        String result="Found the student ";
        for(int i = 0; i < a.length;i++){
            if(a[i] == value){
                
                System.out.print ("Found the student : " + a[i]);
                //return "not found";
            }
        }
        return result;
    }
}