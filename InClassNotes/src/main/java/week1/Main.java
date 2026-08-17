package week1;


class Main {
	
    public static void main(String[] args) {
        test();
        Vehical v1 = new Vehical();
        Car c1 = new Car(0012323);
        Vehical v2 = new Car(123112);

        v1.vroom();
        v2.vroom();

        // Simple try-catch example that triggers an exception
        try {
            int x = 10 / 0; // This will throw ArithmeticException
            System.out.println("Result: " + x);
        } catch (Exception e) {
            System.out.println("Caught an exception: " + e.getMessage());
        }
    }

    public static void test(){
        System.out.println("Hello world");
    }

    

}