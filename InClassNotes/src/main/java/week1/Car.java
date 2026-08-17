package week1;

public class Car extends Vehical {
    private int vinNumber;

    public Car(int vinNumber){
        this.vinNumber=vinNumber;
    }

    public int getVinNumber(){
        return vinNumber;
    }

    @Override
    public String toString(){
        return "Car{vinNumber=" + vinNumber + "}";
    }

    @Override
    public void vroom() {
        System.out.println("Car Vroom");
    }
}
