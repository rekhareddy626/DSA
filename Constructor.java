import java.util.Scanner;
class Constructor {
    int laptop=100;
    Constructor(){
        System.out.println(laptop);

    }
    Constructor(int laptop){
        System.out.println(this.laptop); //ob.laptop
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        Constructor ob=new Constructor(200);
        System.out.println(ob.laptop);
       // Constructor obj=new Constructor();

    }
    
}
