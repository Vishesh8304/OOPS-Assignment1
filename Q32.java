public class Q32 {

    private String make;
    private String model;
    private int year;

    // Zero-arguments constructor
   // public Car() {
     //   this.make = "Unknown";
     //   this.model = "Unknown";
      //  this.year = 0;
    //}

    // Parameterized constructor
    public Q32(String make, String model, int year) {
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
       

        //the parameterized constructor
        Q32 specificCar = new Q32("Toyota", "Corolla", 2022);
        System.out.println("Specific Car Details:");
        specificCar.displayDetails();
    }
}
