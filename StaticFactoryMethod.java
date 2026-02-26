class Laptop{
    private Laptop{

    }
    
}
class Basic extends Laptop{ //cant inherit class
    public static void main(String[] args) {
        Basic ob=new Basic();
        Laptop obj=new Laptop(); //cannot create object from other class
    }
}