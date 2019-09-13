public class list{
    public static void main(String[]args){
        String [] studentList ={"Kalam","Josei","Jani","Ahmed"};
        
        for(int i = 0;i < studentList.length;i++){
            if(studentList[i]=="Kalam"){
                System.out.print("Found Student : "+studentList[i]);
            }
        }
    }
}