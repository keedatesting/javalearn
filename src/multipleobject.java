public class multipleobject {
    int x = 5;

  public static void main(String[] args) {
     multipleobject  myObj1 = new  multipleobject ();  // Object 1
     multipleobject  myObj2 = new multipleobject ();  // Object 2
    myObj2.x = 25;
    System.out.println(myObj1.x);  // Outputs 5
    System.out.println(myObj2.x);  // Outputs 25
  }
}
