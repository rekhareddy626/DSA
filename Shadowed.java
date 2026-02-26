public class Shadowed {
    String name="parent";
    
}
class Child extends Shadowed{
    String name="Child";
    void display(){
        System.out.println(name); //child
        System.out.println(this.name); //child
        System.out.println(super.name); //parent
    }
}
class Basic{
    public static void main(String[] args) {
        Child ob=new Child();
        ob.display();
    }
}
