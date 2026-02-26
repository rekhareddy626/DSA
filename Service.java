class Service{
    static void process(Task t){
        System.out.println(t); //printing task object address

    }
    
}
class Task{
    static Task o=new Task(); //Reference varaibale as static
    static void start(){
        Service.process(o); //passing Task object address

    }
}
class Basic{
    public static void main(String[] args) {
        Task.start(); //calling static start method

    }

}
