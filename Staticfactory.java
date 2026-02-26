 class Staticfactory {
    static String Username;
    static String Userrole;
    private Staticfactory(String name){
        Username=name;
        Userrole="ADMIN";
    
    }
    public static Staticfactory createAdmin(String name){
        return new Staticfactory(name) ;
    } 
    static void display(){
        System.out.println("User:"+Username+" Role:"+Userrole);

    }

    public static void main(String[] args) {
       Staticfactory .createAdmin("Alice");
       Staticfactory.display();
    }
}
