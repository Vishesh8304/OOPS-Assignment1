import java.util.Scanner;

class Commission {
    private double sales;

    public Commission(double sales) {
        this.sales = sales;
    }

    public double commission() {
        return sales * 0.10; // Example commission calculation: 10% of sales
    }
}

public class Q33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter sales amount: ");
        double sales = sc.nextDouble();
        sc.close();

        if (sales < 0) {
            System.out.println("Invalid Input");
        } else {
            Commission commission = new Commission(sales);
            System.out.println("Commission: " + commission.commission());
        }
    }
}
