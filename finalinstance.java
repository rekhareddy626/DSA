public class finalinstance {
    final int ID;
    finalinstance(){
        ID=1;
    }
    public static void main(String[] args) {
        finalinstance ob=new finalinstance();
        System.out.println(ob.ID);
       // ob.ID(2);//exception as final cant be used further
       
    }
    
}
