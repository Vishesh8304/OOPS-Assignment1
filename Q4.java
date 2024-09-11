public class Q4 
{

         void swapByValue(int a, int b) {
          int temp = a;
            a = b;
            b = temp;
            System.out.println("After Swapping By value"+ a + b ); 
        }
    
        // Method to swap numbers by reference
        void swapByReference(int &a, int &b) {
            int temp = a;
            a = b;
            b = temp;
            System.out.println("After Swapping by Reference"+ a + b ); 
        }    
    public static void main(String[] args) {
     
        int x = 5, y = 10;
        System.out.println("Original Value"+ x +""+ y); 
        Q4 obj=new obj();
        // Swap by value
        obj.swapByValue(x, y);
        System.out.println("After Swapping"+ x +""+ y ); 
    
        // Swap by reference
        Q4.swapByReference(x, y);
        System.out.println("After Swapping by refernce "+ x +""+ y ); 
    }
}