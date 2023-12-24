class test1
{
   static void method2()
   {
    System.out.println("printing second method");
   }
}




public class static1 {
    int x; // instance variable
    static int y; // static variable
    static void method1()
    {
        System.out.println("print method 1");
    }

    static class testing
{
    public static String country="INDIA";
}
    public static void main(String[] args) {

        static1 stat = new static1();
        static1 obj2  = new static1();
        System.out.println(stat.x=5);
        System.out.println(obj2.x=56);
        method1();  
       
        System.out.println(static1.y=78); //call directly as it is static function
        test1.method2();

        System.out.println(static1.testing.country);  //calling static class

    }
}
