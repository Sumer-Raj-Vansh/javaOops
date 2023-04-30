class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");

    }
    public void fly(){
        System.out.println("Aeroplane is fly");

    }
}
class CargoPlane extends Aeroplane{


}
class PassengerPlane extends Aeroplane
{

}
class Inheritance1{
    public static void main (String[] args){
        CargoPlane cp = new CargoPlane();
        cp.takeoff();
        cp.fly();
    }
}