class Human1
{
    private String name ;
    int age;

    Human1(){

        System.out.println("Human class constructor");

    }
    void sleep(){
        age = 18;
        System.out.println("Human needs good sleep");
        System.out.println(age);
    }
}
class Student1 extends Human1{
    // public Student1(){
        //super();

    // }

    void disp(){
        System.out.println("The age is : " + age);
        // System.out.println("The nae is :" + name ); private h so not participate in inheritance(private apni class tk access rehte h)
    }
}

public class Inheritance2{
    public static void main(String[] aargs){
    Student1 st1 = new Student1();
    st1.sleep();
    st1.disp();

}
}