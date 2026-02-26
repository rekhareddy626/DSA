public class StaticMethodscannotUseThis {
    int instanceVar=10;
    static void myMethod(){
        System.out.println(this.instanceVar);//instance cant access in static
    }
    
}
class Basic{
    public static void main(String[] args) {
        Basic ob=new Basic();
    }
}