class Thing{
    private static int count=0;
    public static int getcount(){
        return count;
    }
    public Thing(){
        count++;
    }
    public static void main(String[]args){
        Thing thing1=new Thing();
        Thing thing2=new Thing();
        Thing thing3=new Thing();
        System.out.println("Total Things created:"+Thing.getcount());
    }
    
}