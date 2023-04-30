//package Encapsula;

class student {
    private int age;
    private String name;

    
    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public void show(){
        System.out.println(name+  " " + age);
    }
}
public class Demo{
    public static void main(String[] args){

        student obj = new student();
        student obj1 = new student();

        obj.setAge(25);
        obj1.setAge(18);


        obj.setName("Vansh");
        obj1.setName("SRV");

        obj.show();
        obj1.show();
        
        int stud1age = obj.getAge();//fetch kar rhe h by the use of getter
        System.out.println(stud1age);


    }
}