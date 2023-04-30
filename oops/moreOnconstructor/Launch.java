//package moreOnconstructor;

class Demo{
    private int a;
    private int b;

    public Demo(){
        System.out.println("Zero parametrized constructor by programmar");
    }
    public Demo(int a,int b){
        this.a=a;
        this.b=b;

    }
    void disp(){
        System.out.println(a);
        System.out.println(b);
    }
}
public class Launch {
    public static void main(String[] args){
        Demo d  = new Demo();
        d.disp();


        Demo d2 = new Demo(10,20);
        d2.disp();

    }
}
