//package Encapsula;

class student {
    private int age;
    private String name;

    public void setData(int age){
       this.age = age;
        
        
    }
    public void setData1(String name){
        this.name = name;
    }
    public void show(){
        System.out.println(name + " " + age);
    }
}
public class Demo{
    public static void main(String[] args){

        student obj = new student();
        student obj1 = new student();

        obj.setData(25);
        obj1.setData(18);


        obj.setData1("Vansh");
        obj1.setData1("SRV");

        obj.show();
        obj1.show();



    }
}