//package Encapsula;

class student {
    private int age;
    private String name;

    public void setData(){
        age = 10;
        name = "Rahul";
    }
    public void show(){
        System.out.println(name + " " + age);
    }
}
public class Demo{
    public static void main(String[] args){

        student obj = new student();
        obj.setData();
        obj.show();


    }
}