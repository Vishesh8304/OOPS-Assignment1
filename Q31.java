public class Q31 {

    private String make;
    private String model;
    private int year;

    // Zero-arguments constructor
    public Q31() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.year = 0;
    }

    // Parameterized constructor
    public Q31(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayDetails() {
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
    }

    public static void main(String[] args) {
        // Create an instance using the zero-arguments constructor
        Q31 defaultCar = new Q31();
        System.out.println("Default Car Details:");
        defaultCar.displayDetails();

        System.out.println();

        // Create an instance using the parameterized constructor
        Q31 specificCar = new Q31("Toyota", "Corolla", 2022);
        System.out.println("Specific Car Details:");
        specificCar.displayDetails();
    }
}


