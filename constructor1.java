import java.util.Scanner;
public class constructor1 {
    int laptop=100;
    constructor1(int value){
        System.out.println("int parameter");
    }
    constructor1(double num){
        this((int)num);
        System.out.println("double parameter");
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        constructor1 ob=new constructor1(50.6);
        System.out.println(ob.laptop);
    }
}