import java.util.Scanner;

class Parameter {
    Parameter(){

    }
    Parameter(double amount) {
        System.out.println("Amount: " + amount);
    }
    Parameter(int amount, int gst) {
        System.out.println(amount);
        System.out.println("double");

    }
    Parameter(String amount, int gst) {
        System.out.println(amount+gst);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Parameter ob = new Parameter(100);
        Parameter ob1 = new Parameter(100.34);
      
    }
}