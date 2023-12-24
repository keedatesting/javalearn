public class wrapperclass {
    
    public static void main(String[] args) {

        Integer i1 =Integer.valueOf("12345");  //wrapper class 

        Integer i2 =Integer.valueOf("101011",2); //wraper class
         int w =Integer.parseInt("12425"); // wrapper class
        
        for (int i = 0; i < args.length; i++) {
            System.out.println(args[i]); //have to give the argumetns through command line
        }
        int c = i2.intValue();
        System.out.println(i1);
        System.out.println(c);
        System.out.println(w);
    }
}