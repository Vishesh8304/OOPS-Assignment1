class Q16 { 
    int hcf = 1;

    public void higComFact(int num1, int num2) {
        // Correct the loop condition to use &&
        for (int i = 1; i <= num1 && i <= num2; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                hcf = i; // Update the instance variable hcf
            }
        }
    }

    public static void main(String[] args) {
        Q19 obj = new Q19();
        obj.higComFact(24, 36); // Call the method to compute HCF

        // Print the HCF
        System.out.println("The HCF: " + obj.hcf);
    }
}

