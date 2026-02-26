class Basic2 {

    static Basic2 ob;

    String name1;
    String name2;
    String name3;

    private Basic2() {
        // private constructor
    }

    static Basic2 getObject() {
        if (ob == null) {
            ob = new Basic2();
        }
        return ob;
    }

    public static void main(String[] args) {

        Basic2 obj = Basic2.getObject();

        obj.name1 = "Dell";
        obj.name2 = "Lenovo";
        obj.name3 = "HP";

        System.out.println(obj.name1);
        System.out.println(obj.name2);
        System.out.println(obj.name3);

        Basic2 obj2 = Basic2.getObject();

        System.out.println(obj);
        System.out.println(obj2);
    }
}