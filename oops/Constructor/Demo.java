//package Encapsula;

class student {
    private int age;
    private String name;

    student (int age,String name){

            this.name = name;
            this.age = age;
    }
    
    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
}
public class Demo{
    public static void main(String[] args){

        student obj = new student(18, "Vansh" );
    
        
        String name = obj.getName();
        System.out.println(name);
    
        
        int stud1age = obj.getAge();//fetch kar rhe h by the use of getter
        System.out.println(stud1age);


    }
}