package week1;

public class Vehical {
    private String type;
    private String make;
    private String model;
    private int releaseYear;

    public Vehical(){
    }

    public int getReleaseYear(){
        return this.releaseYear;
    }

    public void vroom(){
        System.out.println("Vehical Vroom");
    }
}
