public class list2{
    public static void main (String[]args){
        String [] studentList ={"Kalam","Josei","Jani","Ahmed","San"};
        
        for (int i = 0; i< studentList.length;i++){
            String name ="San";
            if(studentList[i]==name){
                System.out.print("Found Student : "+studentList[i]);
            }else if(studentList[i]!=name){
                System.out.print(name +" doesn't exit");
            }else{
                System.out.print("");
            }
        }
    }
}