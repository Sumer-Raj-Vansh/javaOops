class Aeroplane{
    public void takeoff(){
        System.out.println("Aeroplane is taking off");

    }
    public void fly(){
        System.out.println("Aeroplane is fly");

    }
}

    class CargoPlane extends Aeroplane{ // suno cargo plane cllass me ek takeoff method parent class ka h aur fly method bhi diya parent ne but child class(cargoPlane ne ) usko overized kar diya toh ek overized method ho gya ek ek specialize method h (joh sirf child class me h na ki parent class me h toh kull 3 method h okkkkk)

        public void fly(){
            System.out.println("CargoPlane flies at lower height"); // overized method 
    
        }
        public void carryGoods(){ // specilized method 
            System.out.println("CargoPlane carries good"); // ;
        }
    
    }
    class PassengerPlane extends Aeroplane // yah bhi 3 methid h buss 
    {
        public void fly(){
            System.out.println("Passenger plane flies in medium height"); // oveized method
    
        }
        public void carryPassenger(){
            System.out.println("Passenger carries passenger");
        }
    }
    

class Inheritance3{
    public static void main (String[] args){
        CargoPlane cp = new CargoPlane();
        cp.takeoff();//inherit method
        cp.fly(); // overized method
        cp.carryGoods();//specialized method 


        PassengerPlane pp  = new PassengerPlane();
        pp.fly(); // overized method
        pp.takeoff();//inherit method
        pp.carryPassenger();//specialized method 

    }
}