class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");

    }
    public void fly(){
        System.out.println("Aeroplane is fly");

    }
}

    class CargoPlane extends Aeroplane{

        public void fly(){
            System.out.println("CargoPlane flies at lower height"); // overized method 
    
        }
    
    }
    class PassengerPlane extends Aeroplane
    {
        public void fly(){
            System.out.println("Passenger plane flies in medium height"); // oveized method
    
        }
    }
    class Inheritance1{
        public static void main (String[] args){
            CargoPlane cp = new CargoPlane();
            cp.takeoff();
            cp.fly();
        }
    }


class Inheritance2{
    public static void main (String[] args){
        CargoPlane cp = new CargoPlane();
        cp.takeoff();//inherit method
        cp.fly(); // overized method
        PassengerPlane pp  = new PassengerPlane();
        pp.fly(); // overized method
        pp.takeoff();//inherit method

    }
}